package com.unisys.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_ISP_METRICS")
public class Metrics implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID")
	private long id;
	
	@Column(name = "AVG_WAIT_TIME")
	private long avgWaitTime;
	
	@Column(name = "MAX_WAIT_TIME")
	private long maxWaitTime;
	
	@Column(name = "NUM_ENROLLMENTS")
	private long numEnrollments;
	
	@Column(name = "AVG_TIME_ENROLL")
	private long avgTimeEnroll;
	
	@Column(name = "NUM_SELF_CHECKIN")
	private long numSelfCheckin;
	
	@Column(name = "AVG_TIME_CHECKIN")
	private long avgTimeCheckin;
	
	@Column(name = "NUM_REMOTE_CHECKIN")
	private long numRemoteCheckin;
	
    public Metrics() {
    }

	public Metrics(long id, long avgWaitTime, long maxWaitTime, long numEnrollments, long avgTimeEnroll,
			long numSelfCheckin, long avgTimeCheckin, long numRemoteCheckin) {
		super();
		this.id = id;
		this.avgWaitTime = avgWaitTime;
		this.maxWaitTime = maxWaitTime;
		this.numEnrollments = numEnrollments;
		this.avgTimeEnroll = avgTimeEnroll;
		this.numSelfCheckin = numSelfCheckin;
		this.avgTimeCheckin = avgTimeCheckin;
		this.numRemoteCheckin = numRemoteCheckin;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAvgWaitTime() {
		return avgWaitTime;
	}

	public void setAvgWaitTime(long avgWaitTime) {
		this.avgWaitTime = avgWaitTime;
	}

	public long getMaxWaitTime() {
		return maxWaitTime;
	}

	public void setMaxWaitTime(long maxWaitTime) {
		this.maxWaitTime = maxWaitTime;
	}

	public long getNumEnrollments() {
		return numEnrollments;
	}

	public void setNumEnrollments(long numEnrollments) {
		this.numEnrollments = numEnrollments;
	}

	public long getAvgTimeEnroll() {
		return avgTimeEnroll;
	}

	public void setAvgTimeEnroll(long avgTimeEnroll) {
		this.avgTimeEnroll = avgTimeEnroll;
	}

	public long getNumSelfCheckin() {
		return numSelfCheckin;
	}

	public void setNumSelfCheckin(long numSelfCheckin) {
		this.numSelfCheckin = numSelfCheckin;
	}

	public long getAvgTimeCheckin() {
		return avgTimeCheckin;
	}

	public void setAvgTimeCheckin(long avgTimeCheckin) {
		this.avgTimeCheckin = avgTimeCheckin;
	}

	public long getNumRemoteCheckin() {
		return numRemoteCheckin;
	}

	public void setNumRemoteCheckin(long numRemoteCheckin) {
		this.numRemoteCheckin = numRemoteCheckin;
	}
}
