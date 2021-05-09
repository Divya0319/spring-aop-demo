package com.springlearning.springdemo;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000mts as a warmup";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	

}
