package com.datami.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.datami.service.LoginService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = " Login Controller")
@Controller
public class LoginController {
	
	//LoginService service =new LoginService();//not a good practice to use like this
	
	@Autowired
	//Set the login Service - This is known as Autowiring in spring framework
	LoginService service;//this is ideal way:It provides dependency Injection as someone other should provide LoginService object.Here comes feature of Spring which provides us object and that's why spring framework is famous
	@ApiOperation(value = "Display login page")
	@RequestMapping(value= "/login",method=RequestMethod.GET)
	//@ResponseBody
	public String showLoginPage()
	{
		return "login";
		
	}
	@RequestMapping(value= "/login",method=RequestMethod.POST)
	//@ResponseBody
	public String handleLoginRequest(@RequestParam String name,@RequestParam String password,ModelMap model)
	{
		//System.out.println(name);
		if(service.validateUser(name,password)) {
		model.put("name", name);
		model.put("password", password);
		return "welcome";
		}
		else {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
	}
}

