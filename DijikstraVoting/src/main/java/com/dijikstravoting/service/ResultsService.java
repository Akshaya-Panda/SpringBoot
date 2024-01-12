package com.dijikstravoting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dijikstravoting.bean.ResultsBean;
import com.dijikstravoting.dao.ResultsDao;

@Service
public class ResultsService {

	@Autowired
	private ResultsDao rd;	
	
	
	@Transactional
	public List<ResultsBean> viewListOfElectionResults() {
		return rd.viewListOfElectionResults();
		}
	
	
}
