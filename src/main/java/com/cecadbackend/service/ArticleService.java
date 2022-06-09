package com.cecadbackend.service;

import com.cecadbackend.model.Article;
import com.cecadbackend.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service @Slf4j
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public Article save(Article article){
        if (articleRepository.findArticleByName(article.getName()) == null){
            log.info("article called {} has been stored in database", article.getName());
            return articleRepository.save(article);
        } else{
            log.error("article called {} is already in database", article.getName());
            throw new RuntimeException("article is already in database");
        }
    }

    public Article update(Article article){
        return save(article);
    }

    public void deleteById(Long id){
        Article article = articleRepository.findArticleById(id);
        if(article == null){
            log.error("article doesn't exist in database");
            throw new RuntimeException("Article doesn't exist in database");
        } else{
            log.info("article called {} was deleted",article.getName());
            articleRepository.deleteById(id);
        }
    }

    public void deleteByName(String name){
        Article article = articleRepository.findArticleByName(name);
        if(article == null){
            log.error("article doesn't exist in database");
            throw new RuntimeException("Article doesn't exist in database");
        } else{
            log.info("article called {} was deleted",article.getName());
            articleRepository.deleteArticleByName(name);
        }
    }

    public Article findById(Long id){
        if(articleRepository.findArticleById(id) == null){
            log.error("article doesn't exist in database");
            throw new RuntimeException("Article doesn't exist in database");
        } else {
            log.info("article was found");
            return articleRepository.findArticleById(id);
        }
    }

    public Article findByName(String name){
        if(articleRepository.findArticleByName(name) == null){
            log.error("article doesn't exist in database");
            throw new RuntimeException("Article doesn't exist in database");
        } else {
            log.info("article was found");
            return articleRepository.findArticleByName(name);
        }
    }

}

