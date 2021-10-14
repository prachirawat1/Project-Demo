package com.example.amazaan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.amazaan.model.Cart;

public interface CartRepo extends JpaRepository<Cart, Long>  {

}
