package com.example.amazaan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.amazaan.model.Category;


public interface CategoryRepo extends JpaRepository<Category, Long>{

}
