package com.example.amazaan.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amazaan.model.Cart;
import com.example.amazaan.model.Product;
import com.example.amazaan.repository.CartRepo;
import com.example.amazaan.repository.ProductRepo;
import com.example.amazaan.repository.UserRepository;
@Service


public class CartService {
	private ProductRepo repo;
private UserRepository userrepo;

private CartRepo cartrepo;


public void addToCart(long product_id, long user_id) {
	
	Cart cart=new Cart();
	cart.setProduct_id(product_id);
	cart.setQty(cart.getQty()+ 1);
	cart.setPrice(cart.getPrice());
	cart.setOrderPlaced(false);
	cartrepo.save(cart);
	
}
}