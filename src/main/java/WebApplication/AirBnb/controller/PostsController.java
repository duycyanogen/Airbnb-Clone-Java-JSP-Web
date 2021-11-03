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

import WebApplication.AirBnb.domain.TaiKhoan;
import WebApplication.AirBnb.domain.Tin;
import WebApplication.AirBnb.model.TinDTO;
import WebApplication.AirBnb.repository.TaiKhoanDAO;
import WebApplication.AirBnb.service.impl.TinServiceImpl;



@Controller
@RequestMapping("posts")
public class PostsController {
	@Autowired
	TinServiceImpl service;
	
	@GetMapping("post")
	private String postdetails(ModelMap model, @PathVariable("IDTin") Long IDTin) {
		
		return "posts/postDetails";
	}	
	
	@GetMapping("add")
	private String add(Model model) {
		model.addAttribute("post",new TinDTO());
		return "post/AddOrEdit";
	}
	
	@GetMapping("edit/{IDTin}")
	private ModelAndView edit(ModelMap model, @PathVariable("IDTin") Long IDTin) {
		Optional<Tin> opt = service.findById(IDTin);
		TinDTO dto = new TinDTO();
		if (opt.isPresent())
		{
			Tin entity = opt.get();
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
	private ModelAndView saveOrUpdate(ModelMap model, TinDTO dto) {
		Tin entity = new Tin();
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
		List<Tin> list = service.findAll();
		model.addAttribute("posts",list);
		return "posts/list";
	}
	
	
	
}
