package com.unisys.dao;

import org.springframework.data.repository.CrudRepository;

import com.unisys.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Long> { 
	
	Iterable<Person> findAll();
	//List<Person> getPersonByEmail(String email);	
	Person getPersonById(long id);
}
