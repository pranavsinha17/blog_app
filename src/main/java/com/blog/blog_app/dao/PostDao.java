package com.blog.blog_app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.blog_app.entity.Post;

public interface PostDao extends JpaRepository<Post, Integer>{

}
