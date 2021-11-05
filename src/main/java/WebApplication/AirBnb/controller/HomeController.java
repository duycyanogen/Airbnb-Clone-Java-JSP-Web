package WebApplication.AirBnb.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
public class HomeController{
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
	
	@RequestMapping(value = "/dang-nhap", method = RequestMethod.POST)
	public ModelAndView Login(HttpSession session, @ModelAttribute("account") AccountDto account, ModelMap model) {
		
		//model.addAttribute("account", new TaiKhoanDTO());
		UserAccDto useracc = new UserAccDto();
		useracc = accountService.login(account);
		if (useracc != null)
		{
			//model.addAttribute("statusLog","Đăng nhập thành công!");
			session.setAttribute("LoginInfor", useracc);
		}
		else
			model.addAttribute("statusLog", "Sai mật khẩu hoặc tài khoản không tồn tại");
		//model.addAttribute("useracc", new User_AccountDTO());
		//model.addAttribute("account", new TaiKhoanDTO());
		return new ModelAndView("redirect:/",model);
	}
	
	@RequestMapping(value = "/dang-ki", method = RequestMethod.POST)
	public ModelAndView Register(@ModelAttribute("useracc") UserAccDto useracc, ModelMap model) {
		boolean isSuccess = accountService.register(useracc);
		model.addAttribute("useracc", new UserAccDto());
		model.addAttribute("account", new AccountDto());
		if (isSuccess == true)
			model.addAttribute("statusReg","Đăng kí tài khoản thành công!");
		else {
			model.addAttribute("statusReg", "Đăng kí tài khoản thất bại, tài khoản này đã tồn tại!");
			return new ModelAndView("redirect:/",model);
			//return "index";
		}
		
		return new ModelAndView("index",model);
	}
	
	@RequestMapping(value = "dang-xuat", method = RequestMethod.GET)
	public String Logout(HttpSession session, HttpServletRequest request)
	{
		session.removeAttribute("LoginInfor");
		return "redirect:"+request.getHeader("Referer");
	}
	
//	@PostMapping("login")
//	public ModelAndView login(ModelMap model, @ModelAttribute("account") TaiKhoanDTO taikhoan, BindingResult result) {
//		model.addAttribute("account", new TaiKhoanDTO());
//		return new ModelAndView("index",model);
//	}
	
//	@RequestMapping("login")
//	private String login(Model model) {	
//		model.addAttribute("Accounts",service.findById(1l).get().getMail());
//		return "index2";
//	}
}
