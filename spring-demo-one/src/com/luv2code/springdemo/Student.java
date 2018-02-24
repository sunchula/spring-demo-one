package com.luv2code.springdemo;

public class Student implements Coach {

	@Override
	public String getDailyWorkouot() {
		// TODO Auto-generated method stub
		return "Study daily an Hour";
	}

	@Override
	public String getDailyMeals() {
		// TODO Auto-generated method 
		return "Have your Meals sharp at 08.00PM";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
