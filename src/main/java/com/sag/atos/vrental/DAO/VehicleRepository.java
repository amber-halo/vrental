package com.sag.atos.vrental.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sag.atos.vrental.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}
