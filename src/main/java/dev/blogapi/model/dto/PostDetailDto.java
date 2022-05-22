package dev.blogapi.model.dto;

import java.util.Date;
import java.util.List;

import dev.blogapi.model.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDetailDto {
    
    private int postId;
    private int authorId;
    private String authorFirstName;
    private String authorLastName;
    private String postTitle;
    private String postContent;
    private Date postCreateDate;
    private Date postUpdateDate;
    private int  numberOfLikes;
    private int  numberOfDislikes;
    private List<Category> categories;
    private List<PostCommentDto> postComments;

    
}
