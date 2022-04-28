package com.example.SecondProject.service;

import com.example.SecondProject.entity.Product;
import com.example.SecondProject.repository.ProductReository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
public class ProductServices {
    @Autowired
    private ProductReository reository;

    @PostMapping
    public Product addProduct(Product product){
        return reository.save(product);
    }

    @PostMapping
    public List<Product> addProducts(List<Product> products) {
        return  reository.saveAll(products);
    }

    @GetMapping
    public List<Product> showProducts(){
        return reository.findAll();
    }

    @GetMapping
    public Product showProductById(int id){
        return reository.getById(id);
    }

    @GetMapping
    public Product showProductByName(String name){
        return reository.getByName(name);
    }

    @PutMapping
    public Product update(int id){
        Product existingProduct=
    }

}
