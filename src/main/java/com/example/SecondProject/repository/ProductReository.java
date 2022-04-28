package com.example.SecondProject.repository;

import com.example.SecondProject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReository extends JpaRepository<Product,Integer> {

    Product getByName(String name);
}
