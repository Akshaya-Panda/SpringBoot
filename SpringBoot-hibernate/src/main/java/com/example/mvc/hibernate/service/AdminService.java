package com.example.mvc.hibernate.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.mvc.hibernate.bean.EmployeeBean;
import com.example.mvc.hibernate.dao.AdminDao;

@Service
public class AdminService {
	@Autowired
	private AdminDao adao;
	@Transactional
	public void addEmployee(EmployeeBean eb)
	{
		adao.addEmployee(eb);
	}
	@Transactional
	public void updateEmployee(EmployeeBean eb)
	{
		
		adao.updateEmployee(eb);
	}
	
	@Transactional
	public void deleteEmployee(int eid)
	{
		
		adao.deleteEmployee(eid);
	}
	
	@Transactional
	public  ArrayList<EmployeeBean> selectAll()
	{
		
		return adao.selectAll();
	}
}

