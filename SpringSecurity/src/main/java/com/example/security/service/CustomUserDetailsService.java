package com.example.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.security.pojo.User;
import com.example.security.repository.UsersRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	UsersRepository repo;
	
	User user;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		user = repo.findUserByUsername(username);
		if(user==null)
			throw new UsernameNotFoundException("User 404");
		
		return new CustomUserDetails(user); 
	}

	
}
