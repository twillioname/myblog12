package com.myblog.myblog12.controller;

import com.myblog.myblog12.payload.BlogDto;
import com.myblog.myblog12.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/blogs")
public class BlogController {

    private BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }
    @PostMapping
    public ResponseEntity<BlogDto>createBlog(@RequestBody BlogDto blogDto){
        BlogDto dto = blogService.createBlog(blogDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
}
