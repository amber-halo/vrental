package com.sag.atos.vrental.service;

import java.util.List;

import com.sag.atos.vrental.DTO.BrandDTO;
import com.sag.atos.vrental.entity.Brand;

public interface BrandService {
	
	List<Brand> getAll();
	
	void save(BrandDTO brandDTO);

}
