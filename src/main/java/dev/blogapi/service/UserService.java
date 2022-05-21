package dev.blogapi.service;

import dev.blogapi.model.User;
import dev.blogapi.model.dto.UserInfoSummaryDto;

public interface UserService extends CrudService<User, Integer>{
    
    UserInfoSummaryDto findUserSummaryDtoById(int id);
}
