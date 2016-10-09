package com.aims.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class LoginHandlerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginHandlerServiceApplication.class, args);
	}
}
