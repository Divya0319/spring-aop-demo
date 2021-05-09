package com.springlearning.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneServicePractice")
	private FortuneService fortuneService;
	
//	@Autowired
//	public CricketCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
	// define  a default constructor
//	public CricketCoach() {
//		System.out.println(">>CricketCoach:  inside default constructor");	
//	}
	

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes in batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
