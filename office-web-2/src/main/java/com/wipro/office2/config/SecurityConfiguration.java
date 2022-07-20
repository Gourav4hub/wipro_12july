package com.wipro.office2.config;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter 
{
	@Autowired
	private DataSource datasource; 
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{	
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		auth.jdbcAuthentication().dataSource(datasource).withUser("admin").password(encoder.encode("12345")).roles("OFFICE_ADMIN")
		.and().withUser("vikas").password(encoder.encode("54321")).roles("OFFICE_MANAGER")
		.and().withUser("meena").password(encoder.encode("123")).roles("OFFICE_HR");
	}
	
//	@Bean
//	PasswordEncoder encode() {
//		return NoOpPasswordEncoder.getInstance();
//	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.cors().disable();
		
		http.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/api/employee/").hasAnyRole("OFFICE_ADMIN","OFFICE_MANAGER","OFFICE_HR")
		.antMatchers("/api/address/").hasAnyRole("OFFICE_ADMIN","OFFICE_MANAGER")
		.antMatchers("/api/salaryrecord/").hasAnyRole("OFFICE_ADMIN","OFFICE_HR")
		.and()
		.exceptionHandling().accessDeniedPage("/accessDenied");
		
		super.configure(http);
	}
}
