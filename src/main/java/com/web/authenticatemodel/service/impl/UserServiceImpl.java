package com.web.authenticatemodel.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.web.authenticatemodel.dao.UserDao;
import com.web.authenticatemodel.model.User;
import com.web.authenticatemodel.service.UserService;
import com.web.authenticatemodel.wrapper.UserDetailWrapper;
/**
 * @author Rishabh
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public List<UserDetailWrapper> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	public Map<String, String> create(UserDetailWrapper user) {
		Map<String, String> resultMap = new HashMap<>();
		if (userDao.findByUsername(user.getUsername()) != null) {
			resultMap.put("message", "Username already exist");
		} else {
			User userObject = new User();
			userObject.setEnabled(true);
			userObject.setName(user.getName());
			userObject.setPassword(new BCryptPasswordEncoder().encode(user.getChecksum()));
			userObject.setRole(user.getRole());
			userObject.setUsername(user.getUsername());
			userObject.setEmail(user.getEmail());
			userDao.save(userObject);
			resultMap.put("message", "success");

		}
		return resultMap;
	}

	@EventListener
	public void createFirstUser(ContextRefreshedEvent event) {
		System.out.println("Inside first user create");
		User userObject = new User();
		userObject.setEnabled(true);
		userObject.setName("TestUser");
		userObject.setPassword(new BCryptPasswordEncoder().encode("Pass@123"));
		userObject.setRole("Admin");
		userObject.setUsername("testuser");
		userObject.setEmail("test@gmail.com");
		userDao.save(userObject);
	}

}
