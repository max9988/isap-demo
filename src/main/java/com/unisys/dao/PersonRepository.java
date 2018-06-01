package com.unisys.dao;

import org.springframework.data.repository.CrudRepository;

import com.unisys.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Long> { 
	
	Iterable<Person> findAll();
	Person getPersonById(long id);
}
