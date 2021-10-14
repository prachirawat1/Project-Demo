package com.example.amazaan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.amazaan.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long>{

}
