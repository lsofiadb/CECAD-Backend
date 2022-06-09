package com.cecadbackend.dto;

import com.cecadbackend.controller.ArticleController;
import com.cecadbackend.model.Article;
import com.cecadbackend.model.ResearchArea;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDto {

    private Long id;
    private String name;
    private String urlImage;
    private String description;
    private Long research_id;

    public Article getArticle(ArticleDto articleDto){
        Article article = new Article();
        article.setId(articleDto.getId());
        article.setName(articleDto.getName());
        article.setDescription(articleDto.getDescription());
        article.setUrlImage(articleDto.getUrlImage());
        return article;
    }

}
