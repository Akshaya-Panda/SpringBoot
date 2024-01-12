package com.dijikstravoting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dijikstravoting.bean.ApplicationBean;
import com.dijikstravoting.dao.ApplicationDao;

@Service
public class ApplicationService {
	@Autowired
	private ApplicationDao ad;
	
	@Transactional
	public List<ApplicationBean> viewAllAdminPendingApplications() {
		return ad.viewAllAdminPendingApplications();
		}


}
