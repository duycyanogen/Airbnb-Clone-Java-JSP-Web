package WebApplication.AirBnb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import WebApplication.AirBnb.service.impl.AccountServiceImpl;

@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	AccountServiceImpl accountService;
	
	@Autowired
	UserDetailsService userDetailsService;
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService)
		.passwordEncoder(passwordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.formLogin().loginPage("/trang-chu")
		.usernameParameter("mail")
		.passwordParameter("password");
		
		
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		
	}
}
