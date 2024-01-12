package com.dijikstravoting.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_candidate")

public class CandidateBean {
	@Id
	
	private String candidateId;
	@Column
	private String name;
	@Column
	private String electionId;
	@Column
	private String partyId;
	@Column 
	private String district;
	@Column
	private String constituency;
	@Column
	private String mobileno;
	@Column
	private String address;
	@Column
	private String emailid;
	
	@ManyToOne
	@JoinColumn(name = "partyId",referencedColumnName = "partyId",insertable = false,updatable = false)
	private PartyBean partybean;
	
	public PartyBean getPartybean() {
		return partybean;
	}
	public void setPartybean(PartyBean partybean) {
		this.partybean = partybean;
	}
	
	@ManyToOne
	@JoinColumn(name = "electionId",referencedColumnName = "electionId",insertable = false,updatable = false)
	private ElectionBean electionbean;
	
	public ElectionBean getElectionbean() {
		return electionbean;
	}
	public void setElectionbean(ElectionBean electionbean) {
		this.electionbean = electionbean;
	}
	public String getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getElectionId() {
		return electionId;
	}
	public void setElectionId(String electionId) {
		this.electionId = electionId;
	}
	public String getPartyId() {
		return partyId;
	}
	public void setPartyId(String partyId) {
		this.partyId = partyId;
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
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	

}
