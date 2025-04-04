package com.ramos.springboot.crudjpa.springboot_crudjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:messages.properties")
public class SpringbootCrudjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudjpaApplication.class, args);
	}

}
