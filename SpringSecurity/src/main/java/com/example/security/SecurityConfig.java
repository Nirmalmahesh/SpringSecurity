package com.example.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	@Bean
	protected UserDetailsService userDetailsService() {
		// TODO Auto-generated method stub
		List<UserDetails> users = new ArrayList<UserDetails>();
		users.add(User.withDefaultPasswordEncoder().username("admin").password("Nirmal@1").build());
		return new InMemoryUserDetailsManager(users);
	}
	
}
