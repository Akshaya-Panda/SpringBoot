package com.dijikstravoting.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dijikstravoting.bean.ElectionBean;
//import java.sql.Date;



@Repository
public class ElectionDao {
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
		return "ElectionDao [sf = " + sf + "]";
	}

	@SuppressWarnings("deprecation")
	public int addElection(ElectionBean vb) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(vb);
		System.out.println("Session Stored successfully...");
		t.commit();
		return 1;
		
	}
	
	public List<ElectionBean> viewElections() {
		Session s = sf.openSession();
		Query<ElectionBean> q = s.createQuery("from ElectionBean", ElectionBean.class);
		return q.getResultList();
	}
	
	public List<ElectionBean> viewAllUpcomingElections()
	{ 
		Session s=sf.openSession();
		
		Query<ElectionBean>q=s.createQuery("from ElectionBean where electiondate> current_date or electiondate=current_date",ElectionBean.class);
		return q.getResultList();
	}
}
