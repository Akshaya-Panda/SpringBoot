package com.dijikstravoting.service;

import java.util.List;

//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dijikstravoting.bean.ElectionBean;
import com.dijikstravoting.dao.ElectionDao;



@Service
public class ElectionService {	
@Autowired
private ElectionDao dd;
	
@Transactional
public int addElection(ElectionBean vb) {
return dd.addElection(vb);
}

@Transactional
public List<ElectionBean> viewElections() {
	return dd.viewElections();
	}

public List<ElectionBean> viewAllUpcomingElections()
{
	return dd.viewAllUpcomingElections();
	}
}


