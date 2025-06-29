package com.example.Code;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {
	private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

	public static void main(String[] args) {
		String username = "Laura";
		int age = 25;

		logger.info("User {} has logged in.", username);
		logger.warn("User {} is approaching the age limit: {}", username, age);
		logger.error("Error occurred for user {} with age {}", username, age);
	}
}
