package com.example.big.band.domain.repository;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.example.big.band.domain.Article;
import com.example.big.band.form.ArticleForm;

public interface ArticleRepositoryCustom {
	
	public List<Article> findLimited(int limit);
	

}
