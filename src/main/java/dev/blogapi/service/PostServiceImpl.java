package dev.blogapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.blogapi.model.Post;
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
    
}
