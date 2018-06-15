package com.unisys.entity;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "TBL_ISP_DASHBOARD_DETAILS")
public class DashboardPerson implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID")
	private long id;
	
	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "A_NUMBER")
	private String aNumber;
	
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
	
	@Column(name = "TYPE_OF_APPOINTMENT")
	private long appType;

	@Column(name = "STATUS")
	private long status;
	
	@Column(name = "APPOINTMENT_DATE")
	private String appDate;
	
	@Column(name = "RISKSCORE")
	private long riskScore;
	
	@Column(name = "ALERT_DESC")
	private String alertDesc;
	
	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "PHONE1")
	private String phone1;
	
	@Column(name = "PHONE2")
	private String phone2;
	
	@Column(name = "COUNTRY")
	private String country;
	
	@Column(name = "DISPOSITION")
	private String disposition;
	
	@Column(name = "CASE_NUMBER")
	private String caseNumber;
	
	@Column(name = "COURT_SCHEDULE_DATE")
	private String courtDate;
	
	@Column(name = "CASE_NOTE")
	private String caseNote;
	
	@Column(name = "LANE")
	private String lane;	

	public DashboardPerson() {}

	public DashboardPerson(long id, String firstName, String lastName,
			String aNumber, Date dob, long gender, long bioMetricType, Blob image, String imageStr, long appType,
			long status, String appDate, long riskScore, String alertDesc, String address, String phone1, String phone2,
			String country, String disposition, String caseNumber, String courtDate, String caseNote, String lane) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.aNumber = aNumber;
		this.dob = dob;
		this.gender = gender;
		this.bioMetricType = bioMetricType;
		this.image = image;
		this.imageStr = imageStr;
		this.appType = appType;
		this.status = status;
		this.appDate = appDate;
		this.riskScore = riskScore;
		this.alertDesc = alertDesc;
		this.address = address;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.country = country;
		this.disposition = disposition;
		this.caseNumber = caseNumber;
		this.courtDate = courtDate;
		this.caseNote = caseNote;
		this.lane = lane;
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

	public String getaNumber() {
		return aNumber;
	}

	public void setaNumber(String aNumber) {
		this.aNumber = aNumber;
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

	public String getAppDate() {
		return appDate;
	}

	public void setAppDate(String appDate) {
		this.appDate = appDate;
	}

	public long getRiskScore() {
		return riskScore;
	}

	public void setRiskScore(long riskScore) {
		this.riskScore = riskScore;
	}

	public String getAlertDesc() {
		return alertDesc;
	}

	public void setAlertDesc(String alertDesc) {
		this.alertDesc = alertDesc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDisposition() {
		return disposition;
	}

	public void setDisposition(String disposition) {
		this.disposition = disposition;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getCourtDate() {
		return courtDate;
	}

	public void setCourtDate(String courtDate) {
		this.courtDate = courtDate;
	}

	public String getCaseNote() {
		return caseNote;
	}

	public void setCaseNote(String caseNote) {
		this.caseNote = caseNote;
	}

	public String getLane() {
		return lane;
	}

	public void setLane(String lane) {
		this.lane = lane;
	}	
	
}
