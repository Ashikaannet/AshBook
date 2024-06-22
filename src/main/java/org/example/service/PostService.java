package org.example.service;

import lombok.AllArgsConstructor;
import org.example.entity.Post;
import org.example.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PostService {
    private PostRepository postRepository;

    public Post createPost(Post post){
        return  postRepository.save(post);
    }

    public void deletePost(Integer postid){
        postRepository.deleteById(postid);
    }

    public List<Post> getAllPost() {
       return postRepository.findAll();
    }

    public Post getPostById(Integer postid) throws Exception {
       return  postRepository.findById(postid).orElseThrow(() -> new Exception("The value is not present"));
    }
}
