package dev.blogapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dev.blogapi.model.User;
import dev.blogapi.model.dto.UserInfoSummaryDto;


public interface UserRepository extends JpaRepository<User, Integer>{

    @Query("Select new dev.blogapi.model.dto.UserInfoSummaryDto" + 
    " (u.id, u.firstName, u.lastName, u.email, u.intro, u.profile)"+
    " From User u where firstName=:name or lastName=:name")
    List<UserInfoSummaryDto> findUserSummaryByName(String name);

    @Query("Select new dev.blogapi.model.dto.UserInfoSummaryDto" + 
    " (u.id, u.firstName, u.lastName, u.email, u.intro, u.profile)"+
    " From User u where firstName LIKE %:name% or lastName LIKE %:name%")
    List<UserInfoSummaryDto> findUserSummaryByNameContains(String name);
}
