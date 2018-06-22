package com.unisys.dao;

import org.springframework.data.repository.CrudRepository;

import com.unisys.entity.GISRisk;

public interface GISRiskRepository extends CrudRepository<GISRisk, Long> { 
	
	Iterable<GISRisk> findAll();
}