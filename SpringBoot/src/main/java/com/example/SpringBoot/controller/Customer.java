package com.example.SpringBoot.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class Customer {
	
	
	@RequestMapping("/come")
	public String meth3()
	{
		return "Welcome to Spring Web Application";
	}

	@RequestMapping("/data")
	public ArrayList<String> meth4() {
		
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Mango");
		al.add("Orange");
		return al;
		
		
	}



	}


