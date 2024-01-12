package com.dijikstravoting.service;

import java.util.List;

//import java.util.List;

//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dijikstravoting.bean.PartyBean;
import com.dijikstravoting.dao.PartyDao;



@Service
public class PartyService {	
@Autowired
private PartyDao dd;
	
@Transactional
public int addParty(PartyBean pb) {
return dd.addParty(pb);
}

@Transactional
public List<PartyBean> viewAllParty() {
	return dd.viewAllParty();
	}
}

