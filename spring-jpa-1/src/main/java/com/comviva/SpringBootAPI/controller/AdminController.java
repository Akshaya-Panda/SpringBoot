package com.comviva.SpringBootAPI.controller;

import java.util.ArrayList;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	import com.example.SpringBoot.bean.EmployeeBean;
	import com.example.SpringBoot.service.AdminService;

	@RestController
	@CrossOrigin(origins="*")
	@RequestMapping("/admin")
	public class AdminController {
		@Autowired
		private AdminService adserv;

		@GetMapping("/welcome")
		public String meth1() {
			return "<h1> Welcome to Spring Boot Application</h1>";
		}
		
		@PostMapping("/addEmp")
		public String meth2(@RequestBody EmployeeBean eb)
		{

	return "<h1>"+adserv.addEmployee(eb)+"record inserted successfully";
	}
		
		
//		@GetMapping("/findByIdName/{eid}/{ename}")
//		//public String meth7(@RequestBody EmployeeBean emp)
//		public String meth7(@PathVariable int eid, @PathVariable String ename)
//		{
	//	
	//System.out.println(eid);
	//System.out.println(ename);
	//System.out.println("inside postmapping.....");
	//int i= adserv.validateEmp(eid,ename);
	//if(i==1)
	//{
//		return "valid";
//				}
	//else {
//		return "invalid";
	//}
	//
	//	
	//}
}
	
	
	
