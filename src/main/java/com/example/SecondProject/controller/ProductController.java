package com.example.SecondProject.controller;

import com.example.SecondProject.entity.Product;
import com.example.SecondProject.repository.ProductRepository;
import com.example.SecondProject.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductServices services;

    @PostMapping("/addProduct")
    public Product addProduct(Product product){
        return services.addProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(List<Product> products){
        return services.addProducts(products);
    }

    @GetMapping("/getProducts")
    public  List<Product>  getProducts(){
        return services.showProducts();
    }

    @GetMapping("/getProductById")
    public  Product getProductById(int id){
        return services.showProductById(id);
    }
}
