package com.unisys.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unisys.dao.ApplicationRepository;
import com.unisys.dao.PersonRepository;
import com.unisys.entity.FRApplication;
import com.unisys.entity.Person;

@RestController
public class IceController {
	
   @Autowired
   DataSource dataSource;
   
   @Autowired
   PersonRepository pRepository;

   @Autowired
   ApplicationRepository aRepository;
   
   @RequestMapping("/")
   public String sayHello() {
      return "Hello Ice Project from Unisys!";
   }

   @Transactional(readOnly = true)
   @RequestMapping("/Person/{id}")
   public String getPerson(@PathVariable long id) {
	    
	    System.out.println("getPerson(): id=" + id);
	    
	    ObjectMapper mapper = new ObjectMapper();

	    String jsonStr = null;
		try {
	        Person p = pRepository.getPersonById(id);
	        jsonStr = mapper.writeValueAsString(p);     	       
			
		}catch(Exception e){
			System.out.println("Load all persons exception " + e);
			e.printStackTrace();
		}
		
      return jsonStr;
   }
   
   @Transactional(readOnly = true)
   @RequestMapping("/Persons")
   public String getPersons() {
	    
	    ObjectMapper mapper = new ObjectMapper();

	    String jsonStr = null;
		try {
	        System.out.println("getPersons is called...");	    
	        
	        Iterable<Person> persons  = pRepository.findAll();
	        jsonStr = mapper.writeValueAsString(persons);
			
		}catch(Exception e){
			System.out.println("Load all persons exception " + e);
			e.printStackTrace();
		}
		
      return jsonStr;
   }
   
   @Transactional(readOnly = true)
   @RequestMapping("/applications/{pid}")
   public String getApplicationsByPersonId(@PathVariable long pid) {
	    
	    System.out.println("getApplicationsByPersonId()..." + pid);
	    
	    ObjectMapper mapper = new ObjectMapper();

	    String jsonStr = null;
		try {
	        Iterable<FRApplication> apps  = aRepository.findBySearchTermNamedNative(pid);
	        jsonStr = mapper.writeValueAsString(apps); 
	        
	        System.out.println("jsonStr: " + jsonStr);
			
		}catch(Exception e){
			System.out.println("Load all apps exception " + e);
			e.printStackTrace();
		}
		
      return jsonStr;
   }   
   
   @RequestMapping("/createProfile")
   public String createProfile() {
      return "List of users information";
   }
   
}

