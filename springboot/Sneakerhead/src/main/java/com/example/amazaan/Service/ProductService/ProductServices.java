package com.example.amazaan.Service.ProductService;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import java.util.List;
	import com.example.amazaan.repository.ProductRepo;
	import com.example.amazaan.repository.UserRepository;
	import com.example.amazaan.model.Product;
import com.example.amazaan.model.User;



	@Service
	public class ProductServices {

	@Autowired	
	private ProductRepo productRepo;
	public List<Product> getAllproduct(){
		System.out.println(productRepo.findAll().toString());
	return productRepo.findAll();	
	
	}
		
	 public Iterable<Product> deleteById(long Id){
		 productRepo.deleteById(Id);
		 return productRepo.findAll();	
		
	 }	
	}


