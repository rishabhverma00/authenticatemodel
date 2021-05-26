package com.web.authenticatemodel.rest;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.authenticatemodel.service.UserService;
import com.web.authenticatemodel.wrapper.UserDetailWrapper;
/**
 * @author Rishabh
 *
 */
@Controller
@ResponseBody
@RequestMapping(path = "/")
public class UserRestImpl {

	@Autowired
	UserService userService;

	@GetMapping(path = "users")
	public List<UserDetailWrapper> getAllUsers() {
		return userService.getAllUsers();
	}

	@PostMapping(path = "create", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> create(@RequestBody(required = true) @Valid UserDetailWrapper user) {
		return userService.create(user);
	}

}
