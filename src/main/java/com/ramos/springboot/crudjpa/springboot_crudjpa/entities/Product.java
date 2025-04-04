package com.ramos.springboot.crudjpa.springboot_crudjpa.entities;

import com.ramos.springboot.crudjpa.springboot_crudjpa.validation.IsExistsDb;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idproducts;

    @IsExistsDb
    @NotBlank
    private String sku;
    
    @NotEmpty(message = "{NotEmpty.product.name}")
    @Size(min = 3, max = 20)
    private String name;

    @Min(500)
    @NotNull(message = "{NotNull.product.price}")
    private Integer price;

    @NotBlank(message = "{NotBlank.product.description}")
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
    public String getSku() {
        return sku;
    }
    public void setSku(String sku) {
        this.sku = sku;
    }
}
