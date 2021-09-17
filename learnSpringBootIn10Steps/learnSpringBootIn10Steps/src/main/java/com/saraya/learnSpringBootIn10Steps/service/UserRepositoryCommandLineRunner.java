package com.saraya.learnSpringBootIn10Steps.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.saraya.learnSpringBootIn10Steps.entity.User;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{
	
	private static final Logger logger = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Demba", "Admin");
		 userRepository.save(user);
		logger.info("New User is created : " + user);
		
		Optional<User> userWithIdOne = userRepository.findById(1L);
		logger.info("User is retrieved :" + userWithIdOne);
		
		List<User> users = userRepository.findAll();
		logger.info("All Users : " + users);
		
		
	}

}
