package com.example.SecondProject.controller;

import com.example.SecondProject.entity.Product;
import com.example.SecondProject.repository.ProductRepository;
import com.example.SecondProject.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductServices services;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return services.addProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {

        return services.addProducts(products);
    }

    @GetMapping("/getProducts")
    public List<Product> getProducts() {

        return services.showProducts();
    }

    @GetMapping("/getProductById/{id}")
    public Product getProductById(@PathVariable int id) {
        return services.showProductById(id);
    }

    @GetMapping("/getProductByName/{name}")
    public Product getProductByName(@PathVariable String name) {
        return services.showProductByName(name);
    }

    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product) {
        return services.update(product);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id) {
        return services.delete(id);
    }

}
