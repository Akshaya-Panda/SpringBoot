package com.dijikstravoting.bean;

import java.sql.Date;

//import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_election")


public class ElectionBean {
	@Id
	
	private String electionId;
	@Column
	private String name;
	@Column
	private Date electiondate;
	@Column
	private String district;
	@Column 
	private String constituency;
	@Column
	private Date counting_date;
	public String getElectionId() {
		return electionId;
	}
	public void setElectionId(String electionId) {
		this.electionId = electionId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getElectiondate() {
		return electiondate;
	}
	public void setElectiondate(Date electiondate) {
		this.electiondate = electiondate;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getConstituency() {
		return constituency;
	}
	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}
	public Date getCounting_date() {
		return counting_date;
	}
	public void setCounting_date(Date counting_date) {
		this.counting_date = counting_date;
	}

	

}
