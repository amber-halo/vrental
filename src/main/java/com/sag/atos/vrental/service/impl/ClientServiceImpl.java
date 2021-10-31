package com.sag.atos.vrental.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sag.atos.vrental.DAO.ClientRepository;
import com.sag.atos.vrental.DTO.ClientDTO;
import com.sag.atos.vrental.entity.Client;
import com.sag.atos.vrental.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private ClientRepository clientRepository;

	@Override
	public List<Client> getAll() {
		List<Client> clients = clientRepository.findAll();
		return clients;
	}

	@Override
	public void save(ClientDTO clientDTO) {
		Client client = new Client();
		client.setClientId(clientDTO.getClientId());
		client.setFirstname(clientDTO.getFirstname());
		client.setLastname(clientDTO.getLastname());
		client.setUsername(clientDTO.getUsername());
//		client.setUsername(clientDTO.getFirstname() + "-" + clientDTO.getLastname());
		client.setPhone(clientDTO.getPhone());
		
//		client.setId_client(clientDTO.getId_client());
//		client.setName_client(clientDTO.getName_client());
//		client.setLastname_client(clientDTO.getLastname_client());
//		client.setAddress_client(clientDTO.getAddress_client());
//		client.setEmail_client(clientDTO.getEmail_client());
//		client.setUsername_client(clientDTO.getName_client() + "-" + clientDTO.getLastname_client());
//		client.setPhone_client(clientDTO.getPhone_client());
		
		clientRepository.save(client);
		
	}

}
