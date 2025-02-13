package com.sangarius.blogactiverecord.repository;

import com.sangarius.blogactiverecord.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
