package com.pradeep.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySources;

@Configuration
@SpringBootApplication
@PropertySources({})
public class App implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(App.class,args);
	}

	public void run (String...arg0) throws Exception {
	  System.out.println("Test");
	  System.out.println("Test1");
	}
}	