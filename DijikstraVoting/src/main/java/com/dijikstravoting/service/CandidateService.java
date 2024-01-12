package com.dijikstravoting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dijikstravoting.bean.CandidateBean;
import com.dijikstravoting.dao.CandidateDao;

@Service
public class CandidateService{	
@Autowired
private CandidateDao cd;
	
@Transactional
public int addCandidate(CandidateBean vb) {
return cd.addCandidate(vb);
}

@Transactional
public List<CandidateBean> viewcandidateDetailsByElectionName(String electionId) {
	return cd.viewcandidateDetailsByElectionName(electionId);
}

@Transactional
public List<CandidateBean> viewcandidateDetailsByParty(String partyId) {
	return cd.viewcandidateDetailsByParty(partyId);
}

@Transactional
public List<CandidateBean> viewCandidates() {
	return cd.viewCandidates();
	}

}