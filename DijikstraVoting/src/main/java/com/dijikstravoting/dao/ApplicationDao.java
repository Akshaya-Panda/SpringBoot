package com.dijikstravoting.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaInsertSelect;
import org.hibernate.query.criteria.JpaPredicate;
import org.hibernate.sql.Restriction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dijikstravoting.bean.ApplicationBean;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Repository
public class ApplicationDao {
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
	
	public List<ApplicationBean> viewAllAdminPendingApplications() {
		Session s = sf.openSession();
		Query<ApplicationBean> q = s.createQuery("from ApplicationBean where passedstatus=0 and approvedstatus=0", ApplicationBean.class);
		return q.getResultList();
	}
	
	//public boolean forwardVoterIDRequest(String userId)
//	{
//		//boolean flag=true;
//		Session s = sf.openSession();
//	CriteriaBuilder cb=s.getCriteriaBuilder();
//	CriteriaQuery<ApplicationBean> cr=cb.createQuery(ApplicationBean.class);
//	Root<ApplicationBean> root=cr.from(ApplicationBean.class);
//	cr.select(root).where(cb.like(root.get("userId"),"AD-001"));
//	List l=cr.getGroupList();
//		
//		l.get(0);
//		return true;
//		
//	}
	
}
