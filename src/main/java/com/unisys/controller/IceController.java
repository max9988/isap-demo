package com.unisys.controller;

import java.sql.Blob;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unisys.dao.ApplicationRepository;
import com.unisys.dao.DashboardDetailRepository;
import com.unisys.dao.DashboardPersonRepository;
import com.unisys.dao.PersonDataRepository;
import com.unisys.dao.PersonRepository;
import com.unisys.dao.PreEnrollRepository;
import com.unisys.dao.CheckInHistoryRepository;

import com.unisys.entity.DashboardPerson;
import com.unisys.entity.FRApplication;
import com.unisys.entity.FRDashboardDetails;
import com.unisys.entity.FRPreEnroll;
import com.unisys.entity.Person;
import com.unisys.entity.PersonData;
import com.unisys.entity.CheckInHistory;

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

   @Autowired
   PersonDataRepository personDataRepository;
   
   @Autowired
   DashboardDetailRepository dashboardDetailRepository;   
   
   @Autowired
   DashboardPersonRepository dashboardPersonRepository; 
   
   @Autowired
   CheckInHistoryRepository cihRepository;
   
   @RequestMapping("/")
   public String sayHello() {
      return "Hello Ice Project from Unisys!";
   }

   @Transactional(readOnly = true)
   @RequestMapping("/DashboardPersons")
   @CrossOrigin(origins = {"http://192.60.241.81:9090", 
		                   "http://192.60.242.97:9090", 
		                   "http://brandonchin.unisys.com:9090", 
		                   "http://domville.unisys.com:9090",
		                   "http://192.60.242.230:8080"})
   public String getAllDashboardPersons() {
	    
	    ObjectMapper mapper = new ObjectMapper();

	    String jsonStr = null;
		try {
	        System.out.println("getAllDashboardPersons is called...");	    
	        
			ArrayList <DashboardPerson> dashboardPersons  = (ArrayList) dashboardPersonRepository.findAll();
			for (DashboardPerson db : dashboardPersons) {
	            Blob blob = db.getImage();	            
	            String encodedString = "";
	            if(blob != null) {
		            byte [] bytes = blob.getBytes(1l, (int)blob.length());
		            Base64 base64 = new Base64();
		            encodedString = base64.encodeBase64String(bytes);
		            db.setImageStr(encodedString);
	            }else {
		            db.setImageStr("");
	            }
	            db.setImage(null);
			}
		
	        jsonStr = mapper.writeValueAsString(dashboardPersons);
	        
	        
		}catch(Exception e){
			System.out.println("Load getAllDashboardPersons exception " + e);
			e.printStackTrace();
		}
		
      return jsonStr;
   }   
   
   @Transactional(readOnly = true)
   @RequestMapping("/checkInHistories/{a}")
   @CrossOrigin(origins = {"http://192.60.241.81:9090", 
		                   "http://192.60.242.97:9090", 
		                   "http://brandonchin.unisys.com:9090",
		                   "http://domville.unisys.com:9090",
		                   "http://192.60.242.230:8080"})
   public String getCheckInHistorysByANumber(@PathVariable String a) {
	    
	    System.out.println("getCheckInHistorysByANumber()..." + a);
	    
	    ObjectMapper mapper = new ObjectMapper();

	    String jsonStr = null;
	    
		try {
			ArrayList <CheckInHistory>cihs  = (ArrayList) cihRepository.findBySearchTermNamedNative(a);
	        System.out.println("cihs size=" + cihs.size());
	        
			for (CheckInHistory cih : cihs) {
	            Blob blob = cih.getBioMetricImage();	            
	            String encodedString = "";
	            if(blob != null) {
		            byte [] bytes = blob.getBytes(1l, (int)blob.length());
		            Base64 base64 = new Base64();
		            encodedString = base64.encodeBase64String(bytes);
		            cih.setImageStr(encodedString);
	            }else {
		            cih.setImageStr("");
	            }
	            cih.setBioMetricImage(null);
			}
	        
	        jsonStr = mapper.writeValueAsString(cihs);
			
		}catch(Exception e){
			System.out.println("Load all cihs exception " + e);
			e.printStackTrace();
		}
		
      return jsonStr;
   } 
   
   
   @Transactional(readOnly = true)
   @RequestMapping("/Person/{id}")
   @CrossOrigin(origins = {"http://192.60.241.81:9090", 
		                   "http://192.60.242.97:9090", 
		                   "http://brandonchin.unisys.com:9090",
		                   "http://domville.unisys.com:9090",
		                   "http://192.60.242.230:8080"})
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
   @CrossOrigin(origins = {"http://192.60.241.81:9090", 
		                   "http://192.60.242.97:9090", 
		                   "http://brandonchin.unisys.com:9090", 
		                   "http://domville.unisys.com:9090",
		                   "http://192.60.242.230:8080"})
   public String getAllPersons() {
	    
	    ObjectMapper mapper = new ObjectMapper();

	    String jsonStr = null;
		try {
	        System.out.println("getAllPersons is called...");	    
	        
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
   @CrossOrigin(origins = {"http://192.60.241.81:9090", 
		                   "http://192.60.242.97:9090", 
		                   "http://brandonchin.unisys.com:9090", 
		                   "http://domville.unisys.com:9090",
		                   "http://192.60.242.230:8080"})
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
   @CrossOrigin(origins = {"http://192.60.241.81:9090", 
		                   "http://192.60.242.97:9090", 
		                   "http://brandonchin.unisys.com:9090", 
		                   "http://domville.unisys.com:9090",
		                   "http://192.60.242.230:8080"})
   public String getPreEnrollsByPersonId(@PathVariable long pid) {
	    
	    System.out.println("getPreEnrollsByPersonId()..." + pid);
	    
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

   @Transactional(readOnly = true)
   @RequestMapping("/PersonData/{pid}")
   @CrossOrigin(origins = {"http://192.60.241.81:9090", 
		                   "http://192.60.242.97:9090", 
		                   "http://brandonchin.unisys.com:9090",
		                   "http://domville.unisys.com:9090",
		                   "http://192.60.242.230:8080"})
   public String getPersonDataByPersonId(@PathVariable long pid) {
	    
	    System.out.println("getPersonDataByPersonId()..." + pid);
	    
	    ObjectMapper mapper = new ObjectMapper();

	    String jsonStr = null;
		try {
	        Iterable<PersonData> pds  = personDataRepository.findBySearchTermNamedNative(pid);
	        PersonData pData = pds.iterator().next();
	        if(pData != null) {
	        	
	            Blob blob = pData.getImage();
	            byte [] bytes = blob.getBytes(1l, (int)blob.length());
	            Base64 base64 = new Base64();
	            String encodedString = base64.encodeBase64String(bytes);
	            
	            pData.setImage(null);
	            pData.setImageStr(encodedString);
	            jsonStr = mapper.writeValueAsString(pData);
	            
	        }
			
		}catch(Exception e){
			System.out.println("Load all pds exception " + e);
			e.printStackTrace();
		}
		
      return jsonStr;
   } 
 
   
   @Transactional(readOnly = true)
   @RequestMapping("/DashboardDetail/{a}")
   @CrossOrigin(origins = {"http://192.60.241.81:9090", 
		                   "http://192.60.242.97:9090", 
		                   "http://brandonchin.unisys.com:9090",
		                   "http://domville.unisys.com:9090",
		                   "http://192.60.242.230:8080"})
   public String getDashboardDetailByANumber(@PathVariable String a) {
	    
	    System.out.println("getDashboardDetailByANumber()..." + a);
	    
	    ObjectMapper mapper = new ObjectMapper();

	    String jsonStr = null;
	    
		try {
			ArrayList <FRDashboardDetails>dbs  = (ArrayList) dashboardDetailRepository.findBySearchTermNamedNative(a);
	        System.out.println("dbs size=" + dbs.size());
	        
			for (FRDashboardDetails db : dbs) {
	            Blob blob = db.getImage();
	            
	            String encodedString = "";
	            if(blob != null) {
		            byte [] bytes = blob.getBytes(1l, (int)blob.length());
		            Base64 base64 = new Base64();
		            encodedString = base64.encodeBase64String(bytes);
		            //System.out.println("image=" + encodedString);
	            }else {
	            	System.out.println("image=" + null);
	            }
	            
	            db.setImage(null);
	            db.setImageStr(encodedString);
			}
		
	        
	        jsonStr = mapper.writeValueAsString(dbs);
			
		}catch(Exception e){
			System.out.println("Load all dbs exception " + e);
			e.printStackTrace();
		}
		
      return jsonStr;
   }   
   
   @RequestMapping("/createProfile")
   public String createProfile() {
      return "List of users information";
   }
   
}

