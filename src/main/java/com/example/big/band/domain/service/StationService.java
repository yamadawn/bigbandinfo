package com.example.big.band.domain.service;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.big.band.domain.Place;
import com.example.big.band.domain.Station;
import com.example.big.band.domain.repository.StationRepository;

@Service
@Transactional
public class StationService {

	@Autowired
	StationRepository stationRepository;
	
	public List<Station> findAll() {
		return stationRepository.findAll();
	}

	public Station findById(String code) {
		return stationRepository.findById(code);
	}

	// 場所コードをもとに駅名リストを取得
	public List<Station> getStationList(Place place) {

		List<Station> list = new ArrayList<Station>();
		Station station = new Station();
		
		station = stationRepository.findById(place.getStationCode1());
		if (station != null) {
			list.add(station);
		}
		station = stationRepository.findById(place.getStationCode2());
		if (station != null) {
			list.add(station);
		}
		station = stationRepository.findById(place.getStationCode3());
		if (station != null) {
			list.add(station);
		}
		station = stationRepository.findById(place.getStationCode4());
		if (station != null) {
			list.add(station);
		}
		station = stationRepository.findById(place.getStationCode5());
		if (station != null) {
			list.add(station);
		}
		
		return list;
	}

	@Bean
	public JdbcTemplate jdbcTemplate7(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

}
