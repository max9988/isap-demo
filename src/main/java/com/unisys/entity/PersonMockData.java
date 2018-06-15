package com.unisys.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Random;

public class PersonMockData implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String firstName;
	private String lastName;
	private String aNumber;
	private Date dob;
	private long gender;
	private long bioType;
	private String bioImage;
	private long appType;
	private long status;
	private Date appDate;
	private long riskScore;	
	
	private String alertDesc;
	private String address;
	private String phone1;
	private String phone2;
	private String country;
	private String desposition;
	private String caseNumber;
	
	private Date courtDate;
	private Date checkInDate;
	private long checkInStatus;
	private long checkInType;
	private String checkInName;
	private String checkInLocation;
	private String ncicHit;
	private String ncicShortDesc;
	private String ncicFullDesc;
	private String ncicInfo;
	private String caseNote;
	
	public PersonMockData() {}

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

	public long getBioType() {
		return bioType;
	}

	public void setBioType(long bioType) {
		this.bioType = bioType;
	}

	public String getBioImage() {
		return bioImage;
	}

	public void setBioImage(String bioImage) {
		this.bioImage = bioImage;
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

	public String getDesposition() {
		return desposition;
	}

	public void setDesposition(String desposition) {
		this.desposition = desposition;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public Date getCourtDate() {
		return courtDate;
	}

	public void setCourtDate(Date courtDate) {
		this.courtDate = courtDate;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public long getCheckInStatus() {
		return checkInStatus;
	}

	public void setCheckInStatus(long checkInStatus) {
		this.checkInStatus = checkInStatus;
	}

	public long getCheckInType() {
		return checkInType;
	}

	public void setCheckInType(long checkInType) {
		this.checkInType = checkInType;
	}

	public String getCheckInName() {
		return checkInName;
	}

	public void setCheckInName(String checkInName) {
		this.checkInName = checkInName;
	}

	public String getCheckInLocation() {
		return checkInLocation;
	}

	public void setCheckInLocation(String checkInLocation) {
		this.checkInLocation = checkInLocation;
	}

	public String getNcicHit() {
		return ncicHit;
	}

	public void setNcicHit(String ncicHit) {
		this.ncicHit = ncicHit;
	}

	public String getNcicShortDesc() {
		return ncicShortDesc;
	}

	public void setNcicShortDesc(String ncicShortDesc) {
		this.ncicShortDesc = ncicShortDesc;
	}

	public String getNcicFullDesc() {
		return ncicFullDesc;
	}

	public void setNcicFullDesc(String ncicFullDesc) {
		this.ncicFullDesc = ncicFullDesc;
	}

	public String getNcicInfo() {
		return ncicInfo;
	}

	public void setNcicInfo(String ncicInfo) {
		this.ncicInfo = ncicInfo;
	}

	public String getCaseNote() {
		return caseNote;
	}

	public void setCaseNote(String caseNote) {
		this.caseNote = caseNote;
	}

}
