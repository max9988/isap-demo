package com.unisys.dao;

import com.unisys.entity.Person;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.stream.Stream;

public interface PersonRepository extends CrudRepository<Person, Long> { 
	
	Iterable<Person> findAll();
	
	List<Person> getPersonByEmail(String email);
	
}
