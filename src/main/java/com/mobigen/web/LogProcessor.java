package com.mobigen.web;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

public class LogProcessor {
	
	private static final Logger logger = LoggerFactory.getLogger(LogProcessor.class);
	
	private int a = 1;
	
	@Scheduled(fixedRate=10000)
	public void process() {
		logger.info(new Date() + " " + a++);
	}

}
