package com.sag.atos.vrental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sag.atos.vrental.DTO.VehicleDTO;
import com.sag.atos.vrental.service.ModelService;
import com.sag.atos.vrental.service.VehicleService;

@Controller
@RequestMapping("/vehicles")
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;
	
	@Autowired
	private ModelService modelService;
	
	@GetMapping(value = "/vehicle")
	public String vehicles(Model model) {
		model.addAttribute("vehicle", new VehicleDTO());
		model.addAttribute("vehicleList", vehicleService.getAll());
		model.addAttribute("modelList", modelService.getAll());
		return "vehicle";
	}
	
	@PostMapping(value = "save")
	public ModelAndView save(@RequestBody VehicleDTO vehicle, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return new ModelAndView("vehicle");
		}
		vehicleService.save(vehicle);
		return new ModelAndView("redirect:/");
	}

}
