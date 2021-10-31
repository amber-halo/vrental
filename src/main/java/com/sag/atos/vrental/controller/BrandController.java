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

import com.sag.atos.vrental.DTO.BrandDTO;
import com.sag.atos.vrental.service.BrandService;

@Controller
@RequestMapping("/brands")
public class BrandController {
	
	@Autowired
	private BrandService brandService;
	
	@GetMapping(value = "/brand")
	public String brands(Model model) {
		model.addAttribute("brand", new BrandDTO());
		model.addAttribute("brandList", brandService.getAll());
		return "brand";
	}
	
	@PostMapping(value = "save")
	public ModelAndView save(@RequestBody BrandDTO brand, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return new ModelAndView("brand");
		}
		brandService.save(brand);
		return new ModelAndView("redirect:/");
	}

}
