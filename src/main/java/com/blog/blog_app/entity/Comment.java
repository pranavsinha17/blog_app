package com.blog.blog_app.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="comments")
@Setter
@Getter
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String content;

@ManyToOne
private Post post;


@ManyToOne
private User user;


}
