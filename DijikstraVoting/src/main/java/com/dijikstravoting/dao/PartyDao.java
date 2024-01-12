package com.dijikstravoting.dao;

import java.util.List;

//import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//import com.dijikstravoting.bean.ElectionBean;
//import java.sql.Date;
import com.dijikstravoting.bean.PartyBean;



@Repository
public class PartyDao {
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
		return "PartyDao [sf = " + sf + "]";
	}

	@SuppressWarnings("deprecation")
	public int addParty(PartyBean pb) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(pb);
		System.out.println("Session Stored successfully...");
		t.commit();
		return 1;
		
	}
	
	public List<PartyBean> viewAllParty() {
		Session s = sf.openSession();
		Query<PartyBean> q = s.createQuery("from PartyBean", PartyBean.class);
		return q.getResultList();
	}
}