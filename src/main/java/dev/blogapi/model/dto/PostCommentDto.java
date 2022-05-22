package dev.blogapi.model.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostCommentDto {
    private int postCommentId;
    private int authorId;
    private String authorFirstName;
    private String authorLastName;
    private String postCommentContent;
    private Date postCommentCreateDate;
}
