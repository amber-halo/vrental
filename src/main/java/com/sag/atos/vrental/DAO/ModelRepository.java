package com.sag.atos.vrental.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sag.atos.vrental.entity.Model;

public interface ModelRepository extends JpaRepository<Model, Long> {

}
