package com.unisys.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.unisys.entity.PersonData;

public interface PersonDataRepository extends CrudRepository<PersonData, Long> { 
	
	@Query(nativeQuery = true)
	List<PersonData> findBySearchTermNamedNative(@Param("searchTerm") long searchTerm);	
}
