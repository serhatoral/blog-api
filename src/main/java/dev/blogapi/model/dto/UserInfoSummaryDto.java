package dev.blogapi.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoSummaryDto {

    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private String intro;
    private String profile;
    
}
