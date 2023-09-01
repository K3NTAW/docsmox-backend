package org.example.controller;

import org.example.entities.User;
import org.example.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@RestController
@RequestMapping("api/users")
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        user.setId(UUID.randomUUID());
        return userRepository.save(user);
    }

    @GetMapping("")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
<<<<<<< HEAD
    public User getUserById(@PathVariable("id") UUID id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        }
        logger.info("user not found" + user.toString());
        return null;
=======
    public User getUserById(@PathVariable int id) {
        return userRepository.findById(id).orElse(null);
>>>>>>> 78b733f3572af52c0d88305914144d4e56b1800d
    }
}

