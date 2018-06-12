package com.unisys.entity;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "TBL_FR_PERSON_DATA")
@NamedNativeQuery(name = "PersonData.findBySearchTermNamedNative",
    query="SELECT * FROM TBL_FR_PERSON_DATA a WHERE a.PERSON_ID = :searchTerm",
    resultClass = PersonData.class
)
public class PersonData implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "PERSON_DATA_ID")
	private long personDataId;

	@ManyToOne
    @JoinColumn(name="PERSON_ID")
	private Person person;

	@Column(name = "PERSON_IMAGE")
	private Blob image;
	
	@Transient
	private String imageStr;
	
    public PersonData() {
    }
    
    public PersonData(long personDataId) {
        this.personDataId = personDataId;
    }
    
	public long getPersonDataId() {
		return personDataId;
	}

	public void setPersonDataId(long personDataId) {
		this.personDataId = personDataId;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
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

	@Override
    public String toString() {
        return "PersonData{" + "personDataId=" + personDataId + '\'' + '}';
    } 	
}