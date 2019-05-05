package com.example.big.band.domain.repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.big.band.domain.Article;
import com.example.big.band.form.ArticleForm;


@Repository
@Transactional
public interface ArticleRepository extends JpaRepository<Article, Integer>, ArticleRepositoryCustom{
    
	@Query
	("FROM Article")
    Page<Article> findAll(Pageable pageable);
	
    List<Article> findLimited(int limit);
	
	@Query
	("FROM Article WHERE article_id = :id")
    Article findAllById(int id);
	
//	boolean updateArticle(Article article);
	
}
