package com.unisys.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_ISP_GIS_RISK")
public class GISRisk implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID")
	private long id;
	
	@Column(name = "A_NUMBER")
	private String aNumber;
	
	@Column(name = "PLACE_VISITED")
	private String placeVisited;
	
	@Column(name = "TIME_VISITED")
	private String timeVisited;
	
	@Column(name = "PLACE_RISK")
	private long placeRisk;
	
	@Column(name = "TRAVLE_THRESHOLD")
	private long travleThreshold;
	
	public GISRisk() {}

	public GISRisk(long id, String aNumber, String placeVisited, String timeVisited, long placeRisk,
			long travleThreshold) {
		super();
		this.id = id;
		this.aNumber = aNumber;
		this.placeVisited = placeVisited;
		this.timeVisited = timeVisited;
		this.placeRisk = placeRisk;
		this.travleThreshold = travleThreshold;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getaNumber() {
		return aNumber;
	}

	public void setaNumber(String aNumber) {
		this.aNumber = aNumber;
	}

	public String getPlaceVisited() {
		return placeVisited;
	}

	public void setPlaceVisited(String placeVisited) {
		this.placeVisited = placeVisited;
	}

	public String getTimeVisited() {
		return timeVisited;
	}

	public void setTimeVisited(String timeVisited) {
		this.timeVisited = timeVisited;
	}

	public long getPlaceRisk() {
		return placeRisk;
	}

	public void setPlaceRisk(long placeRisk) {
		this.placeRisk = placeRisk;
	}

	public long getTravleThreshold() {
		return travleThreshold;
	}

	public void setTravleThreshold(long travleThreshold) {
		this.travleThreshold = travleThreshold;
	}
}
