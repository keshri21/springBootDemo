package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ac) {
		return hell -> {
			System.out.println("let's inspect beans provided by spring boot");
			
			String []beans = ac.getBeanDefinitionNames();
			Arrays.sort(beans);
			for(String bean : beans) {
				System.out.println(bean);
			}
		};
	}
}
