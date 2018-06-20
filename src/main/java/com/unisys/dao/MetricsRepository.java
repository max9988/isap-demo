package com.unisys.dao;

import org.springframework.data.repository.CrudRepository;
import com.unisys.entity.Metrics;

public interface MetricsRepository extends CrudRepository<Metrics, Long> { 
	
	Iterable<Metrics> findAll();
}
