package com.example.big.band.domain.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.big.band.domain.Line;
import com.example.big.band.domain.Railway;
import com.example.big.band.domain.repository.RailwayRepository;

@Service
@Transactional
public class RailwayService {
	
    @Autowired
    RailwayRepository repository;
    
    public List<Railway> findAll(){
        return repository.findAll();
    }
 
    public Railway getOne(String code) {
    	return repository.getOne(code);
    }
    
    
    
    
    
	
	@Bean
	public JdbcTemplate jdbcTemplate4(DataSource dataSource) {
	    return new JdbcTemplate(dataSource);
	}

}
