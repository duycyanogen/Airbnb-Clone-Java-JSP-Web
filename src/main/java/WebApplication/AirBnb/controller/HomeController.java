package WebApplication.AirBnb.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import WebApplication.AirBnb.dao.TaiKhoanDAO;
import WebApplication.AirBnb.model.TaiKhoan;



@Controller

public class HomeController {
	@Autowired
	TaiKhoanDAO taiKhoanDAO;
	
	
	
	@RequestMapping("/home")
	private String getAccounts(Model model) {
		TaiKhoan tk = new TaiKhoan();
		
		model.addAttribute("Accounts",taiKhoanDAO.findById(1l).get().getMail());
		return "index2";
	}
}
