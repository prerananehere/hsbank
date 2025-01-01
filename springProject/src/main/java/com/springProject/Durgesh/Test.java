package com.springProject.Durgesh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	 public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springProject/Durgesh/config.xml");
	        Employee employee1=(Employee)context.getBean("employee1");
	        System.out.println(employee1);
	    }
	}



