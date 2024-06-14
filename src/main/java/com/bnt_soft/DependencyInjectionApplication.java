package com.bnt_soft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
		Sim sim=context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();
		
	}

}
