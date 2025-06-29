package com.example.Code;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderExample {

	private static final Logger logger = LoggerFactory.getLogger(AppenderExample.class);

	public static void main(String[] args) {
		logger.debug("Debug message - for development details");
		logger.info("Info message - general application flow");
		logger.warn("Warning message - something might be wrong");
		logger.error("Error message - something went wrong");
	}
}
