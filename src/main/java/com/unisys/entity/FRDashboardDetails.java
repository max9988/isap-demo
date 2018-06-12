package com.unisys.entity;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "TBL_ISP_DASHBOARD_DETAILS")
@NamedNativeQuery(name = "FRDashboardDetails.findBySearchTermNamedNative",
    query="SELECT * FROM TBL_ISP_DASHBOARD_DETAILS a WHERE a.A_NUMBER = :searchTerm",
    resultClass = FRDashboardDetails.class
)
public class FRDashboardDetails implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	private long id;
	
	@Column(name = "A_NUMBER")
	private String aNumber;	

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "DOB")
	private Date dob;
	
	@Column(name = "GENDER")
	private long gender;
	
	@Column(name = "BIOMETRIC_TYPE")
	private long bioMetricType;
	
	@Column(name = "BIOMETRIC_IMAGE")
	private Blob image;
	
	@Transient
	private String imageStr;
	
	@Column(name = "TYPE_OF_APPLICATION")
	private long appType;

	@Column(name = "STATUS")
	private long status;
	
	@Column(name = "APPLICATION_DATE")
	private Date appDate;
	
	@Column(name = "RISKSCORE")
	private long riskScore;
	
    public FRDashboardDetails() {
    }
    
    public FRDashboardDetails(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

	public String getaNumber() {
		return aNumber;
	}

	public void setaNumber(String aNumber) {
		this.aNumber = aNumber;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public long getGender() {
		return gender;
	}

	public void setGender(long gender) {
		this.gender = gender;
	}

	public long getBioMetricType() {
		return bioMetricType;
	}

	public void setBioMetricType(long bioMetricType) {
		this.bioMetricType = bioMetricType;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}

	public String getImageStr() {
		return imageStr;
	}

	public void setImageStr(String imageStr) {
		this.imageStr = imageStr;
	}

	public long getAppType() {
		return appType;
	}

	public void setAppType(long appType) {
		this.appType = appType;
	}

	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}

	public Date getAppDate() {
		return appDate;
	}

	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}

	public long getRiskScore() {
		return riskScore;
	}

	public void setRiskScore(long riskScore) {
		this.riskScore = riskScore;
	}  
    
}
