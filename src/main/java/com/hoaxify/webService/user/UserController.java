package com.hoaxify.webService.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hoaxify.webService.shared.GenericResponse;

@RestController
@RequestMapping("/api/1.0/users")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/createUser")
	public GenericResponse createUser(@RequestBody User user) {
		userService.createUser(user);
		return new GenericResponse("User created.");
	}

}