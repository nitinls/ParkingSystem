package com.accolite.parkingsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accolite.parkingsystem.models.Gate;

public interface GateDao extends JpaRepository<Gate, Long> {

}
