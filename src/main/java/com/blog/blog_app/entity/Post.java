package com.blog.blog_app.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="posts")
@Getter
@Setter
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer postId;
	@Column(name = "post_title", nullable = false, length=100)
	private String title;
	private String content;
	private String imageName;
	private Date addedDate;
	
	
	//Many to one (User - Post)
	
	@ManyToOne
	private User user;   //fk
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	
	
}
