package com.blog.blog_app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="users")
@Setter
@Getter
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
	@Column(name = "user_name", nullable = false, length=100)
private String name;
	@Column(name = "user_email", nullable = false, length=100)
private String email;
	@Column(name = "user_password", nullable = false, length=100)
private String password;
	@Column(name = "about", length=100)
private String about;
}
