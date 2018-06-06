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
	
	@Column(name = "ADDRESS")
	private String address;	
	
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
    
	@Override
    public String toString() {
        return "FRPreEnroll{" + "preEnrollId=" + preEnrollId + ", lastName='" + lastName + '\'' + '}';
    }     
}
