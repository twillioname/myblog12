package com.myblog.myblog12.service.impl;

import com.myblog.myblog12.entity.Blog;
import com.myblog.myblog12.payload.BlogDto;
import com.myblog.myblog12.repository.BlogRepository;
import com.myblog.myblog12.service.BlogService;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {

    private BlogRepository blogRepository;

    public BlogServiceImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public BlogDto createBlog(BlogDto blogDto) {

        Blog blog = new Blog();

        blog.setId(blogDto.getId());
        blog.setName(blogDto.getName());
        blog.setCity(blogDto.getCity());
        blog.setMobile(blogDto.getMobile());
        blog.setContent(blogDto.getContent());

        Blog savedBlog = blogRepository.save(blog);

        BlogDto dto= new BlogDto();
        dto.setId(savedBlog.getId());
        dto.setName(savedBlog.getName());
        dto.setCity(savedBlog.getCity());
        dto.setMobile(savedBlog.getMobile());
        dto.setContent(savedBlog.getContent());


        return dto;
    }
}
