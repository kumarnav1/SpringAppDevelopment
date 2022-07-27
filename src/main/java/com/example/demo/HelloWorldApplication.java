package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		System.out.print("Hello world form bridgelabz");
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
