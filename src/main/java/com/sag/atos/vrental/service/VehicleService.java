package com.sag.atos.vrental.service;

import java.util.List;

import com.sag.atos.vrental.DTO.VehicleDTO;
import com.sag.atos.vrental.entity.Vehicle;

public interface VehicleService {
	
	List<Vehicle> getAll();
	
	void save(VehicleDTO vehicleDTO);

}
