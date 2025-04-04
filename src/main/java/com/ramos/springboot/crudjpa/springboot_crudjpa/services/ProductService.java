package com.ramos.springboot.crudjpa.springboot_crudjpa.services;

import java.util.List;
import java.util.Optional;

import com.ramos.springboot.crudjpa.springboot_crudjpa.entities.Product;

public interface ProductService {
    
    List<Product> findAll();

    Optional<Product> findById(Long id);

    Product save(Product product);

    Optional<Product> update(Long id, Product product);

    Optional<Product> delete(Long id);

    boolean existsBySku(String sku);
}
