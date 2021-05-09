package com.springlearning.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneServicePractice implements FortuneService {
	
	@Value("${fortune.first}")
	private String fortune1;
	
	@Value("${fortune.second}")
	private String fortune2;

	
	@Value("${fortune.third}")
	private String fortune3;
	
	private String[] fortunes = {
			fortune1,
			fortune2,
			fortune3
	};
	
	private Random myRandom = new Random();


	@Override
	public String getFortune() {
				
		int index = myRandom.nextInt(fortunes.length);
		
		String theFortune = fortunes[index];
		
		return theFortune;
	}

}
