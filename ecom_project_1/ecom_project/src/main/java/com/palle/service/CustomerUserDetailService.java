package com.palle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.palle.entity.User;
import com.palle.repository.UserRepository;

public class CustomerUserDetailService implements UserDetailsService {
	 @Autowired
	    private UserRepository userRepository;
 
	    @Override
	    public UserDetails loadUserByUsername(String username) {

	        User user = userRepository.findByUsername(username)
	            .orElseThrow(() -> new UsernameNotFoundException("User not found"));

	        return org.springframework.security.core.userdetails.User
	                .withUsername(user.getUsername())
	                .password(user.getPassword())
	                .roles("USER")
	                .build();
	    }
}
