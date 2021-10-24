package WebApplication.AirBnb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import WebApplication.AirBnb.dao.TaiKhoanDAO;
import aj.org.objectweb.asm.Attribute;


@Controller

public class HomeController {
	@Autowired
	TaiKhoanDAO taiKhoanDAO;
	

	@RequestMapping("home")
	private String getAccounts(Model model) {
		//model.addAttribute("Accounts",taiKhoanDAO.findAll());
		return "index2";
	}
}
