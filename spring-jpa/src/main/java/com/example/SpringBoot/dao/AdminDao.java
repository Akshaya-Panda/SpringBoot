package com.example.SpringBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBoot.bean.EmployeeBean;

@Repository
public interface AdminDao extends JpaRepository<EmployeeBean ,String> {
	

}
