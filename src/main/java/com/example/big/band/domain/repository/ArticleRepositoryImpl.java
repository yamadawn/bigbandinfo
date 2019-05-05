package com.example.big.band.domain.repository;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.example.big.band.domain.Article;
import com.example.big.band.form.ArticleForm;

public class ArticleRepositoryImpl implements ArticleRepositoryCustom{
	
	@PersistenceContext
    EntityManager entityManager;

	@Override
	public List<Article> findLimited(int limit) {
		return entityManager.createQuery("FROM Article WHERE del_flg = true ORDER BY inst_ymd", Article.class)
				.setMaxResults(limit)
				.getResultList();
		
	}

	public boolean updateArticle(Article article)
			throws HibernateException, SQLException {
		
		
		EntityTransaction tx = entityManager.getTransaction();
		
		article = entityManager.find(Article.class, 5);
		article.setTitle("タイトル");
		article.setOverview("概要");
		
		entityManager.persist(article);
		tx.commit();
		
		return true;
	}


}
