package com.myblog.myblog12.repository;

import com.myblog.myblog12.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
}
