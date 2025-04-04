package com.ramos.springboot.crudjpa.springboot_crudjpa.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ramos.springboot.crudjpa.springboot_crudjpa.entities.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{
    
    
    Optional<Role> findByName(String name);
}
