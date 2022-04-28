package com.example.SecondProject.service;

import com.example.SecondProject.entity.Product;
import com.example.SecondProject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
public class ProductServices {
    @Autowired
    private ProductRepository reository;

    public Product addProduct(Product product){
        return reository.save(product);
    }

    public List<Product> addProducts(List<Product> products) {
        return  reository.saveAll(products);
    }

    public List<Product> showProducts(){
        return reository.findAll();
    }

    public Product showProductById(int id){
        return reository.findById(id).orElse(null);
    }

    public Product showProductByName(String name){
        return reository.getByName(name);
    }

    public Product update(Product product){
        Product existingProduct=reository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return reository.save(existingProduct);
    }

    public String delete(int id){
        reository.deleteById(id);
        return "Product "+id+" Deleted:)";
    }

}
