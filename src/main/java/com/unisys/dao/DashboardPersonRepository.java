package com.unisys.dao;

import org.springframework.data.repository.CrudRepository;

import com.unisys.entity.DashboardPerson;

public interface DashboardPersonRepository extends CrudRepository<DashboardPerson, Long> { 
	
	Iterable<DashboardPerson> findAll();
}