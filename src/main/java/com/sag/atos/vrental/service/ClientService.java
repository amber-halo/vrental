package com.sag.atos.vrental.service;

import java.util.List;

import com.sag.atos.vrental.DTO.ClientDTO;
import com.sag.atos.vrental.entity.Client;

public interface ClientService {

	List<Client> getAll();
	
	void save(ClientDTO clientDTO);
	
}
