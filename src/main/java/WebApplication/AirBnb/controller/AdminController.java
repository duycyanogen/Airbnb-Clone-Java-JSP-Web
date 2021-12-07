package WebApplication.AirBnb.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import WebApplication.AirBnb.domain.BedTypes;
import WebApplication.AirBnb.domain.Locations;
import WebApplication.AirBnb.domain.RoomTypes;
import WebApplication.AirBnb.domain.Services;
import WebApplication.AirBnb.model.BedTypeDto;
import WebApplication.AirBnb.model.LocationDto;
import WebApplication.AirBnb.model.RoomTypeDto;
import WebApplication.AirBnb.model.ServiceDto;
import WebApplication.AirBnb.model.UserAccDto;
import WebApplication.AirBnb.service.impl.AccountServiceImpl;
import WebApplication.AirBnb.service.impl.BedTypeServiceImpl;
import WebApplication.AirBnb.service.impl.LocationServiceImpl;
import WebApplication.AirBnb.service.impl.RoomTypeServiceImpl;
import WebApplication.AirBnb.service.impl.ServiceServiceImpl;

@Controller
@RequestMapping("admin")
public class AdminController {

	@Autowired
	AccountServiceImpl accountService;
	@Autowired
	RoomTypeServiceImpl roomTypeService;
	@Autowired
	BedTypeServiceImpl bedTypeService;
	@Autowired
	ServiceServiceImpl serviceService;
	@Autowired
	LocationServiceImpl locationService;

	@RequestMapping(value = { "danh-sach-nguoi-dung", "" }, method = RequestMethod.GET)
	public String users(Model model) {
		List<UserAccDto> useraccs = accountService.getAllUserAccount();
		model.addAttribute("users", useraccs);
		return "admin/users";
	}

	@RequestMapping(value = "danh-sach-loai-phong", method = RequestMethod.GET)
	public String roomTypes(Model model) {
		List<RoomTypes> lstRoomTypes = roomTypeService.findAll();
		model.addAttribute("lstRoomTypes", lstRoomTypes);
		model.addAttribute("roomTypeDto", new RoomTypeDto());
		return "admin/roomtypes";
	}
	
	@RequestMapping(value = "insertRoomType", method = RequestMethod.POST)
	public ModelAndView insertRoomType(ModelMap model, @Validated @ModelAttribute("roomTypeDto") RoomTypeDto roomTypeDto,
			BindingResult errors) {
		if (!errors.hasErrors())
		{
			RoomTypes roomTypesEntity = new RoomTypes();
			roomTypesEntity.setRoomTypeName(roomTypeDto.getRoomTypeName());
			
			roomTypeService.save(roomTypesEntity);
			return new ModelAndView("redirect:/admin/danh-sach-loai-phong");
		}
		return new ModelAndView("admin/roomtypes",errors.getModel());
	}

	@RequestMapping(value = "danh-sach-loai-giuong", method = RequestMethod.GET)
	public String bedTypes(Model model) {
		List<BedTypes> lstBedTypes = bedTypeService.findAll();
		model.addAttribute("lstBedTypes", lstBedTypes);
		model.addAttribute("bedTypeDto", new BedTypeDto());
		return "admin/bedtypes";
	}
	
	@RequestMapping(value = "insertBedType", method = RequestMethod.POST)
	public ModelAndView insertBedType(ModelMap model, @Validated @ModelAttribute("bedTypeDto") BedTypeDto bedTypeDto,
			BindingResult errors) {
		if (!errors.hasErrors())
		{
			BedTypes bedTypesEntity = new BedTypes();
			bedTypesEntity.setBedTypeName(bedTypeDto.getBedTypeName());
			
			bedTypeService.save(bedTypesEntity);
			return new ModelAndView("redirect:/admin/danh-sach-loai-giuong");
		}
		return new ModelAndView("admin/bedtypes",errors.getModel());
	}

	@RequestMapping(value = "danh-sach-dich-vu", method = RequestMethod.GET)
	public String services(Model model) {
		List<Services> lstServices = serviceService.findAll();
		model.addAttribute("lstServices", lstServices);
		model.addAttribute("serviceDto", new ServiceDto());
		return "admin/services";
	}

	@RequestMapping(value = "insertService", method = RequestMethod.POST)
	public ModelAndView insertService(ModelMap model, @Validated @ModelAttribute("serviceDto") ServiceDto serviceDto,
			BindingResult errors) {
		if (!errors.hasErrors())
		{
			Services serviceEntity = new Services();
			serviceEntity.setServiceName(serviceDto.getServiceName());
			serviceEntity.setIcon("<i class=\""+serviceDto.getIcon()+"\"></i>");
			serviceService.save(serviceEntity);
			return new ModelAndView("redirect:/admin/danh-sach-dich-vu");
		}
		return new ModelAndView("admin/services",errors.getModel());
	}

	@RequestMapping(value = "danh-sach-dia-diem", method = RequestMethod.GET)
	public String locations(Model model) {
		List<Locations> lstLocations = locationService.findAll();
		model.addAttribute("lstLocations", lstLocations);
		model.addAttribute("locationDto", new LocationDto());
		return "admin/locations";
	}
	
	@RequestMapping(value = "insertLocation", method = RequestMethod.POST)
	public ModelAndView insertLocation(ModelMap model, @Validated @ModelAttribute("locationDto") LocationDto locationDto,
			BindingResult errors) {
		if (!errors.hasErrors())
		{
			Locations locationEntity = new Locations();
			locationEntity.setLocationName(locationDto.getLocationName());
			locationService.save(locationEntity);
			return new ModelAndView("redirect:/admin/danh-sach-dia-diem");
		}
		return new ModelAndView("admin/locations",errors.getModel());
	}

	@RequestMapping(value = "danh-sach-icon", method = RequestMethod.GET)
	public String icons() {
		return "admin/icons";
	}

}
