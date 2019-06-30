package com.spring.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author venkataudaykiranp
 * 
 * <p>
 * 	we can start Spring boot application without using @SpringBootApplication.
 * 	Ex: We can also start Spring boot application by Configure with below annotations
 * 		@Configuration, @EnableAutoConfiguration
 * </p>
 * <p>
 * 	The @SpringBootApplication annotation enables auto-configuration and component scanning.
 * </p>
 *
 */
@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
	
}
