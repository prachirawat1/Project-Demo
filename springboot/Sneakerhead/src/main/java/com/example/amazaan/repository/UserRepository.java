package com.example.amazaan.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.amazaan.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

	public Iterable<User> deleteByFirstName(String firstName);
	public User findByEmail(String email);
	public User findByEmailAndPassword(String email, String password);
}
