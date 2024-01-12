package com.dijikstravoting.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_results")

public class ResultsBean {
	@Id
	private int serialno;
	@Column
	private String electionId;
	@Column
	private String candidateId;
	@Column
	private int votecount;
	
	@ManyToOne
	@JoinColumn(name = "electionId",referencedColumnName = "electionId",insertable = false,updatable = false)
	private ElectionBean ElectionBean;
	
	@ManyToOne
	@JoinColumn(name = "candidateId",referencedColumnName = "candidateId",insertable = false,updatable = false)
	private CandidateBean CandidateBean;
	
	

	public CandidateBean getCandidateBean() {
		return CandidateBean;
	}

	public void setCandidateBean(CandidateBean candidateBean) {
		CandidateBean = candidateBean;
	}

	public int getSerialno() {
		return serialno;
	}

	public void setSerialno(int serialno) {
		this.serialno = serialno;
	}

	public String getElectionId() {
		return electionId;
	}

	public void setElectionId(String electionId) {
		this.electionId = electionId;
	}

	public String getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}

	public int getVotecount() {
		return votecount;
	}

	public void setVotecount(int votecount) {
		this.votecount = votecount;
	}

	public ElectionBean getElectionBean() {
		return ElectionBean;
	}

	public void setElectionBean(ElectionBean electionBean) {
		ElectionBean = electionBean;
	}

}
