package com.example.springbootmvcannotations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMvcAnnotationsApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringBootMvcAnnotationsApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcAnnotationsApplication.class, args);
		logger.info("Info logger");
		logger.debug("Debug logger");
		logger.warn("Warning logger");
		logger.error("Error logger");
	}

}
