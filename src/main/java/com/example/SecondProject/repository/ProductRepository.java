package com.example.SecondProject.repository;

import com.example.SecondProject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    Product getByName(String name);
}