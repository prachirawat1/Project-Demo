package com.example.amazaan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.amazaan.Service.CartService;
import com.example.amazaan.model.Product;
import com.example.amazaan.model.User;


@RestController
@RequestMapping("/addtocart")
public class CartController {
@Autowired
private CartService cartserivce;

	
	
	
//	@PostMapping("/save")
//	public  void addToCart(@RequestBody Product product_id ) {
//		cartservice.
//		
//	}
}

