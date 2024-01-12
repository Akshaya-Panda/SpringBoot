package com.dijikstravoting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dijikstravoting.bean.PartyBean;
import com.dijikstravoting.service.PartyService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/admin")

public class PartyController {
	@Autowired
	private PartyService pserv;
	
	//Here the postmapping is done where the user will give his credentials and according to that the registration will be done.
	
	@PostMapping("/addParty")
	public String addParty(@RequestBody PartyBean pb) 
	{
		
		
			return "<h1>"+pserv.addParty(pb)+" record inserted successfully\n Success";		
}
	
	@GetMapping("/viewAllParty")
	public List<PartyBean> viewAllParty() {
    	return pserv.viewAllParty();
	}

}
