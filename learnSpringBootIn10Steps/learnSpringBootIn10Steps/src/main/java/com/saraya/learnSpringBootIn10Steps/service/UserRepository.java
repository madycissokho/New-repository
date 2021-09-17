package com.saraya.learnSpringBootIn10Steps.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saraya.learnSpringBootIn10Steps.entity.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
