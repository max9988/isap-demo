package com.unisys.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_FR_PREENROLL")
@NamedNativeQuery(name = "FRPreEnroll.findBySearchTermNamedNative",
    query="SELECT * FROM TBL_FR_PREENROLL a WHERE a.PREENROLL_ID = :searchTerm",
    resultClass = FRPreEnroll.class
)
public class FRPreEnroll implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "PREENROLL_ID")
	private long preEnrollId;
	
	@Column(name = "A_NUMBER")
	private String aNumber;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;	

	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PHONE")
	private String phone;	
	
	@Column(name = "ADDRESS")
	private String address;	
	
	@Column(name = "CITY")
	private String city;
	
	@Column(name = "STATE")
	private String state;
	
	@Column(name = "ZIPCODE")
	private String zipCode;
	
	@Column(name = "COUNTRY")
	private String country;	
	
	@Column(name = "REFERRAL_SCORE")
	private String referralScore;		
	
    public FRPreEnroll() {
    }
    
    public FRPreEnroll(long preEnrollId, String aNumber, String firstName, String lastName, 
    		String email, String address, String referralScore) {
    	
        this.preEnrollId = preEnrollId;
        this.aNumber = aNumber;
    	this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.referralScore = referralScore;
        
    }

	public long getPreEnrollId() {
		return preEnrollId;
	}

	public void setPreEnrollId(long preEnrollId) {
		this.preEnrollId = preEnrollId;
	}

	public String getaNumber() {
		return aNumber;
	}

	public void setaNumber(String aNumber) {
		this.aNumber = aNumber;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReferralScore() {
		return referralScore;
	}

	public void setReferralScore(String referralScore) {
		this.referralScore = referralScore;
	}
    	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
    public String toString() {
        return "FRPreEnroll{" + "preEnrollId=" + preEnrollId + ", lastName='" + lastName + '\'' + '}';
    }     
}
