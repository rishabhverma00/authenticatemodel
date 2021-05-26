package com.web.authenticatemodel.wrapper;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author Rishabh
 *
 */
@JsonInclude(Include.NON_EMPTY)
public class UserDetailWrapper {

	@Size(max = 255, min = 5, message = "Invaid username")
	private String username;

	@Size(max = 255, min = 5, message = "Invaid name")
	private String name;

	@Size(max = 255, min = 2, message = "Invaid role name")
	private String role;

	private Boolean enabled;

	private String checksum;

	@Size(max = 50, min = 5, message = "Invalid email")
	private String email;

	public UserDetailWrapper(String username, String name, String role, Boolean enabled, String email) {
		this.username = username;
		this.name = name;
		this.role = role;
		this.enabled = enabled;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getChecksum() {
		return checksum;
	}

	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserDetailWrapper [username=");
		builder.append(username);
		builder.append(", name=");
		builder.append(name);
		builder.append(", role=");
		builder.append(role);
		builder.append(", enabled=");
		builder.append(enabled);
		builder.append("]");
		return builder.toString();
	}
}
