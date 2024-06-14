package com.furjoy.authentication.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminRepository userRepository;

    public boolean authenticate(String username, String password) {
        Admin user = userRepository.findByUsername(username);
        return user != null && user.getPassword().equals(password);
    }
}

