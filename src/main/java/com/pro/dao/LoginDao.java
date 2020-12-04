package com.pro.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.pro.model.*;
import com.pro.model.Login;

public class LoginDao {
	
	@Autowired
	private	 SessionFactory sessionFactory;

	public Login getLogin(int id)
	{
		Login login1=null;
		Session session=sessionFactory.openSession();
		 String hql="from Login where id="+id;
	  	 Query query = session.createQuery(hql);
	  	 
	  //	 query.setParameter(id, 1);
	  	 List<Login> list=query.getResultList();
	  	 
	  	 for (Login u:list)
	  	 {
	  		 login1=u; 
	  	 }
	  	 
	  	 return login1;
	  	       
	  	 
	  	         
	}
	
	
	
	public void addlogin (Customer customer) {
		   
		 Session session=sessionFactory.openSession();
		  Transaction tx=session.beginTransaction();
		  session.save(customer);
		  tx.commit();
		  session.close(); 
	  }
	

	
	/*public String addlogin (Customer customer,Account account) {
		   
		 Session session=sessionFactory.openSession();
		  Transaction tx=session.beginTransaction();
		  session.save(customer);
		  account.setAcctype(customer);
		  tx.commit();
		  session.close(); 
	  }*/
}
