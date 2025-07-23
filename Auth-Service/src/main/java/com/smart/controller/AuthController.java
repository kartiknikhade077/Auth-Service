package com.smart.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smart.client.UserServiceClient;
import com.smart.dto.AuthRequest;
import com.smart.entity.User;
import com.smart.repository.UserRepository;
import com.smart.service.AuthService;
import com.smart.service.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	@Autowired
	private AuthService service;

	@Autowired
	private UserService userService;

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserServiceClient userServiceClient;

	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody AuthRequest authRequest) {
		userService.saveUser(authRequest.getUsername(), authRequest.getPassword());
		return ResponseEntity.ok("User registered successfully!");
	}

	@PostMapping("/login")
	public ResponseEntity<?> getToken(@RequestBody AuthRequest authRequest) {
		try {
			Authentication authenticate = authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
			SecurityContextHolder.getContext().setAuthentication(authenticate);
			if (authenticate.isAuthenticated()) {
				final String token = service.generateToken(authRequest.getUsername());
				User user = userRepository.getUserByUserName(authRequest.getUsername());
				Map<String,String> userDetials=new HashMap<String,String>();
				userDetials.put("jwtToken", token);
				userDetials.put("role", user.getRole());
				return ResponseEntity.ok(userDetials);

			} else {
				throw new RuntimeException("invalid access");
			}

		} catch (Exception e) {
			e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred during authentication: " + e.getMessage());
	}
	}
	@GetMapping("/validate")
	public ResponseEntity<?> validateToken(@RequestParam("token") String token) {
		try {
			service.validateToken(token);
			return ResponseEntity.ok("Token is valid");
		} catch (Exception e) {
			Map<String, Object> error = new HashMap<>();
			error.put("status", 403);
			error.put("error", "Forbidden");
			error.put("message", "Token is invalid or expired");

			return ResponseEntity.status(403).body(error);
		}
	}

}
