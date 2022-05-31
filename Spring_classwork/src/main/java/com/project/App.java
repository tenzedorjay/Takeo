package com.project;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/configuire/spring.xml"));
    	AddressPojo address=(AddressPojo) factory.getBean("address");
    	System.out.println(address.getSid()+"\t"+address.getSname()+"\n and the Employee details are "+address.getEmp().getEid()+"\n"+address.getEmp().getName());
    }
}
