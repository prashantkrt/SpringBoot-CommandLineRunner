package com.myLearning.springApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp implements CommandLineRunner{
	
	@Value("${myproject.name}")
	private String projectName;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Run me");
		System.out.println("Project "+projectName);		
	}
}
