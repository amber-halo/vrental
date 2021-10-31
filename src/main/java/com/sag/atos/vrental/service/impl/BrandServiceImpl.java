package com.sag.atos.vrental.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sag.atos.vrental.DAO.BrandRepository;
import com.sag.atos.vrental.DTO.BrandDTO;
import com.sag.atos.vrental.entity.Brand;
import com.sag.atos.vrental.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {
	
	@Autowired
	private BrandRepository brandRepository;

	@Override
	public List<Brand> getAll() {
		return brandRepository.findAll();
	}

	@Override
	public void save(BrandDTO brandDTO) {
		Brand brand = new Brand();
		brand.setBrandId(brandDTO.getBrandId());
		brand.setName(brandDTO.getName());
		
		brandRepository.save(brand);
		
	}

}
