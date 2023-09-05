package com.newshoppingpassign.newshoppingassign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.newshoppingpassign"})
public class NewshoppingassignApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewshoppingassignApplication.class, args);
	}

}



