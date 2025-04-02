package com.ramos.springboot.crudjpa.springboot_crudjpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idproducts;
    
    private String name;
    private Integer price;
    private String description;


    public Long getIdproducts(){
        return idproducts;
    }
    public void setIdproducts(Long idproducts){
        this.idproducts = idproducts;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Integer getPrice(){
        return price;
    }
    public void setPrice(Integer price){
        this.price = price;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
}
