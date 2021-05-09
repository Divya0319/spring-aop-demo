package com.springlearning.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public CricketCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes in batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
