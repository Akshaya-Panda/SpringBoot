package com.example.mvc.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.mvc.hibernate.bean.EmployeeBean;
import com.example.mvc.hibernate.service.AdminService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adserv;
@RequestMapping("/welcome")//can also use GetMapping("/welcome")
	public String meth1()
	{
		return "<h1>Welcome to Spring MVC Apllication</h1>";
	}
@GetMapping("/login")
public ModelAndView mwth2()
{
	return new ModelAndView("AdminLogin");
}

@GetMapping("/first")
public ModelAndView mwth3()
{
	return new ModelAndView("AdminWelcome");
}

@GetMapping("/validate")
public ModelAndView mwth4(@RequestParam("user")String usr,@RequestParam("pass")String pass)
{
	if((usr.equals("AD-001") && pass.equals("AD-001")))
	{
		return new ModelAndView("Valid");
	}
	else {
		return new ModelAndView("Invalid");
	}
}

//@GetMapping("/addEmp")
//public String meth5(@ModelAttribute("emp")EmployeeBean emp)
//{
//return "<h1>"+emp.getEid()	+" "+emp.getEname()	+" "+emp.getEsal()+"</h1>";
//}

@GetMapping("/addEmp")
public String meth5(@ModelAttribute("emp")EmployeeBean emp)
{
    adserv.addEmployee(emp);
    return "<h1>1 record inserted successfully</h1>";
}

@RequestMapping(value="/updateEmp", method=RequestMethod.POST)

	public String meth6(@ModelAttribute("emp")EmployeeBean emp)
	{
		adserv.updateEmployee(emp);
	    return "<h1>1 record updated successfully</h1>";
	}

@RequestMapping("/deleteEmp")
public String meth7(@RequestParam("eid")int eid)
{
	adserv.deleteEmployee(eid);
    return "<h1>1 record deleted successfully</h1>";
}

@RequestMapping("/selectAll")
public ModelAndView meth8(Model m)
{
    m.addAttribute("obj",adserv.selectAll());
    return new ModelAndView("selectAll");
}




}

