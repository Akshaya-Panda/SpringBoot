package com.dijikstravoting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dijikstravoting.bean.ApplicationBean;
import com.dijikstravoting.service.ApplicationService;


@RestController
@CrossOrigin(origins="*")
@RequestMapping("/admin")

public class ApplicationController {
	

		@Autowired
		private ApplicationService aserv;

		@GetMapping("/viewAllAdminPendingApplications")
		public List<ApplicationBean> viewAllAdminPendingApplications() {
	    	return aserv.viewAllAdminPendingApplications();
		}

}
