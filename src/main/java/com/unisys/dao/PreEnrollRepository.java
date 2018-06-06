package com.unisys.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.unisys.entity.FRPreEnroll;

@Repository
public interface PreEnrollRepository extends CrudRepository<FRPreEnroll, Long> { 
	
	@Query(nativeQuery = true)
	List<FRPreEnroll> findBySearchTermNamedNative(@Param("searchTerm") long searchTerm);	
}