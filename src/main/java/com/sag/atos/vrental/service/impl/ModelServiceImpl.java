package com.sag.atos.vrental.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sag.atos.vrental.DAO.BrandRepository;
import com.sag.atos.vrental.DAO.ModelRepository;
import com.sag.atos.vrental.DTO.ModelDTO;
import com.sag.atos.vrental.entity.Model;
import com.sag.atos.vrental.service.ModelService;

@Service
public class ModelServiceImpl implements ModelService {
	
	@Autowired
	private ModelRepository modelRepository;
	
	@Autowired
	private BrandRepository brandRepository;

	@Override
	public List<Model> getAll() {
		return modelRepository.findAll();
	}

	@Override
	public void save(ModelDTO modelDTO) {
		Model model = new Model();
		model.setModelId(modelDTO.getModelId());
		model.setName(modelDTO.getName());
		model.setBrand(modelDTO.getBrand());
		
		modelRepository.save(model);
	}

	
	
}
