package com.fantastic.adventure.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.fantastic.adventure.*" })
public class FantasticAdventureApplication {

	public static void main(String[] args) {
		SpringApplication.run(FantasticAdventureApplication.class, args);
	}

}
