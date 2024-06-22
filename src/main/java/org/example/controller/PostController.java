package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.entity.Post;
import org.example.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/post")
public class PostController {
    private PostService postService;

    @GetMapping("/{postid}")
    public Post getPostById(@PathVariable("postid") Integer postid) throws Exception {
        return postService.getPostById(postid);
    }

    @GetMapping
    public List<Post> getAllPost() {
        return postService.getAllPost();
    }


    @DeleteMapping("/{postid}")
    public void deletePost(@PathVariable("postid") Integer postid) {
        postService.deletePost(postid);
    }

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }

}
