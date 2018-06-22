package com.unisys.dao;

import org.springframework.data.repository.CrudRepository;

import com.unisys.entity.LinkAnalysis;

public interface LinkAnalysisRepository extends CrudRepository<LinkAnalysis, Long> { 
	
	Iterable<LinkAnalysis> findAll();
}
