package com.comviva.SpringBootAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comviva.SpringBootAPI.bean.EmployeeBean;

public class EmployeeDao {
@Repository
public interface EmployeeDao extends JpaRepository<EmployeeBean ,String> {
		

	}


