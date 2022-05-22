package dev.blogapi.service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.blogapi.model.Post;
import dev.blogapi.model.dto.PostCommentDto;
import dev.blogapi.model.dto.PostDetailDto;
import dev.blogapi.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }



    @Override
    public Optional<Post> findById(Integer id) {
        
        return postRepository.findById(id);
    }



    @Override
    public PostDetailDto findDetailDtoById(int id) {
       Post post = postRepository.getById(id);
       List<PostCommentDto> postCommentDtos = post.getPostComments().stream()
            .map(postComment -> new PostCommentDto(
                postComment.getPostCommentId(), postComment.getAuthor().getUserId(),
                postComment.getAuthor().getFirstName(), postComment.getAuthor().getLastName(),
                postComment.getPostCommentContent(), postComment.getPostCommentCreateDate())).collect(Collectors.toList());
        

       PostDetailDto postDetailDto = new PostDetailDto(
           post.getPostId(), post.getAuthor().getUserId(),  post.getAuthor().getFirstName(),  post.getAuthor().getLastName(),
           post.getPostTitle(), post.getPostContent(), post.getPostCreateDate(), post.getPostUpdateDate(),
           post.getNumberOfLikes(), post.getNumberOfDislikes(), post.getCategories(), postCommentDtos 
       ); 
        return postDetailDto;
    }
    
}
