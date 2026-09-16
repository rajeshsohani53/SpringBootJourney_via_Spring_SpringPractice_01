package com.rajesh;

import org.springframework.context.ApplicationContext;
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
        //now here we want to say hey continer i want the object of the student class 
        //we say this by using the AppplicationContext file okay 
          ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");//fully qualified name of config file
          //now we ask application contxt to give me object od student class
           Student s=context.getBean(Student.class);
           // or we can also do like as
           // Student s=(Student)context.getBean("student1")
           System.out.println(s);
    }
}
