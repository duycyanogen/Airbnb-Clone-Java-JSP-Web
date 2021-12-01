package WebApplication.AirBnb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.bytebuddy.utility.RandomString;


@Controller
@RequestMapping("")
public class ForgotPasswordController {
	
	@GetMapping("/forgot_password")
	public String showForgotPasswordForm(Model model) {
		model.addAttribute("pageTitle","Forgot password");
		return "account/forgot_password_form";
	}
	
	@PostMapping(value="/forgot_password")
//	@RequestMapping(value = "/forgot_password", method = RequestMethod.POST)
	public String processForgotPasswordForm(HttpServletRequest r) {
		String email = r.getParameter("email");
		String token = RandomString.make(45);
		
		System.out.println("Email: " + email);
		System.out.println("Token: " + token);
		
		return "account/forgot_password_form";
	}
}
