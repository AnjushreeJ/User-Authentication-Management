package com.palle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.palle.dto.LoginRequest;
import com.palle.entity.User;
import com.palle.service.UserService;

@RestController
@RequestMapping("/api/auth")

public class AuthController {
	
	@Autowired
    private AuthenticationManager authenticationManager;
	
	@Autowired
    private UserService userService;
	
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {

        Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(
                request.getUsername(),
                request.getPassword()
            )
        );
        return ResponseEntity.ok("Login Successful");
    }
    @GetMapping("/user")
    public User getUser(Authentication authentication) {
        String username = authentication.getName();
        return userService.getUserByUsername(username);
    }
}

