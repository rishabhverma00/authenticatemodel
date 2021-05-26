package com.web.authenticatemodel.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.web.authenticatemodel.model.User;
import com.web.authenticatemodel.wrapper.UserDetailWrapper;

/**
 * @author Rishabh
 *
 */
public interface UserDao extends JpaRepository<User, Integer> {

	@Query("select new com.web.authenticatemodel.wrapper.UserDetailWrapper(username, name, role, enabled, email) from User")
	List<UserDetailWrapper> getAllUsers();

	User findByUsername(String username);

}
