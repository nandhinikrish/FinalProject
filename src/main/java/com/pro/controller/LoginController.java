package com.pro.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.pro.model.*;
import com.pro.service.LoginService;

 


@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	Login logs =new Login();
   Account acc=new Account();

	
	@RequestMapping("loginpage")
	public String add(Model m)
	{
		
		m.addAttribute("logindemo", new Login());
		return "login";
	}
	
	
	//@RequestMapping(value="validate",method=RequestMethod.GET)
/*	@RequestMapping(value="/loginsuc", method = RequestMethod.POST)
	public String saveUser(@Valid @ModelAttribute("logindemo")Login logindemo,BindingResult result,Model m)
	{
		 if (result.hasErrors())
			 {
	
			  return "login";
			 }
	 else
	 {
		m.addAttribute("user", logindemo);
  		loginService.login(1); 
  		System.out.println("u  "+logindemo);
  		  
	  return "welcome";
		
		
	}
	}
	*/
	@RequestMapping(value = "/loginsuc", method = RequestMethod.POST)
	
	public String saveUser(@Valid @ModelAttribute("logindemo")Login logindemo,Model m)
	{
      
		loginService.login(1);
		
		String s=logindemo.getPwd();
		//System.out.println(s);
	    String o=logindemo.getUname();
        
             if(s.equals("123") && o.equals("abc"))
            	 return "welcome";
             else
            	 return "fails";
        
	}
	
	

	@RequestMapping("/createaccount")
	
	public String addacc(Model m)
	{
		
		m.addAttribute("custo", new Customer());
		return "create";
	}
	
/*	
	@RequestMapping(value="/doAdd", method = RequestMethod.POST)
	public String saveUser(@Valid @ModelAttribute("custo")Customer custo,BindingResult result,Model m)
	{
		 if (result.hasErrors())
			 {
	
			  return "create";
			 }
	 else
	 {
		m.addAttribute("user", custo);
  		loginService.addlogin(custo); 
  		System.out.println("u  "+custo);
  		  
	  return "fails";
}
	
	}
	*/
	
	
	@RequestMapping(value="/doAdd", method = RequestMethod.POST)
	public String saveUser(@RequestParam("acctype") String acctype,Customer custo,BindingResult result,Model m)
	{
		String l= "Hello" +acctype;
		System.out.println(l);
		
		 if (result.hasErrors())
		 {

		  return "create";
		 }
		 else
		 {
			 m.addAttribute("user", custo);
		  		loginService.addlogin(custo); 
		  		System.out.println("u  "+custo);
		  		 return "createid";
		 }

}
	
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		 
	
	
	

