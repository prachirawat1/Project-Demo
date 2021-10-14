package com.example.amazaan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.amazaan.model.Order;

public interface OrderRepo extends JpaRepository<Order, Long>{

}
