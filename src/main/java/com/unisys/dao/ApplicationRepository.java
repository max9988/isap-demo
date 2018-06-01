package com.unisys.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.unisys.entity.FRApplication;

@Repository
public interface ApplicationRepository extends CrudRepository<FRApplication, Long> { 
	
	@Query(nativeQuery = true)
	List<FRApplication> findBySearchTermNamedNative(@Param("searchTerm") long searchTerm);	
}
