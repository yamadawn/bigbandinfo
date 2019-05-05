package com.example.big.band.domain.service;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.big.band.domain.Manager;
import com.example.big.band.domain.Place;
import com.example.big.band.domain.Station;
import com.example.big.band.domain.repository.ManagerRepository;
import com.example.big.band.domain.repository.StationRepository;

@Service
@Transactional
public class ManagerService {

	@Autowired
	ManagerRepository managerRepository;
	
	public List<Manager> findAll() {
		return managerRepository.findAll();
	}

	//認証処理
	public boolean managerAuth(String loginId, String password) {
		
		
		Manager manager = managerRepository.findByLoginId(loginId);
		if(manager == null) {
			return false;
		}
		return password.equals(manager.getPassword());
	}

	@Bean
	public JdbcTemplate jdbcTemplate8(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

}
