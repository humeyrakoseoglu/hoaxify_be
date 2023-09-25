package com.hoaxify.webService.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hoaxify.webService.error.ApiError;
import com.hoaxify.webService.shared.GenericResponse;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/1.0/users")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/createUser")
	public ResponseEntity<?> createUser(@RequestBody User user) {
		if(user.getUserName() == null || user.getUserName().isEmpty()){
			ApiError apiError = new ApiError();
			apiError.setPath("/createUser");
			apiError.setMessage("Validation error");
			apiError.setStatus(400);
			Map<String, String> validationErrors = new HashMap<>();
			validationErrors.put("userName", "UserName cannot be null");
			apiError.setValidationErrors(validationErrors);
			return ResponseEntity.badRequest().body(apiError);
		}

		userService.createUser(user);
		return ResponseEntity.ok(new GenericResponse("User is created."));
	}

}