package com.sag.atos.vrental.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "clientId")
	private Long clientId;
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "lastname")
	private String lastname;

	@Column(name = "username")
	private String username;

	@Column(name = "phone")
	private String phone;

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	/* My db */
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id_client")
//	private Long id_client;
//	
//	@Column(name = "name_client")
//	private String name_client;
//	
//	@Column(name = "lastname_client")
//	private String lastname_client;
//
//	@Column(name = "address_client")
//	private String address_client;
//
//	@Column(name = "email_client")
//	private String email_client;
//
//	@Column(name = "username_client")
//	private String username_client;
//
//	@Column(name = "phone_client")
//	private Long phone_client;
//
//	public Long getId_client() {
//		return id_client;
//	}
//
//	public void setId_client(Long id_client) {
//		this.id_client = id_client;
//	}
//
//	public String getName_client() {
//		return name_client;
//	}
//
//	public void setName_client(String name_client) {
//		this.name_client = name_client;
//	}
//
//	public String getLastname_client() {
//		return lastname_client;
//	}
//
//	public void setLastname_client(String lastname_client) {
//		this.lastname_client = lastname_client;
//	}
//
//	public String getAddress_client() {
//		return address_client;
//	}
//
//	public void setAddress_client(String address_client) {
//		this.address_client = address_client;
//	}
//
//	public String getEmail_client() {
//		return email_client;
//	}
//
//	public void setEmail_client(String email_client) {
//		this.email_client = email_client;
//	}
//
//	public String getUsername_client() {
//		return username_client;
//	}
//
//	public void setUsername_client(String username_client) {
//		this.username_client = username_client;
//	}
//
//	public Long getPhone_client() {
//		return phone_client;
//	}
//
//	public void setPhone_client(Long phone_client) {
//		this.phone_client = phone_client;
//	}

	
}
