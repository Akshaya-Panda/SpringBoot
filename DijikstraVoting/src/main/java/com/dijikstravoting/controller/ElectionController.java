package com.dijikstravoting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dijikstravoting.bean.ElectionBean;
import com.dijikstravoting.service.ElectionService;



@RestController
@CrossOrigin(origins="*")
@RequestMapping("/admin")
public class ElectionController {
	@Autowired
	private ElectionService eserv;

	@GetMapping("/welcome")
	public String meth1() {
		return "<h1> Welcome to Spring Boot Application</h1>";
	}
	
	//Here the postmapping is done where the user will give his credentials and according to that the registration will be done.
	
	@PostMapping("/addElection")
	public String addElection(@RequestBody ElectionBean eb) 
	{
		
		
			return "<h1>"+eserv.addElection(eb)+" record inserted successfully\n Success";		
}
	
	@GetMapping("/viewElections")
	public List<ElectionBean> viewElections() {
    	return eserv.viewElections();
	}
	
	@GetMapping("/viewAllUpcomingElections")
	public List<ElectionBean> viewAllUpcomingElections() {
    	return eserv.viewAllUpcomingElections();
	}
	
	
}
