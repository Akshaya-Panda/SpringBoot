package com.example.SpringBoot.bean;

import jakarta.persistence.*;

@Entity
@Table(name="emp15")
public class EmployeeBean {
	
	@GeneratedValue
	private int eid;
	@Column
	private String ename;
	@Column(name="password",length=10)
	private String password;
	@Column
	@Id
	private String email;
	@Column
	private String city;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}


