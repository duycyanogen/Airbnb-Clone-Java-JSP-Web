package WebApplication.AirBnb.controller;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import WebApplication.AirBnb.domain.Users;
import WebApplication.AirBnb.domain.Roles;
import WebApplication.AirBnb.domain.Accounts;
import WebApplication.AirBnb.model.UserDto;
import WebApplication.AirBnb.model.AccountDto;
import WebApplication.AirBnb.model.UserAccDto;
import WebApplication.AirBnb.service.IAccountService;
import WebApplication.AirBnb.service.impl.UserServiceImpl;
import WebApplication.AirBnb.service.impl.AccountServiceImpl;

@Controller
public class HomeController {
	@Autowired
	AccountServiceImpl accountService;
	@Autowired
	UserServiceImpl userService;
	@Autowired
	private HttpSession session;

	@GetMapping(value = "")
	private String index(Model model) {
		model.addAttribute("useracc", new UserAccDto());
		model.addAttribute("account", new AccountDto());
		return "index";
	}

	@GetMapping(value = "thong-tin-ca-nhan")
	private String UserInfo(Model model) {
		UserAccDto objUserAccDto = (UserAccDto) session.getAttribute("LoginInfor");
		model.addAttribute("objUserAccDto", objUserAccDto);
		return "account/accountinfo";
	}

	@GetMapping(value = "trang-chu")
	private String home(Model model) {
		model.addAttribute("useracc", new UserAccDto());
		model.addAttribute("account", new AccountDto());
		return "index";
	}

	@RequestMapping(value = "/dang-nhap", method = RequestMethod.POST)
	public ModelAndView Login(HttpSession session, @ModelAttribute("account") AccountDto account, ModelMap model) {
		model.addAttribute("useracc", new UserAccDto());
		model.addAttribute("account", new AccountDto());
		UserAccDto useracc = new UserAccDto();
		useracc = accountService.login(account);
		if (useracc != null) {
			session.setAttribute("LoginInfor", useracc);
			return new ModelAndView("redirect:/", model);
		} else {
			model.remove("showFormRegis");
			model.addAttribute("showOverlay", "true");
			model.addAttribute("showFormLogin", "true");
			model.addAttribute("failtureLoginMessage",
					"Tên đăng nhập hoặc mật khẩu không chính xác, vui lòng kiểm tra lại!");
		}

		return new ModelAndView("index", model);
	}

	@Autowired
	ServletContext context;

	@RequestMapping(value = "/dang-ki", method = RequestMethod.POST)
	public ModelAndView Register(ModelMap model, @Validated @ModelAttribute("useracc") UserAccDto useracc,
			BindingResult errors, @RequestParam("image") MultipartFile image) {
		if (!image.isEmpty()) {
			try {
				String photoPath = context.getRealPath("/avatarimage/" + image.getOriginalFilename());
				image.transferTo(new File(photoPath));
				useracc.setAvatar(image.getOriginalFilename());
				System.out.println(useracc.getAvatar());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		model.addAttribute("useracc", new UserAccDto());
		model.addAttribute("account", new AccountDto());
		System.out.println(errors.getAllErrors());
		if (!errors.hasErrors()) {
			System.out.println(errors.getAllErrors());
			System.out.println(useracc.getAvatar());
			boolean isSuccess = accountService.register(useracc);
			if (isSuccess == true) {
				model.addAttribute("statusReg", "Đăng kí tài khoản thành công!");
				return new ModelAndView("redirect:/", model);
			} else {
				model.remove("showFormLogin");
				model.addAttribute("showOverlay", "true");
				model.addAttribute("showFormRegis", "true");
				model.addAttribute("validatedRegis", true);
				errors.rejectValue("mail", "useracc", "Đăng kí tài khoản thất bại, tài khoản này đã tồn tại!");
				// model.addAttribute("statusReg", "Đăng kí tài khoản thất bại, tài khoản này đã
				// tồn tại!");
				return new ModelAndView("index", errors.getModel());
				// return "index";
			}
		} else {
			model.remove("showFormLogin");
			model.addAttribute("showOverlay", "true");
			model.addAttribute("showFormRegis", "true");
		}

		return new ModelAndView("index", errors.getModel());
	}

	@RequestMapping(value = "dang-xuat", method = RequestMethod.GET)
	public String Logout(HttpSession session, HttpServletRequest request) {
		session.removeAttribute("LoginInfor");
		return "redirect:" + request.getHeader("Referer");
	}
	
	@PostMapping(value = "updateInfo")
	private String home(@ModelAttribute("objUserAccDto") UserAccDto objUserAccDto) {
		UserAccDto objUserAccDtoSession = (UserAccDto) session.getAttribute("LoginInfor");
		Users objUsers = userService.findByEmail(objUserAccDtoSession.getMail());
		objUsers.setName(objUserAccDto.getName());
		objUsers.setSex(objUserAccDto.getSex());
		objUsers.setDateOfBirth(objUserAccDto.getDateOfBirth());
		objUsers.setPhoneNumber(objUserAccDto.getPhoneNumber());
		objUsers.setAddress(objUserAccDto.getAddress());
		userService.save(objUsers);
		return "redirect:/thong-tin-ca-nhan";
	}

}
