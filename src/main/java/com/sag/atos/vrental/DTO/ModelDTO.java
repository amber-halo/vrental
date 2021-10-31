package com.sag.atos.vrental.DTO;

import com.sag.atos.vrental.entity.Brand;

public class ModelDTO {
	
	private Long modelId;
	private String name;
	private Brand brand;
	private String brandId_fk;
	
	public Long getModelId() {
		return modelId;
	}
	
	public void setModelId(Long modelId) {
		this.modelId = modelId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Brand getBrand() {
		return brand;
	}
	
	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getBrandId_fk() {
		return brandId_fk;
	}

	public void setBrandId_fk(String brandId_fk) {
		this.brandId_fk = brandId_fk;
	}

}
