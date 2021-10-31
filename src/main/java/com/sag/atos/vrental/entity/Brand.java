package com.sag.atos.vrental.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "brand")
public class Brand implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "brandId")
	private Long brandId;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany(mappedBy = "brand")
	private Collection<Model> model;
	
//	public Brand() {
//	}
//
//	public Brand(Long brandId, String name) {
//		super();
//		this.brandId = brandId;
//		this.name = name;
//	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
