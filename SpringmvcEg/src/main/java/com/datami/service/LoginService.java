package com.datami.service;

import org.springframework.stereotype.Service;

@Service//spring creates now object of LoginService whereever required
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("user") && password.equals("password");
	}

}
