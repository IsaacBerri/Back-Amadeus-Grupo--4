package com.example.nodo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class  AmadeusBackApplication {
	public static void main(String[] args) {
		//SpringApplication.run(AmadeusBackApplication.class, args);
		ApplicationContext context = SpringApplication.run(AmadeusBackApplication.class, args);
	}
}
