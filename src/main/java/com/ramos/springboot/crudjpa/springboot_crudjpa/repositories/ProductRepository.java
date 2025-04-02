package com.ramos.springboot.crudjpa.springboot_crudjpa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ramos.springboot.crudjpa.springboot_crudjpa.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
    
}
