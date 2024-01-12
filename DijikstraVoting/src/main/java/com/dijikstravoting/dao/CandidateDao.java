package com.dijikstravoting.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dijikstravoting.bean.CandidateBean;

@Repository
public class CandidateDao {
	@Autowired
	private SessionFactory sf;

	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public String toString() {
		return "CandidateDao [sf = " + sf + "]";
	}

	@SuppressWarnings("deprecation")
	public int addCandidate(CandidateBean cb) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(cb);
		System.out.println("Session Stored successfully...");
		t.commit();
		return 1;
		
	}
	
	public List<CandidateBean> viewcandidateDetailsByElectionName(String electionId) {
		Session s = sf.openSession();
		Query<CandidateBean> q = s.createQuery("from CandidateBean where electionId=:electionId", CandidateBean.class);
		q.setParameter("electionId", electionId	);
		return q.getResultList();
	}
	
	public List<CandidateBean> viewcandidateDetailsByParty(String partyId) {
		Session s = sf.openSession();
		Query<CandidateBean> q = s.createQuery("from CandidateBean where partyId=:partyId", CandidateBean.class);
		q.setParameter("partyId", partyId);
		return q.getResultList();
	}
	
	public List<CandidateBean> viewCandidates() {
		Session s = sf.openSession();
		Query<CandidateBean> q = s.createQuery("from CandidateBean", CandidateBean.class);
		return q.getResultList();
	}
}