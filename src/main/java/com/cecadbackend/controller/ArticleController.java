package com.cecadbackend.controller;

import com.cecadbackend.dto.ArticleDto;
import com.cecadbackend.model.Article;
import com.cecadbackend.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping("/save")
    public ResponseEntity <Article> save(@RequestBody ArticleDto articleDto){
        Article  article = new Article();
        article = articleDto.getArticle(articleDto);
        return ResponseEntity.ok().body(articleService.save(article));
    }

    @PutMapping("/update")
    public ResponseEntity <Article> update(@RequestBody ArticleDto articleDto){
        Article  article = new Article();
        article = articleDto.getArticle(articleDto);
        return ResponseEntity.ok().body(articleService.save(article));
    }

    @DeleteMapping("/deleteById/{}")
    public ResponseEntity <String> deleteById(@PathVariable Long id){
        articleService.deleteById(id);
        return ResponseEntity.ok().body("Article was deleted");
    }

    @DeleteMapping("/deleteByName/{}")
    public ResponseEntity <String> deleteByName(@PathVariable String name){
        articleService.deleteByName(name);
        return ResponseEntity.ok().body("Article was deleted");
    }

    @GetMapping("/findById")
    public ResponseEntity <Article> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(articleService.findById(id));
    }

    @GetMapping("/findByName")
    public ResponseEntity <Article> findByName(@PathVariable String name){
        return ResponseEntity.ok().body(articleService.findByName(name));
    }

}
