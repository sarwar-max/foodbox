package com.foodbox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodbox.model.Login;
import com.foodbox.repository.LoginRepository;



@Service
public class LoginService {
	
	@Autowired
	LoginRepository loginRepository;
	
	@SuppressWarnings("unused")
	public String signIn(Login login) {
		
		boolean res = loginRepository.existsById(login.getEmailid());
		if(login.getTypeOfUser().equals("admin")) {
			if(loginRepository.checkLoginDetails(login.getEmailid(), login.getPassword(),login.getTypeOfUser())!=null) {
				return "admin login successfully";
			}else {
				return "failure";
			}
		}else {
			if(loginRepository.checkLoginDetails(login.getEmailid(), login.getPassword(),login.getTypeOfUser())!=null) {
				return "user login successfully";
			}else {
				return "failure";
			}
		}
	}
}

