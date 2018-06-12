package com.unisys.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

//import org.springframework.data.annotation.Transient;

@Entity
@Table(name = "TBL_FR_PERSON")
public class Person implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	//@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	@Column(name = "PERSON_ID")
	private long id;
	
	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "DEFACTO_ID")
	private String defactoId;

	@Column(name = "DOB")
	private Date dob;
	
	//@Column(name = "GENDER")
	//private int gender;
	
	@Transient
	private int riskScore;
	
    public Person() {
    }
    
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	public String getDefactoId() {
		return defactoId;
	}

	public void setDefactoId(String defactoId) {
		this.defactoId = defactoId;
	}
	
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

//	public int getGender() {
//		return gender;
//	}
//
//	public void setGender(int gender) {
//		this.gender = gender;
//	}

	public int getRiskScore() {
		Random r = new Random();
		return r.nextInt((100) + 1);
	}

	public void setRiskScore(int riskScore) {
		this.riskScore = riskScore;
	}

	@Override
    public String toString() {
        return "Person{" + "id=" + id + ", firstname='" + firstName + '\'' + '}';
    } 
    
}
