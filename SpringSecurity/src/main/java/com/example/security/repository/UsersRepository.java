package com.example.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.security.pojo.User;

public interface UsersRepository extends JpaRepository<User, Long> {
	public User findUserByUsername(String username);
}
