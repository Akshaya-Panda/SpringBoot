package com.example.SpringBoot.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class Controller {
@RequestMapping("/welcome")
public String meth1()
{
	return "Welcome to Spring Web Application";
}

@RequestMapping("/data")
public ArrayList<String> meth2() {
	
	
	ArrayList<String> al=new ArrayList<String>();
	al.add("Mango");
	al.add("Orange");
	return al;
	
	
}



}
