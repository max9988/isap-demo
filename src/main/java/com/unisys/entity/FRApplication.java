package com.unisys.entity;

import com.unisys.entity.Person;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_FR_APPLICATION")
@NamedNativeQuery(name = "FRApplication.findBySearchTermNamedNative",
    query="SELECT * FROM TBL_FR_APPLICATION a WHERE a.PERSON_ID = :searchTerm",
    resultClass = FRApplication.class
)
public class FRApplication implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "APPLICATION_ID")
	private long applicationId;

	@ManyToOne
    @JoinColumn(name="PERSON_ID")
	private Person person;
	
	@Column(name = "LOCATION")
	private String location;	
	
    public FRApplication() {
    }
    
    public FRApplication(long applicationId, Person person) {
        this.applicationId = applicationId;
        this.person = person;
    }
    
    public long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(long applicationId) {
		this.applicationId = applicationId;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
    public String toString() {
        return "FRApplication{" + "applicationId=" + applicationId + ", person='" + person + '\'' + '}';
    } 
}
