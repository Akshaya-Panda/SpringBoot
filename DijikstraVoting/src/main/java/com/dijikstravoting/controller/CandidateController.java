package com.dijikstravoting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dijikstravoting.bean.CandidateBean;
import com.dijikstravoting.bean.ElectionBean;
import com.dijikstravoting.service.CandidateService;


@RestController
@CrossOrigin(origins="*")
@RequestMapping("/admin")
public class CandidateController {
	@Autowired
	private CandidateService cserv;

	
	//Here the postmapping is done where the user will give his credentials and according to that the registration will be done.
	
	@PostMapping("/addCandidate")
	public String addCandidate(@RequestBody CandidateBean cb) 
	{
		
		
			return "<h1>"+cserv.addCandidate(cb)+" record inserted successfully\n Success";		
}
	
	@GetMapping("/viewcandidateDetailsByElectionName/{electionId}")
	public List<CandidateBean> viewcandidateDetailsByElectionName(@PathVariable String electionId) {
    	return cserv.viewcandidateDetailsByElectionName(electionId);
	}
	
	@GetMapping("/viewcandidateDetailsByParty/{partyId}")
	public List<CandidateBean> viewCandidates(@PathVariable String partyId) {
    	return cserv.viewcandidateDetailsByParty(partyId);
	}
	
	@GetMapping("/viewCandidates")
	public List<CandidateBean> viewCandidates() {
    	return cserv.viewCandidates();
	}
	
}