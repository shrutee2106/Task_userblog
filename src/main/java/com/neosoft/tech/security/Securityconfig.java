package com.neosoft.tech.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
public class Securityconfig extends WebSecurityConfigurerAdapter {
	
	@Bean
	 @Override
	 public UserDetailsService userDetailsService() {
	  UserDetails user = User.withDefaultPasswordEncoder()
	    .username("admin")
	    .password("123")
	    .roles("ADMIN")
	    .build();
	  return new InMemoryUserDetailsManager(user);
	 }
	 
	 @Override
	 protected void configure(HttpSecurity http) throws Exception {
	  http.httpBasic().and().authorizeRequests()
	   .antMatchers("/api/**").hasRole("ADMIN")
	   .and().csrf().disable().headers().frameOptions().disable();
	 }

}
