package com.sag.atos.vrental.DTO;

import com.sag.atos.vrental.entity.Model;

public class VehicleDTO {
	
	private Long vehicleId;
	private String color;
	private Integer status;
	private String platenumber;
	private Integer type;
	private Model model;
	
	public Long getVehicleId() {
		return vehicleId;
	}
	
	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getPlatenumber() {
		return platenumber;
	}
	
	public void setPlatenumber(String platenumber) {
		this.platenumber = platenumber;
	}
	
	public Integer getType() {
		return type;
	}
	
	public void setType(Integer type) {
		this.type = type;
	}
	
	public Model getModel() {
		return model;
	}
	
	public void setModel(Model model) {
		this.model = model;
	}

}
