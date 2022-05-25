package dev.blogapi.service;

import java.util.List;

import dev.blogapi.model.User;
import dev.blogapi.model.dto.UserInfoSummaryDto;

public interface UserService extends CrudService<User, Integer>{
    
    UserInfoSummaryDto findUserSummaryDtoById(int id);
    List<UserInfoSummaryDto> findUserSummaryByName(String userName);
    List<UserInfoSummaryDto> findUserSummaryByNameContains(String userName);
}
