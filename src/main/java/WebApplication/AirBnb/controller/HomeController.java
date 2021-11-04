package WebApplication.AirBnb.controller;
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

import WebApplication.AirBnb.domain.NguoiDung;
import WebApplication.AirBnb.domain.Quyen;
import WebApplication.AirBnb.domain.TaiKhoan;
import WebApplication.AirBnb.model.NguoiDungDTO;
import WebApplication.AirBnb.model.TaiKhoanDTO;
import WebApplication.AirBnb.model.User_AccountDTO;
import WebApplication.AirBnb.service.TaiKhoanBLL;
import WebApplication.AirBnb.service.impl.NguoiDungServiceImpl;



@Controller
public class HomeController{
	@Autowired
	TaiKhoanBLL taiKhoanService;
	@Autowired
	NguoiDungServiceImpl nguoiDungService;
	@Autowired
	private HttpSession session;
	@GetMapping(value = "")
	private String index(Model model) {
		model.addAttribute("useracc", new User_AccountDTO());
		model.addAttribute("account", new TaiKhoanDTO());
		return "index";
	}
	
	@RequestMapping(value = "/dang-nhap", method = RequestMethod.POST)
	public String login(@ModelAttribute("account") TaiKhoanDTO account, Model model) {
		
		//model.addAttribute("account", new TaiKhoanDTO());
		User_AccountDTO useracc = new User_AccountDTO();
		useracc = taiKhoanService.login(account);
		if (useracc != null)
			model.addAttribute("statusLog","Đăng nhập thành công!");
		else
			model.addAttribute("statusLog", "Sai mật khẩu hoặc tài khoản không tồn tại");
		return "redirect:/";
	}
	
	@RequestMapping(value = "/dang-ki", method = RequestMethod.POST)
	public String register(@ModelAttribute("useracc") User_AccountDTO useracc, Model model) {
		boolean isSuccess = taiKhoanService.register(useracc);
		if (isSuccess == true)
			model.addAttribute("statusReg","Đăng kí tài khoản thành công!");
		else {
			model.addAttribute("statusReg", "Đăng kí tài khoản thất bại, tài khoản này đã tồn tại!");
			//return "index";
		}
		return "redirect:/";
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
