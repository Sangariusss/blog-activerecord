package com.sangarius.blogactiverecord.service;

import com.sangarius.blogactiverecord.dto.ArticleDTO;
import com.sangarius.blogactiverecord.exception.ResourceNotFoundException;
import com.sangarius.blogactiverecord.model.Article;
import com.sangarius.blogactiverecord.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<ArticleDTO> getAllArticles() {
        return articleRepository.findAll().stream()
            .map(article -> new ArticleDTO(article.getId(), article.getTitle(), article.getContent(), null))
            .toList();
    }

    public Article createArticle(Article article) {
        return articleRepository.save(article);
    }

    public void deleteArticle(Long id) {
        if (!articleRepository.existsById(id)) {
            throw new ResourceNotFoundException("Article not found with id: " + id);
        }
        articleRepository.deleteById(id);
    }
}
