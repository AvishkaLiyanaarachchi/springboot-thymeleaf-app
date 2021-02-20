package com.coffeeshop_system.demo.repository;
import com.coffeeshop_system.demo.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface User extends JpaRepository<user,Integer>{

}
