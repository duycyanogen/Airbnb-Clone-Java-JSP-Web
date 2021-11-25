package WebApplication.AirBnb.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import WebApplication.AirBnb.domain.BedTypes;
import WebApplication.AirBnb.domain.Locations;
import WebApplication.AirBnb.domain.RoomTypes;
import WebApplication.AirBnb.domain.Services;
import WebApplication.AirBnb.model.AccountDto;
import WebApplication.AirBnb.model.PostDto;
import WebApplication.AirBnb.model.UserAccDto;
import WebApplication.AirBnb.service.IPostService;
import WebApplication.AirBnb.service.impl.BedTypeServiceImpl;
import WebApplication.AirBnb.service.impl.LocationServiceImpl;
import WebApplication.AirBnb.service.impl.RoomTypeServiceImpl;
import WebApplication.AirBnb.service.impl.ServiceServiceImpl;



@Controller
@RequestMapping("danh-sach-tin")
public class PostsController {
	@Autowired
	IPostService postService;
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
	@Autowired
	ServletContext context;
	@RequestMapping(value = "/luu-tin", method = RequestMethod.POST)	
	public ModelAndView save(HttpSession session, ModelMap model, @Validated @ModelAttribute("post") PostDto post,
			BindingResult errors, @RequestParam("img1") MultipartFile img1,
			@RequestParam("img2") MultipartFile img2, @RequestParam("img3") MultipartFile img3,
			@RequestParam("img4") MultipartFile img4, @RequestParam("img5") MultipartFile img5) {
		if (!img1.isEmpty() && !img2.isEmpty() && !img3.isEmpty() && !img4.isEmpty()  && !img5.isEmpty()) {
			try {
				String photoPath = context.getRealPath("/roomimage/" + img1.getOriginalFilename());
				img1.transferTo(new File(photoPath));
				post.setImage1(img1.getOriginalFilename());
				
				photoPath = context.getRealPath("/roomimage/" + img2.getOriginalFilename());
				img2.transferTo(new File(photoPath));
				post.setImage2(img2.getOriginalFilename());
				photoPath = context.getRealPath("/roomimage/" + img3.getOriginalFilename());
				img3.transferTo(new File(photoPath));
				post.setImage3(img3.getOriginalFilename());
				photoPath = context.getRealPath("/roomimage/" + img4.getOriginalFilename());
				img4.transferTo(new File(photoPath));
				post.setImage4(img4.getOriginalFilename());
				photoPath = context.getRealPath("/roomimage/" + img5.getOriginalFilename());
				img5.transferTo(new File(photoPath));
				post.setImage5(img5.getOriginalFilename());
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		UserAccDto objUserAccDto = (UserAccDto) session.getAttribute("LoginInfor");
		post.setAccountId(objUserAccDto.getAccountId());
		model.addAttribute("post",new PostDto());
		model.addAttribute("useracc", new UserAccDto());
		model.addAttribute("account", new AccountDto());
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
		System.out.println(errors.getAllErrors());
		if (!errors.hasErrors()) {
			
			boolean isSuccess = postService.postAdd(post);
			if (isSuccess == true) {
				model.addAttribute("statusReg", "Đăng tin thành công!");
				return new ModelAndView("redirect:/danh-sach-tin", model);
			} else {
				//model.addAttribute("post",new PostDto());
				
				return new ModelAndView("posts/postadd", errors.getModel());
			}
		} else {
			model.remove("showFormLogin");
			model.addAttribute("showOverlay", "true");
			model.addAttribute("showFormRegis", "true");
		}

		return new ModelAndView("posts/postadd", errors.getModel());
				
	}
	@GetMapping("search")
	public String search() {
		return "posts/search";
	}
	
	@GetMapping("")
	public String listPost(ModelMap model) {
		//List<Posts> list = service.findAll();
		//model.addAttribute("posts",list);
		List<PostDto> lstPosts = postService.getAllPost();		
		model.addAttribute("posts", lstPosts);
		model.addAttribute("useracc", new UserAccDto());
		model.addAttribute("account", new AccountDto());
		return "posts/posts";
	}
	
	
	
}
