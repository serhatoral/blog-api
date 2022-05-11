package dev.blogapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.blogapi.model.Post;

public interface PostRepository extends JpaRepository<Post,Integer> {
    
}
