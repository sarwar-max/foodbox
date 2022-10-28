package com.foodbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodbox.model.Login;
import com.foodbox.service.LoginService;

@RestController
@Scope("request")
public class LoginController {

	
	// http://localhost:8080/login
	
	@Autowired
	LoginService loginService;
	
	@PostMapping("/login")
	public String signIn(@RequestBody Login ll) {
			System.out.println(ll);
		return loginService.signIn(ll);
	}
}