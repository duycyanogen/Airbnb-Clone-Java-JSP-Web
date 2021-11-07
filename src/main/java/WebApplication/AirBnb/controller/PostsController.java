package WebApplication.AirBnb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import WebApplication.AirBnb.domain.Accounts;
import WebApplication.AirBnb.domain.Posts;
import WebApplication.AirBnb.model.AccountDto;
import WebApplication.AirBnb.model.PostDto;
import WebApplication.AirBnb.model.UserAccDto;
import WebApplication.AirBnb.repository.AccountRepository;
import WebApplication.AirBnb.service.impl.PostServiceImpl;



@Controller
@RequestMapping("danh-sach-tin")
public class PostsController {
	@Autowired
	PostServiceImpl service;
	
	@GetMapping("/{IDTin}")
	private String postdetails(ModelMap model, @PathVariable("IDTin") Long IDTin) {
		
		return "posts/postDetails";
	}	
	
	@GetMapping("add")
	private String add(Model model) {
		model.addAttribute("post",new PostDto());
		return "post/AddOrEdit";
	}
	
	@GetMapping("edit/{IDTin}")
	private ModelAndView edit(ModelMap model, @PathVariable("IDTin") Long IDTin) {
		Optional<Posts> opt = service.findById(IDTin);
		PostDto dto = new PostDto();
		if (opt.isPresent())
		{
			Posts entity = opt.get();
			BeanUtils.copyProperties(entity, dto);
			return new ModelAndView("posts/AddOrEdit",model);
		}
		model.addAttribute("message", "Tin này không còn tồn tại!");
		return new ModelAndView("redirect:/post",model);
	}
	
	@GetMapping("delete/{IDTin}")
	private String delete() {
		return "redirect:/post";
	}
	
	@GetMapping("saveOrUpdate")
	private ModelAndView saveOrUpdate(ModelMap model, PostDto dto) {
		Posts entity = new Posts();
		BeanUtils.copyProperties(dto, entity);
		service.save(entity); 
		return new ModelAndView("redirect:/post",model);
	}
	
	@GetMapping("search")
	public String search() {
		return "posts/search";
	}
	
	@GetMapping("")
	public String listPost(ModelMap model) {
		//List<Posts> list = service.findAll();
		//model.addAttribute("posts",list);
		model.addAttribute("useracc", new UserAccDto());
		model.addAttribute("account", new AccountDto());
		return "posts/posts";
	}
	
	
	
}
