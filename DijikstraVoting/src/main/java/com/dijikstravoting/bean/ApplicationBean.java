package com.dijikstravoting.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_application")

public class ApplicationBean {
	
	@Id
	
	private String userId;
	@Column
	private String constituency;
	@Column
	private int approvedstatus;
	@Column
	private int passedstatus;
	@Column 
	private String voterid;
	@ManyToOne
	@JoinColumn(name = "userId",referencedColumnName = "userId",insertable = false,updatable = false)
	private CredentialsBean credentialsBean;
	 
	public CredentialsBean getCredentialsBean() {
		return credentialsBean;
	}
	public void setCredentialsBean(CredentialsBean credentialsBean) {
		this.credentialsBean = credentialsBean;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getConstituency() {
		return constituency;
	}
	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}
	public int getApprovedstatus() {
		return approvedstatus;
	}
	public void setApprovedstatus(int approvedstatus) {
		this.approvedstatus = approvedstatus;
	}
	public int getPassedstatus() {
		return passedstatus;
	}
	public void setPassedstatus(int passedstatus) {
		this.passedstatus = passedstatus;
	}
	public String getVoterid() {
		return voterid;
	}
	public void setVoterid(String voterid) {
		this.voterid = voterid;
	}	

}
