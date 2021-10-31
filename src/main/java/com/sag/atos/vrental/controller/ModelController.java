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

import com.sag.atos.vrental.DTO.ModelDTO;
import com.sag.atos.vrental.service.BrandService;
import com.sag.atos.vrental.service.ModelService;

@Controller
@RequestMapping("/models")
public class ModelController {
	
	@Autowired
	private ModelService modelService;
	
	@Autowired
	private BrandService brandService;
	
	@GetMapping(value = "/model")
	public String models(Model model) {
		model.addAttribute("model", new ModelDTO());
		model.addAttribute("modelList", modelService.getAll());
		model.addAttribute("brandList", brandService.getAll());
		return "model";
	}
	
	@PostMapping(value = "save")
	public ModelAndView save(@RequestBody ModelDTO model, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return new ModelAndView("model");
		}
		modelService.save(model);
		return new ModelAndView("redirect:/");
	}

}
