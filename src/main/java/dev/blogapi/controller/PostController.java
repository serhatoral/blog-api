package dev.blogapi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.blogapi.model.Post;
import dev.blogapi.model.dto.PostDetailDto;
import dev.blogapi.service.PostService;

@RestController
@CrossOrigin
public class PostController {
    
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/post")
    public ResponseEntity<Optional<Post>> findPostById(@RequestParam int id){
        return new ResponseEntity<Optional<Post>>(postService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/post-detail")
    public ResponseEntity<PostDetailDto> findPostDetailById(@RequestParam int id){
        return new ResponseEntity<PostDetailDto>(postService.findDetailDtoById(id), HttpStatus.OK);
    }
}
