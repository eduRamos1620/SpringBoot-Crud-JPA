package com.ramos.springboot.crudjpa.springboot_crudjpa.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ramos.springboot.crudjpa.springboot_crudjpa.services.ProductService;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

@Component
public class IsExistsDbValidation implements ConstraintValidator<IsExistsDb, String>{

    @Autowired
    private ProductService service;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (service == null) {
            return true;
        }
        return value != null && !service.existsBySku(value);
    }
    
}
