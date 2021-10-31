package com.sag.atos.vrental.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sag.atos.vrental.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
	
//	@Query()
//	Client findByFirstName(String firstName);
	
}
