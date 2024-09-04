package com.vinu.publication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vinu.publication.model.Useee;
import com.vinu.publication.repository.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostMapping("/user")
    public Useee newUser(@RequestBody Useee newUser) {
        // Log the received Userr object
        logger.info("Received new user: {}", newUser);
        logger.info("Received new user: {}", newUser.getPublicationDate().toString());
        return userRepository.save(newUser);
    }
}
