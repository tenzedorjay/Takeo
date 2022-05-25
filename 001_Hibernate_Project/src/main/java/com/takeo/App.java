package com.takeo;

import java.util.List;

import com.pojo.EmployePojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration config=new Configuration();
    	config.configure("com/config/hibernate.cfg.xml");
    	
    	SessionFactory factory=config.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	Query query=session.createQuery("from employe");
    	List<EmployePojo>list=query.getResultList();
    	for(EmployePojo e:list) {
    		System.out.println(e.getEid()+"  "+e.getEname()+"\t"+e.getEaddress());
    	}
    }
}
