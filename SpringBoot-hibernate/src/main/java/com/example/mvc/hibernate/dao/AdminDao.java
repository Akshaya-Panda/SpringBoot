package com.example.mvc.hibernate.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.mvc.hibernate.bean.EmployeeBean;

import java.util.ArrayList;

import org.hibernate.*;

import org.hibernate.Session;

@Repository
public class AdminDao {
	@Autowired
	private SessionFactory sessionFactory;
	public void addEmployee(EmployeeBean eb)
	{
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		s.save(eb);
		t.commit();
		System.out.println("Session stored successfullly");
	}
	
	public void updateEmployee(EmployeeBean eb)
	{
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		s.update(eb);
		t.commit();
		System.out.println("Session updated successfully");
	}
	
	public void deleteEmployee(int eid)
	{
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		Query q=s.createQuery("delete from EmployeeBean where eid=:empid");
		q.setParameter("empid", eid);
		int i= q.executeUpdate();
		t.commit();
		System.out.println(i+"Session deleted successfully");
	}
	
	public ArrayList<EmployeeBean> selectAll()
	{
	    Session s=sessionFactory.openSession();
	    Query q=s.createQuery("from EmployeeBean");
	    return (ArrayList<EmployeeBean>)q.list();
	}

}
