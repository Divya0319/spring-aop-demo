package com.springlearning.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationPracticeApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		CricketCoach theCoach = context.getBean("cricketCoach", CricketCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// close the container
		context.close();

	}

}
