package com.hr.springIOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beans.xml");
		
		Sim sim=context.getBean("sim",Sim.class);
		sim.calling();
		System.out.print("\n");
		sim.data();
		context.close();
	}

}
