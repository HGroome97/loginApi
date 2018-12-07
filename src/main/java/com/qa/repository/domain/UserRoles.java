package com.qa.repository.domain;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "user_roles")
public class UserRoles {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_role_id;

    @NotBlank
    private String username;

    @NotBlank
    private String role;

	public Long getUser_role_id() {
		return user_role_id;
	}

	public void setUser_role_id(Long user_role_id) {
		this.user_role_id = user_role_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
    
    
}
