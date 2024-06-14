package com.furjoy.authentication.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.furjoy.authentication.model.User;
import com.furjoy.authentication.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}