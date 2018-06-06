package com.unisys.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unisys.dao.ApplicationRepository;
import com.unisys.dao.PersonRepository;
import com.unisys.dao.PreEnrollRepository;
import com.unisys.entity.FRApplication;
import com.unisys.entity.Person;
import com.unisys.entity.FRPreEnroll;

@RestController
public class IceController {
	
   @Autowired
   DataSource dataSource;
   
   @Autowired
   PersonRepository pRepository;

   @Autowired
   ApplicationRepository aRepository;

   @Autowired
   PreEnrollRepository preEnrollRepository;
   
   @RequestMapping("/")
   public String sayHello() {
      return "Hello Ice Project from Unisys!";
   }

   @Transactional(readOnly = true)
   @RequestMapping("/Person/{id}")
   @CrossOrigin(origins = "http://192.60.241.81:9090")
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
   @CrossOrigin(origins = "http://192.60.241.81:9090")
   public String getAllPersons() {
	    
	    ObjectMapper mapper = new ObjectMapper();

	    String jsonStr = null;
		try {
	        System.out.println("getAllPersons is called...");	    
	        
	        Iterable<Person> persons  = pRepository.findAll();
	        jsonStr = mapper.writeValueAsString(persons);
			
	        System.out.println("Persons: " + jsonStr);
	        
		}catch(Exception e){
			System.out.println("Load all persons exception " + e);
			e.printStackTrace();
		}
		
      return jsonStr;
   }
   
   @Transactional(readOnly = true)
   @RequestMapping("/applications/{pid}")
   @CrossOrigin(origins = "http://192.60.241.81:9090")
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
   
   @Transactional(readOnly = true)
   @RequestMapping("/preenroll/{pid}")
   @CrossOrigin(origins = "http://192.60.241.81:9090")
   public String getPreEnrollsByPersonId(@PathVariable long pid) {
	    
	    System.out.println("getPreEnrollsByPersonId() Here................." + pid);
	    
	    ObjectMapper mapper = new ObjectMapper();

	    String jsonStr = null;
		try {
	        Iterable<FRPreEnroll> enrolls  = preEnrollRepository.findBySearchTermNamedNative(pid);
	        jsonStr = mapper.writeValueAsString(enrolls); 
	        
	        System.out.println("jsonStr: " + jsonStr);
			
		}catch(Exception e){
			System.out.println("Load all enrolls exception " + e);
			e.printStackTrace();
		}
		
      return jsonStr;
   }  
   
   @RequestMapping("/createProfile")
   public String createProfile() {
      return "List of users information";
   }
   
}

