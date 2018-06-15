package com.unisys.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.unisys.entity.CheckInHistory;

@Repository
public interface CheckInHistoryRepository extends CrudRepository<CheckInHistory, String> { 
	
	@Query(nativeQuery = true)
	List<CheckInHistory> findBySearchTermNamedNative(@Param("searchTerm") String searchTerm);	
}
