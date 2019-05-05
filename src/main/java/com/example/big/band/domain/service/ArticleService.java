package com.example.big.band.domain.service;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.result.UpdateCountOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.big.band.domain.Article;
import com.example.big.band.domain.repository.ArticleRepository;
import com.example.big.band.domain.repository.ArticleRepositoryImpl;
import com.example.big.band.form.ArticleForm;

@Service
@Transactional
public class ArticleService {
	
    @Autowired
    ArticleRepository repository;
    @Autowired
    ArticleRepositoryImpl repositoryImpl;
    
    public List<Article> findAll(){
        return repository.findAll();
    }
    
    public Page<Article> boFindAll(Pageable pageable){
        return repository.findAll(pageable);
    }
    
    //トップページ表示用
    public List<Article> findForTopPage(){
//    	return repositoryImpl.findLimited(5);
    	List<Article> list = repositoryImpl.findLimited(5);
//    	for (Article article : list) {
//    		System.out.println(article.getInstYmd());
//    		System.out.println(article.getInstYmd().toString());
//    		System.out.println("--------------");
//    	}
    	return list;
    }
    
    public Article findAllById(int id){
        return repository.findAllById(id);
    }
    
    public void updateArticle(ArticleForm form) {
    	
    };
    	
	@Bean
	public JdbcTemplate jdbcTemplate2(DataSource dataSource) {
	    return new JdbcTemplate(dataSource);
	}
	
	
	
	
	

}
