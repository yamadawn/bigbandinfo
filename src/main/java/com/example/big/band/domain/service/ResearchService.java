package com.example.big.band.domain.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.big.band.domain.Band;
import com.example.big.band.domain.Line;
import com.example.big.band.domain.Railway;
import com.example.big.band.domain.repository.BandRepository;
import com.example.big.band.domain.repository.LineRepository;
import com.example.big.band.domain.repository.PlaceRepository;
import com.example.big.band.domain.repository.RailwayRepository;

@Service
@Transactional
public class ResearchService {
	
    @Autowired
    BandRepository bandRepository;
    @Autowired
    LineRepository lineRepository;
    @Autowired
    PlaceRepository placeRepository;
    @Autowired
    RailwayRepository railwayRepository;
    
    //検索用選択肢 Map
    public Map<Railway,List<Line>> getMap(){
    	Map<Railway, List<Line>> map = new HashMap();
    	
    	List<Railway> railwayList = railwayRepository.findAllAsList();
    	List<Line> lineList = lineRepository.findAll();
    	
    	for (Railway railway : railwayList) {
    		String railwayCode = railway.getRailwayCode();
    		
    		List<Line> tmpList = new ArrayList();
        	
    		for (Line line : lineList) {
    			if (line.getLineCode().startsWith(railwayCode)){
    				tmpList.add(line);
    			}
    		}
    		map.put(railway,tmpList);
    	}
    	return map;
    }
    	
	@Bean
	public JdbcTemplate jdbcTemplate6(DataSource dataSource) {
	    return new JdbcTemplate(dataSource);
	}
	
	
	
	
	

}
