package com.unisys.controller;

import java.util.List;

import com.unisys.dao.PersonRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

import com.unisys.entity.Person;

@RestController
public class IceController {
	
   private List <Person> persons;
	
   @Autowired
   DataSource dataSource;
   
   @Autowired
   PersonRepository pRepository;
   
   @RequestMapping("/")
   public String sayHello() {
      return "Hello Ice Project from Unisys!";
   }
   
   @Transactional(readOnly = true)
   @RequestMapping("/Person")
   public String getAllPersons() {
	    
	    String jsonStr = null;
		try {
	        System.out.println("findByEmail(String email)...");
	        for (Person p : pRepository.getPersonByEmail("222@yahoo.com")) {
	            System.out.println(p);
	            jsonStr = "{'firstName':'" + p.getFirstName() + "', 'lastName':'" + p.getLastName() + "'}";
	        }	       	       
			
		}catch(Exception e){
			System.out.println("Load all persons exception " + e);
			e.printStackTrace();
		}
		
      return jsonStr;
   }
   
   @RequestMapping("/createProfile")
   public String createProfile() {
      return "List of users information";
   }
   
}

