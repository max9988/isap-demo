package com.unisys.dao;

import org.springframework.data.repository.CrudRepository;

import com.unisys.entity.FRApplication;

public interface ApplicationRepository extends CrudRepository<FRApplication, Long> { 
	
	Iterable<FRApplication> findAll();
}
