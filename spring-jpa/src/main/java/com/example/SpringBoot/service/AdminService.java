package com.example.SpringBoot.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBoot.bean.EmployeeBean;
import com.example.SpringBoot.dao.AdminDao;
import com.example.SpringBoot.emailexception.MailException;

@Service
public class AdminService {
	@Autowired
	private AdminDao adao;
	
/*Here the user will add his details and if the email already exists it will show email already exists and the registration will not 
	be completed. After completion of the registration the data are inserted in the table.
	*/
public int addEmployee(EmployeeBean eb) throws MailException
	{
		int i=0;
		if(eb!=null)
		{
Optional<EmployeeBean> eb1=adao.findById(eb.getEmail());
//if email is present then it will not insert the records in to the database.
if(eb1.isPresent())
{
	throw new MailException("Email already registered");
}
adao.save(eb);
i=1;
return i;
	}
		else {
			return i;
			}
		}
	
}







