package com.ramos.springboot.crudjpa.springboot_crudjpa.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ramos.springboot.crudjpa.springboot_crudjpa.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{
    
    boolean existsByUsername(String username);

    Optional<User> findByUsername(String username);
}
