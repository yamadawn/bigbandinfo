package com.example.big.band.domain.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.big.band.domain.Line;
import com.example.big.band.domain.repository.LineRepository;

@Service
@Transactional
public class LineService {
	
    @Autowired
    LineRepository repository;
    
    public List<Line> findAll(){
        return repository.findAll();
    }
	
	@Bean
	public JdbcTemplate jdbcTemplate5(DataSource dataSource) {
	    return new JdbcTemplate(dataSource);
	}

}
