package com.ramos.springboot.crudjpa.springboot_crudjpa.services;

import java.util.List;

import com.ramos.springboot.crudjpa.springboot_crudjpa.entities.User;

public interface UserService {
    
    List<User> findAll(); 

    User save(User user);
}
