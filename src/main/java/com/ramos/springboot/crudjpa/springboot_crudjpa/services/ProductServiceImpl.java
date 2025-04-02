package com.ramos.springboot.crudjpa.springboot_crudjpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ramos.springboot.crudjpa.springboot_crudjpa.entities.Product;
import com.ramos.springboot.crudjpa.springboot_crudjpa.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return (List<Product>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Product> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Product save(Product product) {
        return repository.save(product);
    }

    @Override
    @Transactional
    public Optional<Product> delete(Product product) {
        Optional<Product> productDb = repository.findById(product.getIdproducts());
        
        productDb.ifPresent(prod -> {
            repository.delete(product);
        });
        return productDb;
    }
    
}
