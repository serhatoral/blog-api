package dev.blogapi.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostSummaryDto {
    private int postId;
    private int authorId;
    private String authorFirstName;
    private String authorLastName;
    private String postTitle;
    private String postContent;
}
