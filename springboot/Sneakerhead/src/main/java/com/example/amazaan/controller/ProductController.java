package com.example.amazaan.controller;
import java .util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.amazaan.model.Product;
import com.example.amazaan.model.User;
import com.example.amazaan.Service.ProductService.ProductServices;
@org.springframework.web.bind.annotation.RestController
@CrossOrigin
@RequestMapping("/product")
public class ProductController {
	 @Autowired
	
	ProductServices ProductServices;
	   @GetMapping(value="/getAll")
	public List<Product> getAllProduct(){
		return ProductServices.getAllproduct();
	}
	
	   @GetMapping("/delete/{Id}")
	   @Transactional
	   public Iterable<Product> deleteById(@PathVariable("Id")long Id){
	   return ProductServices.deleteById(Id);
	   }
	   
	  
	   
	   
}
