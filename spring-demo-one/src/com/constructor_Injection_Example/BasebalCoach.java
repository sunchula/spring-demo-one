package com.constructor_Injection_Example;

import com.luv2code.springdemo.Coach;

public class BasebalCoach implements Coach{

	private FortuneService fortuneService;
	
	//Creating a constructor
	
	public BasebalCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkouot() {
		return "Spend 30 mins on Batting Practice Daily";
	}

	@Override
	public String getDailyMeals() {
		return "Have a Good Food After your match";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
