package com.g1m3.redflix;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan("com.g1m3.redflix")
public class RedflixApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedflixApplication.class, args);
	}

}
