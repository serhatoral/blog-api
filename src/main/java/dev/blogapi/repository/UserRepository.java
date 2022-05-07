package dev.blogapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.blogapi.model.User;


public interface UserRepository extends JpaRepository<User, Integer>{
}
