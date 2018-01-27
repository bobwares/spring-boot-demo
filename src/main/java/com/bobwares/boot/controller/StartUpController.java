package com.bobwares.boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class StartUpController {

	private static final Logger LOGGER = LoggerFactory.getLogger( StartUpController.class);

	@RequestMapping("start")
	public String schedule() {
		LOGGER.info("End point is active for resource start.");
		return "Hello World";
	}
}
