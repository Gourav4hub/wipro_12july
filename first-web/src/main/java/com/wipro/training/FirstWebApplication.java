package com.wipro.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class FirstWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstWebApplication.class, args);
	}

}
