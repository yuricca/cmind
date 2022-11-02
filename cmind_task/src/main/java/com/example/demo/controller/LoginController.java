package com.example.demo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Staff;
import com.example.demo.security.LoginUserDetails;

@Controller
public class LoginController {
	//ログイン画面への遷移
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}

	//ログイン成功後top画面の表示
	@PostMapping("login")
	public String postLogin() {
		return "top";
	}
	
	@GetMapping("/")
	public String gettop(@AuthenticationPrincipal LoginUserDetails userDetails, Model model) {
		Staff staff = userDetails.getStaff();
		model.addAttribute(staff);
		return "top";
	}

	@PostMapping("/logout")
	public String logout() {
		return "login";
	}
}
