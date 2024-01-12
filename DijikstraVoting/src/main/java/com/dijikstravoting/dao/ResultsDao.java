package com.dijikstravoting.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dijikstravoting.bean.ResultsBean;

@Repository
public class ResultsDao {
	

	
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
			return "ReultsDao [sf = " + sf + "]";
		}

	
	public List<ResultsBean> viewListOfElectionResults() {
		Session s = sf.openSession();
		Query<ResultsBean> q = s.createQuery("from ResultsBean", ResultsBean.class);
		return q.getResultList();
	}

}
