package WebApplication.AirBnb.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import WebApplication.AirBnb.domain.Accounts;
import WebApplication.AirBnb.domain.BedTypes;
import WebApplication.AirBnb.domain.Locations;
import WebApplication.AirBnb.domain.Posts;
import WebApplication.AirBnb.domain.RoomTypes;
import WebApplication.AirBnb.domain.Services;
import WebApplication.AirBnb.model.AccountDto;
import WebApplication.AirBnb.model.BedTypeDto;
import WebApplication.AirBnb.model.PostDto;
import WebApplication.AirBnb.model.UserAccDto;
import WebApplication.AirBnb.repository.AccountRepository;
import WebApplication.AirBnb.service.impl.BedTypeServiceImpl;
import WebApplication.AirBnb.service.impl.LocationServiceImpl;
import WebApplication.AirBnb.service.impl.PostServiceImpl;
import WebApplication.AirBnb.service.impl.RoomTypeServiceImpl;
import WebApplication.AirBnb.service.impl.ServiceServiceImpl;



@Controller
@RequestMapping("danh-sach-tin")
public class PostsController {
	@Autowired
	PostServiceImpl postService;
	@Autowired
	RoomTypeServiceImpl roomTypeService;
	@Autowired
	BedTypeServiceImpl bedTypeService;
	@Autowired
	ServiceServiceImpl serviceService;
	@Autowired
	LocationServiceImpl locationService;
	
	@GetMapping("/{IDTin}")
	private String postdetails(ModelMap model, @PathVariable("IDTin") Long IDTin) {
		
		return "posts/postDetails";
	}	
	
	@GetMapping("dang-tin")
	private String add(Model model) {
		model.addAttribute("post",new PostDto());
		List<BedTypes> lstBedTypes = new ArrayList<BedTypes>();
		lstBedTypes = bedTypeService.findAll();
		List<RoomTypes> lstRoomTypes = new ArrayList<RoomTypes>();
		lstRoomTypes = roomTypeService.findAll();
		List<Services> lstServices = new ArrayList<Services>();
		lstServices = serviceService.findAll();
		List<Locations> lstLocations = new ArrayList<Locations>();
		lstLocations = locationService.findAll();
		model.addAttribute("lstBedTypes",lstBedTypes);
		model.addAttribute("lstRoomTypes",lstRoomTypes);
		model.addAttribute("lstServices",lstServices);
		model.addAttribute("lstLocations",lstLocations);
		return "posts/postadd";
	}
	
	@RequestMapping(value = "/luu-tin", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("post") PostDto post, ModelMap model) {
		
		return new ModelAndView("index", model);
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
