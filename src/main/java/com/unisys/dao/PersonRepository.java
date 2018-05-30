package com.unisys.dao;

import com.unisys.entity.Person;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.stream.Stream;

public interface PersonRepository extends CrudRepository<Person, Long> { 
	
	Iterable<Person> findAll();
	
	// query and return a stream
    @Query("select p from Person p where p.pid = :pid")
    Stream<Person> getPersonByID(@Param("pid") String pid);
    
}
