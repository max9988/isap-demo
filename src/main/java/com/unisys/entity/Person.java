package com.unisys.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Person implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "pid_Sequence")
	@SequenceGenerator(name = "pid_Sequence", sequenceName = "ID_SEQ")
	
	private int pid;
	
	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "EMAIL")
	private String email;	
	
    @Column(name = "CREATED_DATE")
    Date date;
	
    public Person() {
    }
    
    public Person(String firstName, String lastName, String email, Date date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.date = date;
    }
    
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }	

    @Override
    public String toString() {
        return "Person{" + "pid=" + pid + ", firstname='" + firstName + '\'' + ", email='" + email + '\'' + ", date=" + date + '}';
    }    
}
