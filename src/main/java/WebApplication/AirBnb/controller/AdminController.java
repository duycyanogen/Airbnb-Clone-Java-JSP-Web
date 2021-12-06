package WebApplication.AirBnb.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import WebApplication.AirBnb.domain.Accounts;
import WebApplication.AirBnb.domain.Services;
import WebApplication.AirBnb.model.AccountDto;
import WebApplication.AirBnb.repository.AccountRepository;
import WebApplication.AirBnb.service.impl.AccountServiceImpl;
import net.bytebuddy.utility.RandomString;

@Controller
@RequestMapping("admin")
public class AdminController {

	
	@Autowired
	AccountServiceImpl accountService;
	
	@RequestMapping(value = {"danh-sach-nguoi-dung",""}, method = RequestMethod.GET)
	public String users()
	{
		return "admin/users";
	}
	
	@RequestMapping(value = "danh-sach-loai-phong", method = RequestMethod.GET)
	public String roomTypes()
	{
		return "admin/roomtypes";
	}
	
	@RequestMapping(value = "danh-sach-loai-giuong", method = RequestMethod.GET)
	public String bedTypes()
	{
		return "admin/bedtypes";
	}
	
	@RequestMapping(value = "danh-sach-dich-vu", method = RequestMethod.GET)
	public String services()
	{
		return "admin/services";
	}
	
	@RequestMapping(value = "danh-sach-dia-diem", method = RequestMethod.GET)
	public String locations()
	{
		return "admin/locations";
	}
	
	@RequestMapping(value = "danh-sach-icon", method = RequestMethod.GET)
	public String icons()
	{
		return "admin/icons";
	}

}
