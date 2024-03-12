package com.colak.springreactiveretrytutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class SpringReactiveRetryTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringReactiveRetryTutorialApplication.class, args);
	}

}
