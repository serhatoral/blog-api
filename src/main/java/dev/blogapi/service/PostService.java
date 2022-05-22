package dev.blogapi.service;

import dev.blogapi.model.Post;
import dev.blogapi.model.dto.PostDetailDto;

public interface PostService extends CrudService<Post, Integer>{
    PostDetailDto findDetailDtoById(int id);
}
