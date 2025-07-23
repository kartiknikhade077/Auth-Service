package com.smart.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.smart.entity.User;
import com.smart.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(String username, String rawPassword) {
        User user = new User();
        user.setEmail(username);
        user.setRole("ROLE_SUPERADMIN");
        user.setPassword(passwordEncoder.encode(rawPassword)); // Hash the password
        userRepository.save(user); // Save user to database
    }
}