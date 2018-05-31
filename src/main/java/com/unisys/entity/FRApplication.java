package com.unisys.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_FR_APPLICATION")
public class FRApplication implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "APPLICATION_ID")
	private long applicationId;

	@Column(name = "PERSON_ID")
	private long personId;
	
    public FRApplication() {
    }
    
    public FRApplication(long applicationId, long personId) {
        this.applicationId = applicationId;
        this.personId = personId;
    }
    

    @Override
    public String toString() {
        return "FRApplication{" + "applicationId=" + applicationId + ", personId='" + personId + '\'' + '}';
    } 
}
