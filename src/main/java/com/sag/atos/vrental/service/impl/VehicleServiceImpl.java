package com.sag.atos.vrental.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sag.atos.vrental.DAO.VehicleRepository;
import com.sag.atos.vrental.DTO.VehicleDTO;
import com.sag.atos.vrental.entity.Vehicle;
import com.sag.atos.vrental.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {
	
	@Autowired
	private VehicleRepository vehicleRepository;

	@Override
	public List<Vehicle> getAll() {
		return vehicleRepository.findAll();
	}

	@Override
	public void save(VehicleDTO vehicleDTO) {
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleId(vehicleDTO.getVehicleId());
		vehicle.setColor(vehicleDTO.getColor());
		vehicle.setStatus(vehicleDTO.getStatus());
		vehicle.setPlatenumber(vehicleDTO.getPlatenumber());
		vehicle.setType(vehicleDTO.getType());
		vehicle.setModel(vehicleDTO.getModel());
		
		vehicleRepository.save(vehicle);
	}

}
