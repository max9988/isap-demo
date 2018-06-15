package com.unisys.entity;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.unisys.entity.DashboardPerson;

@Entity
@Table(name = "TBL_CHECK_IN_HISTORY")
@NamedNativeQuery(name = "CheckInHistory.findBySearchTermNamedNative",
    query="SELECT * FROM TBL_CHECK_IN_HISTORY a WHERE a.A_NUMBER = :searchTerm",
    resultClass = CheckInHistory.class
)
public class CheckInHistory implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CHECK_IN_ID")
	private long id;
	
    @ManyToOne
    @JoinColumn(name = "A_NUMBER", nullable=false)
	private DashboardPerson dashPerson;
	
	@Column(name = "CHECK_IN_DATE")
	private Date checkInDate;
	
	@Column(name = "CHECKIN_TYPE")
	private String checkInType;
	
	@Column(name = "CHECK_IN_STATUS")
	private String checkInStatus;
	
	@Column(name = "CHECK_IN_LOCATION")
	private String checkInLocation;
	
	@Column(name = "CHECK_IN_NAME")
	private String checkInName;
	
	@Column(name = "BIOMETRIC_TYPE")
	private String bioMetricType;
	
	@Column(name = "BIOMETRIC_IMAGE")
	private Blob bioMetricImage;

	@Transient
	private String imageStr;
	
	@Column(name = "NCIC_HIT")
	private String ncicHit;
	
	@Column(name = "NCIC_SHORT_DESC")
	private String ncicShortDesc;
	
	@Column(name = "NCIC_FULL_DESC")
	private String ncicFullDesc;
	
	@Column(name = "NLETS_INFO")
	private String nletsInfo;
	
	public CheckInHistory() {}

	public CheckInHistory(long id, DashboardPerson dashPerson, Date checkInDate, String checkInType,
			String checkInStatus, String checkInLocation, String checkInName, String bioMetricType, Blob bioMetricImage,
			String ncicHit, String ncicShortDesc, String ncicFullDesc, String nletsInfo) {
		super();
		this.id = id;
		this.dashPerson = dashPerson;
		this.checkInDate = checkInDate;
		this.checkInType = checkInType;
		this.checkInStatus = checkInStatus;
		this.checkInLocation = checkInLocation;
		this.checkInName = checkInName;
		this.bioMetricType = bioMetricType;
		this.bioMetricImage = bioMetricImage;
		this.ncicHit = ncicHit;
		this.ncicShortDesc = ncicShortDesc;
		this.ncicFullDesc = ncicFullDesc;
		this.nletsInfo = nletsInfo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public DashboardPerson getDashPerson() {
		return dashPerson;
	}

	public void setDashPerson(DashboardPerson dashPerson) {
		this.dashPerson = dashPerson;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public String getCheckInType() {
		return checkInType;
	}

	public void setCheckInType(String checkInType) {
		this.checkInType = checkInType;
	}

	public String getCheckInStatus() {
		return checkInStatus;
	}

	public void setCheckInStatus(String checkInStatus) {
		this.checkInStatus = checkInStatus;
	}

	public String getCheckInLocation() {
		return checkInLocation;
	}

	public void setCheckInLocation(String checkInLocation) {
		this.checkInLocation = checkInLocation;
	}

	public String getCheckInName() {
		return checkInName;
	}

	public void setCheckInName(String checkInName) {
		this.checkInName = checkInName;
	}

	public String getBioMetricType() {
		return bioMetricType;
	}

	public void setBioMetricType(String bioMetricType) {
		this.bioMetricType = bioMetricType;
	}

	public Blob getBioMetricImage() {
		return bioMetricImage;
	}

	public void setBioMetricImage(Blob bioMetricImage) {
		this.bioMetricImage = bioMetricImage;
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

	public String getNletsInfo() {
		return nletsInfo;
	}

	public void setNletsInfo(String nletsInfo) {
		this.nletsInfo = nletsInfo;
	}

	public String getImageStr() {
		return imageStr;
	}

	public void setImageStr(String imageStr) {
		this.imageStr = imageStr;
	}

}