package dev.blogapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.blogapi.model.User;
import dev.blogapi.model.dto.UserInfoSummaryDto;
import dev.blogapi.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

     private final UserRepository userRepository;

     @Autowired
     public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
     }

    @Override
    public Optional<User> findById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public UserInfoSummaryDto findUserSummaryDtoById(int id) {
        User user = userRepository.getById(id);
        UserInfoSummaryDto userSummary= new UserInfoSummaryDto(
            user.getUserId(), user.getFirstName(),user.getLastName(), user.getEmail(),
            user.getIntro(),user.getProfile()
        );

        return userSummary;
    }

}
