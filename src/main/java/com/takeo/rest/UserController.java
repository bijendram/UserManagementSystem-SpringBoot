package com.takeo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.takeo.model.User;
import com.takeo.service.impl.UserServiceImpl;

@RestController
public class UserController {
	
	private UserServiceImpl daoService;
	
	@PostMapping("/users")
	public ResponseEntity<String> createUser(@RequestBody  User user)
	{
		boolean flag=daoService.register(user);
		String msg="";
		if(flag)
			msg="Registered Successfully";
		else
			msg="Try later";
		
		return ResponseEntity.ok(HttpStatus.OK).ok(msg);
	}
	
	@GetMapping("/users/{uname}/{pass}")
	public String verifyUserNameAndPassWord(String uname,String pass)
	{
		boolean flag=daoService.verifyUserNameAndPassWord(uname, pass);
		
		String msg="";
		
		if(flag)
			msg="Valid User";
		else
			msg="Invalid User";
		
		return msg;
	}

}
