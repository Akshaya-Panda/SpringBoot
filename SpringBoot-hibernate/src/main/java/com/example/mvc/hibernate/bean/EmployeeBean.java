package com.example.mvc.hibernate.bean;

import jakarta.persistence.*;

@Entity
@Table(name="emp854")
public class EmployeeBean {
	@Id
	private int eid;
	@Column(name="empname")
	private String ename;
	@Column
	private int esal;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}

}
