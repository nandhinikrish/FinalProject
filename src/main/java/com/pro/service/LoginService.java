package com.pro.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.pro.model.*;
import com.pro.dao.LoginDao;
import com.pro.model.Login;


public class LoginService {
	
	@Autowired
	private LoginDao loginDAO;
 
	public String login(int id)
	
	{
		Login log= new Login();
		
	
		log= loginDAO.getLogin(id);
		String s=log.getPwd();
		String s1=log.getUname();
		//System.out.println(s1);
	
		return s;
	
	}
	
	/*public Login login(int id)
	
	{
		Login log= new Login();
		
	
		log= loginDAO.getLogin(id);
	 String s=	log.getPwd();
		System.out.println(s);
	
		return log;
	
	}*/
	
	
	public void addlogin(Customer customer) {
		  loginDAO.addlogin(customer);  
		
	}
	
	
}
