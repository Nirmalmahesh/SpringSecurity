package com.example.security;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Integer> {

	public Users findByUname(String uname);
}
