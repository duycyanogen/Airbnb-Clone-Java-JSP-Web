package WebApplication.AirBnb.controller;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import WebApplication.AirBnb.model.TaiKhoanDTO;
import WebApplication.AirBnb.service.impl.TaiKhoanServiceImpl;



@Controller
@RequestMapping("/home")
public class HomeController {
	@Autowired
	TaiKhoanServiceImpl service;
	@Autowired
	private HttpSession session;
	@RequestMapping("")
	private String index() {
		return "index";
	}
	
	@GetMapping("login")
	public String login1(ModelMap model) {
		model.addAttribute("account", new TaiKhoanDTO());
		return "index";
	}
	
	@PostMapping("login")
	public ModelAndView login(ModelMap model, @ModelAttribute("account") TaiKhoanDTO taikhoan, BindingResult result) {
		model.addAttribute("account", new TaiKhoanDTO());
		return new ModelAndView("index",model);
	}
	
	@RequestMapping("login")
	private String login(Model model) {	
		model.addAttribute("Accounts",service.findById(1l).get().getMail());
		return "index2";
	}
}
