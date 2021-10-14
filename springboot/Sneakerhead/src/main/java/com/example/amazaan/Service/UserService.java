package com.example.amazaan.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amazaan.model.User;
import com.example.amazaan.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
  @Autowired
	private  UserRepository repo;
public UserService() {}
public UserService(UserRepository repo) {
	super();
	this.repo = repo;
}
  
 public void saveMyUser(User user) {
  repo.save(user);
  
 }
 public void saveAllUser(List<User> user) {
	 List<User>response = (List<User>)
	  repo.saveAll(user);
	  
	 }
 
 public Iterable<User> showAllUser(){
	 return repo.findAll();
 }
 

 
 
 public User fetchUserByEmailAndPassword(String email, String password) {
	return repo.findByEmailAndPassword(email, password);
 }
}



