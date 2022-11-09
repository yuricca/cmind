package com.example.demo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.FormValidation;
import com.example.demo.model.Staff;
import com.example.demo.security.LoginUserDetails;

@Controller
@RequestMapping("/")
public class LoginController {
	//ログイン画面への遷移
	@GetMapping("/login")
	public String getLogin(@ModelAttribute FormValidation formValidation) {
		return "login";
	}

	//ログイン成功後top画面の表示
	@PostMapping("/login")
	public String postLogin(@ModelAttribute @Validated FormValidation formValidation, BindingResult result, Model model) {
		if (result.hasErrors()) {
            return "login";
        }
		return "top";
	}
	
	//トップ画面にてログイン情報を取得
	@GetMapping("/")
	public String getTop(@AuthenticationPrincipal LoginUserDetails userDetails, Model model) {		
		Staff staff = userDetails.getStaff();
		model.addAttribute(staff);
		return "top";
	}

	@PostMapping("/logout")
	public String logout() {
		return "login";
	}
}
