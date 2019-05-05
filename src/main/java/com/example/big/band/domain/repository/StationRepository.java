package com.example.big.band.domain.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.big.band.domain.Line;
import com.example.big.band.domain.Place;
import com.example.big.band.domain.Station;


@Repository
@Transactional
public interface StationRepository extends JpaRepository<Station, Integer>{
    
	@Query
	("FROM Station")
    Page<Station> findAll(Pageable pageable);
	
	@Query
	("FROM Station WHERE station_code = :code")
    Station findById(String code);
}
