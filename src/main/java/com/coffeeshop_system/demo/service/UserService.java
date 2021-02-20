package com.coffeeshop_system.demo.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.coffeeshop_system.demo.repository.User;
import com.coffeeshop_system.demo.model.user;

@Service
public class UserService {
	
	@Autowired
	User user;
	
	public Iterable<user> getAllUsers() {
		return user.findAll();
	}
	
	public user userByID(int id) {
		return user.findById(id).get();
	}
	
	public void addUser(user us) {
		user.save(us);
	}
}
