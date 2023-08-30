package com.hoaxify.webService.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1.0/users")
public class UserController {

	private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @CrossOrigin
	@PostMapping("/createUser")
	public void createUser(@RequestBody User user) {
		log.info(user.toString());
	}

}