package com.example.big.band.domain.repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.big.band.domain.Place;


@Repository
@Transactional
public interface PlaceRepository extends JpaRepository<Place, Integer>,CrudRepository<Place, Integer>{
    
	@Query
	("FROM Place")
    public Page<Place> findAll(Pageable pageable);
	
	@Query
	("FROM Place WHERE place_id = :id")
    public Place findById(int id);

	@Query
	("FROM Place WHERE "
			+ "station_code1 like :code% or "
			+ "station_code2 like :code% or "
			+ "station_code3 like :code% or "
			+ "station_code4 like :code% or "
			+ "station_code5 like :code%"
			)
    public List<Place> findByStationCode(String code);
	
}
