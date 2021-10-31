package com.sag.atos.vrental.service;

import java.util.List;

import com.sag.atos.vrental.DTO.ModelDTO;
import com.sag.atos.vrental.entity.Model;

public interface ModelService {
	
	List<Model> getAll();
	
	void save(ModelDTO modelDTO);

}
