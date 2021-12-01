package WebApplication.AirBnb.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
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
//@RequestMapping("")
public class ForgotPasswordController {

	@Autowired
	AccountServiceImpl accountService;

	@Autowired
	SessionFactory factory;

	@Autowired
	JavaMailSender mailer;

	@RequestMapping(value = "forgot-pass", method = RequestMethod.GET)
	public String forgotPassword(ModelMap model) {
		return "account/forgot-pass";
	}

	@RequestMapping(value = "forgot-pass", method = RequestMethod.POST)
	public String processForgotPassword(ModelMap model, HttpServletRequest re) {
		
		Session s = factory.openSession();
		Transaction t = s.beginTransaction();
		boolean check = true;
		
		String email = re.getParameter("email");
		
		Accounts ac = new Accounts();
		ac = accountService.getAccountByMail(email);
		
		/// random sinh số có 6 chữ số
		int random = (int) Math.floor(((Math.random() * 899999) + 100000));
		String newPassword = String.valueOf(random);
		String mailgui;
		mailgui = ac.getMail();
		ac.setPassword(newPassword);
		s.update(ac);
		check = false;
		
		/// update vào sql
		t.commit();
		
		// Tạo date để gưi
		Date date = new Date();
		String from = "drakeshop465@gmail.com";
		String to = mailgui;
		String subject = "Quên mật khẩu";
		String body = "Bạn đã báo quên mật khẩu vào " + date + "  mật khẩu mới của bạn là " + newPassword
				+ "\n Nếu bạn không thực hiện yêu cầu trên , vui lòng liên hệ quản trị viên ngay";
		try {
			System.out.println("tạo mail mailer");
			// tạo mail

			MimeMessage mail = mailer.createMimeMessage();

			// gọi lớp trợ giúp
			System.out.println("trợ giúp");
			MimeMessageHelper helper = new MimeMessageHelper(mail);
			System.out.println("new");
			helper.setFrom(from, from);
			helper.setTo(to);
			helper.setReplyTo(from, from);
			helper.setSubject(subject);
			helper.setText(body, true);
			mailer.send(mail);
			System.out.println("gửi");
			model.addAttribute("tinnhan", "Mật khẩu mới đã gửi đến email của bạn");
		} catch (Exception ex) {
			model.addAttribute("tinnhan", "gửi mail thất bại");
			t.rollback();
		} finally {
			s.close();
		}

		if (check == true) {
			model.addAttribute("tinnhan", "Tài khoản không tồn tại");
		}

		return "account/forgot-pass";
	}
}
