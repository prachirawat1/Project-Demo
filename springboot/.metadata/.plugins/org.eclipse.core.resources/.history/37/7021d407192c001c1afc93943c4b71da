package com.example.amazaan.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.amazaan.Service.UserService;
import com.example.amazaan.model.User;

@org.springframework.web.bind.annotation.RestController


public class RestController {
	@Autowired
	private UserService service;
@PostMapping("/save-user")
@Transactional
@CrossOrigin

public String registerUser(@RequestBody User user) {
	service.saveMyUser(user);
	return "Hello "+user.getFirstName()+"your registration is successful";
}

@GetMapping("/all-users")
public Iterable<User>showAllUsers(){
	return service.showAllUser();
}

@CrossOrigin
@PostMapping("/login")
public User loginUser(@RequestBody User user) throws Exception {
	String tempEmail=user.getEmail();
	String tempPass=user.getPassword();
	User userobj = null;
	if (tempEmail !=null && tempPass != null) {
		userobj=service.fetchUserByEmailAndPassword(tempEmail, tempPass);
	}
	if(userobj==null) {
		throw new Exception("bad credentials");
	}
	return userobj;
}
@PostMapping("/saveAll-user")
@Transactional
public String registerAllUser(@RequestBody List <User> user) {
service.saveAllUser(user);
	return "Hello your registration is successful";
}
}