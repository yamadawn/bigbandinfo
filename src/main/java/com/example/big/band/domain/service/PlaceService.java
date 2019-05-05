package com.example.big.band.domain.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.big.band.domain.Place;
import com.example.big.band.domain.repository.PlaceRepository;

@Service
@Transactional
public class PlaceService {
	
    @Autowired
    private PlaceRepository repository;
    
    public List<Place> findAll(){
        return repository.findAll();
    }
    
    public Page<Place> boFindAll(Pageable pageable){
        return repository.findAll(pageable);
    }
    
    public Place findById(int id) {
    	return repository.findById(id);
    }
    
    public List<Place> findByStationCode(String code) {
    	return repository.findByStationCode(code);
    }
	
	@Bean
	public JdbcTemplate jdbcTemplate3(DataSource dataSource) {
	    return new JdbcTemplate(dataSource);
	}

}
