package dev.blogapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.blogapi.model.User;
import dev.blogapi.model.dto.UserInfoSummaryDto;
import dev.blogapi.service.UserService;

@RestController
@RequestMapping("/")
@CrossOrigin
public class UserController {
    
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public Optional<User> findUserById(@RequestParam int id){
        return userService.findById(id);
    }

    @GetMapping("/user-summary")
    public UserInfoSummaryDto findUserSummaryById(@RequestParam int id){
        return userService.findUserSummaryDtoById(id);
    }

    @GetMapping("/get-user-summary")
    public List<UserInfoSummaryDto> findUserSummaryByName(@RequestParam String name){
        return userService.findUserSummaryByName(name);
    }

    @GetMapping("/search-user-summary")
    public List<UserInfoSummaryDto> findUserSummaryByNameContains(@RequestParam String name){
        return userService.findUserSummaryByNameContains(name);
    }
}
