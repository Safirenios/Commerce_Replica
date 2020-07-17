package com.product.service.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/create", method = RequestMethod.POST, headers = "Accept=application/json")
	public UserVO createUser(UserVO user) {
		// userService.createUser(user);
		return user;
	}

//	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
//	@ResponseBody
//	public UserVO getUser(@PathVariable UUID id) {
//		return userManager.getUser(id);
//		
//	}
//	
//	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers = "Accept=application/json")
//	public UUID deleteUser(UUID id) {
//		return null;
//	}

}
