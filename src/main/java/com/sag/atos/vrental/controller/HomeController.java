package com.sag.atos.vrental.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sag.atos.vrental.entity.Client;
import com.sag.atos.vrental.service.ClientService;

@Controller
public class HomeController {
	
	@Autowired
	private ClientService clientService;

	@GetMapping(value = "/")
	public String home(Model model) {
		List<Client> clients = clientService.getAll();
//		clients.get(0).getFirstname()
//		String clientsString = "";
//		for (Client client : clients) {
//			clientsString += client.getFirstname() + " ";
//		}
//		model.addAttribute("clients", clientsString);
		model.addAttribute("name", "Saul");
		model.addAttribute("clients", clients);
		return "home";
	}
	
	@GetMapping(value = "test")
	public String test(Model model) {
		return "main-test";
	}
	
}
