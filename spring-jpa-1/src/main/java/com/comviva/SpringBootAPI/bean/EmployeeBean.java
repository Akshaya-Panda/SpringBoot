package com.comviva.SpringBootAPI.bean;

import jakarta.persistence.*;

@Entity
@Table(name="emp15")
public class EmployeeBean {
	
	@Column
	private String eid;
	@Column
	private String password;
	@Id
	@Column
	private int email;
	@Column
	private int city;
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEmail() {
		return email;
	}
	public void setEmail(int email) {
		this.email = email;
	}
	public int getCity() {
		return city;
	}
	public void setCity(int city) {
		this.city = city;
	}


}

//public int validateEmp(int eid,String ename)
//{
//	int i=0;
//	Optional<EmployeeBean>opt=adao.findById(eid);
//	EmployeeBean eb2=opt.get();
//	if(eb2.getEname().equals(ename))
//	{
//		i=1;
//		return i;
//	}
//	else {
//		return i;
//	}
