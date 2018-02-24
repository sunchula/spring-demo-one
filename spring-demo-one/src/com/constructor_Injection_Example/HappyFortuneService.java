package com.constructor_Injection_Example;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		return "Today is your Luck Day";
	}
}
