package org.example.service;

import lombok.AllArgsConstructor;
import org.example.entity.Post;
import org.example.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PostService {
    private PostRepository postRepository;

    public Post createPost(Post post){
        return  postRepository.save(post);
    }
}
