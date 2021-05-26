package com.web.authenticatemodel.service;

import java.util.List;
import java.util.Map;

import com.web.authenticatemodel.wrapper.UserDetailWrapper;
/**
 * @author Rishabh
 *
 */
public interface UserService {

	List<UserDetailWrapper> getAllUsers();

	Map<String, String> create(UserDetailWrapper user);

}
