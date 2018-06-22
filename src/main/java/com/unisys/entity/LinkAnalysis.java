package com.unisys.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_ISP_LINK_ANALYSIS")
public class LinkAnalysis implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID")
	private long id;
	
	@Column(name = "A_NUMBER")
	private String aNumber;
	
	@Column(name = "ASSOCIATION_TYPE")
	private long associationType;
	
	@Column(name = "ASSOCIATED_STRENGTH")
	private long associationStrength;
	
	@Column(name = "ASSOCIATED_PERSON_NAME")
	private String assoicatedPersonName;
	
	@Column(name = "ASSOCIATED_PERSON_RISK")
	private long associationPersonRisk;
	
	public LinkAnalysis() {}

	public LinkAnalysis(long id, String aNumber, long associationType, long associationStrength,
			String assoicatedPersonName, long associationPersonRisk) {
		super();
		this.id = id;
		this.aNumber = aNumber;
		this.associationType = associationType;
		this.associationStrength = associationStrength;
		this.assoicatedPersonName = assoicatedPersonName;
		this.associationPersonRisk = associationPersonRisk;
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

	public long getAssociationType() {
		return associationType;
	}

	public void setAssociationType(long associationType) {
		this.associationType = associationType;
	}

	public long getAssociationStrength() {
		return associationStrength;
	}

	public void setAssociationStrength(long associationStrength) {
		this.associationStrength = associationStrength;
	}

	public String getAssoicatedPersonName() {
		return assoicatedPersonName;
	}

	public void setAssoicatedPersonName(String assoicatedPersonName) {
		this.assoicatedPersonName = assoicatedPersonName;
	}

	public long getAssociationPersonRisk() {
		return associationPersonRisk;
	}

	public void setAssociationPersonRisk(long associationPersonRisk) {
		this.associationPersonRisk = associationPersonRisk;
	}
}
