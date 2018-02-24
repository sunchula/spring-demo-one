package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*Coach theTrackCoach = context.getBean("myTrackCoach", Coach.class);
		System.out.println(theTrackCoach.getDailyWorkouot());
		System.out.println(theTrackCoach.getDailyMeals());
		System.out.println("-------------------------");
		
		Coach theBaseballCoach = context.getBean("myBaseballCoach", Coach.class);
		System.out.println(theBaseballCoach.getDailyWorkouot());
		System.out.println(theBaseballCoach.getDailyMeals());
		System.out.println("-------------------------");
		
		Coach theStudent = context.getBean("myStudentBean", Coach.class);
		System.out.println(theStudent.getDailyWorkouot());
		System.out.println(theStudent.getDailyMeals());*/
	
		Coach theCoach = context.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkouot());
		System.out.println(theCoach.getDailyFortune());
		
	}

}
