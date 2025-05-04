package com.karan.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

		Human human = context.getBean(Human.class);  // This will get the Human bean from the Spring context
		human.canWin();   // This will call the compile method of Gorillas class
	}

}
