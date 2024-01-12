package com.dijikstravoting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dijikstravoting.bean.ResultsBean;
import com.dijikstravoting.service.ResultsService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/admin")
public class ResultsController {
	
	@Autowired
	private ResultsService rserv;

	
	@GetMapping("/viewListOfElectionResults")
	public List<ResultsBean> viewListOfElectionResults() {
    	return rserv.viewListOfElectionResults();
	}

}
