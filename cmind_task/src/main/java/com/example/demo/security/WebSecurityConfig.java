package com.example.demo.security;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

//	SpringBoot5.7以降のSpringSecurity（ソース：https://www.docswell.com/s/MasatoshiTada/KGVY9K-spring-security-intro#p17）
	@Bean
	public SecurityFilterChain securityfilterChain(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests(authz -> authz
				//cssやjs,imagesなどの静的リソースのアクセスを可能にする。
				.requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
				//ログイン画面は誰でもアクセス可能
				.mvcMatchers("/login").permitAll()
				.anyRequest().authenticated()
			).formLogin(login -> login
				//employee_id,passwordの送信先URL
				.loginProcessingUrl("/login")
				//ログイン画面のURLを指定
				.loginPage("/login")
				//ログイン成功後のリダイレクト先URL
				.defaultSuccessUrl("/")
				//ログイン失敗後のリダイレクト先URL
				.failureUrl("/login?error")
			).logout(logout -> logout
				//ログアウト時のURLを指定
				.logoutSuccessUrl("/")
			);
		return http.build();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}
	
}