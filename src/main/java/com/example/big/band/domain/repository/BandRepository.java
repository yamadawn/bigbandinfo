package com.example.big.band.domain.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.big.band.domain.Band;


@Repository
@Transactional
public interface BandRepository extends JpaRepository<Band, Integer>{
    
	@Query
	("FROM Band")
    Page<Band> findAll(Pageable pageable);
	
}
