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

import com.sag.atos.vrental.DTO.ClientDTO;
import com.sag.atos.vrental.service.ClientService;

@Controller
@RequestMapping("/clients")
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@GetMapping(value = "/profile")
	public String profile(Model model) {
		model.addAttribute("client", new ClientDTO());
		model.addAttribute("clientList", clientService.getAll());
		return "clientprofile";
	}
	
	@PostMapping(value = "save")
	public ModelAndView save(@RequestBody ClientDTO client, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return new ModelAndView("clientprofile");
		}
		clientService.save(client);
		return new ModelAndView("redirect:/");
	}
	
}
