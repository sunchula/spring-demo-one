package com.luv2code.springdemo;

public class BaseballCoach implements Coach{

	public String getDailyWorkouot(){
		
		return "Spend 30 mins on Batting Practice Daily";
	}

	@Override
	public String getDailyMeals() {
		// TODO Auto-generated method stub
		return "Have a Good Food After your match";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}
