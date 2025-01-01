package com.springProject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springProject/config.xml");
        Student student1=(Student)context.getBean("student1");
        System.out.println(student1);
    }
}
