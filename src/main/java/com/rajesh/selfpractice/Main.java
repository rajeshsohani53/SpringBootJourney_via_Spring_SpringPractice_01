package com.rajesh.selfpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
	 ApplicationContext con=new  AnnotationConfigApplicationContext(Config.class);
	 Student s=con.getBean(Student.class);
	 s.studey();
}
}
