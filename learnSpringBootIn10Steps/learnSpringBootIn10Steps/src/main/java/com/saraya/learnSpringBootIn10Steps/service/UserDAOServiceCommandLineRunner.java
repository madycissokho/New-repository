package com.saraya.learnSpringBootIn10Steps.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.saraya.learnSpringBootIn10Steps.entity.User;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner{
	
	private static final Logger logger = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);

	@Autowired
	UserDAOService userDAOService;
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Mady", "Admin");
		long insert = userDAOService.insert(user);
		logger.info("New User is created : " + user);
		
		
		
	}

}
