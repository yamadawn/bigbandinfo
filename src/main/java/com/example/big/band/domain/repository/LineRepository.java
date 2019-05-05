package com.example.big.band.domain.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.big.band.domain.Line;


@Repository
@Transactional
public interface LineRepository extends JpaRepository<Line, Integer>{
    
	@Query
	("FROM Line")
    Page<Line> findAll(Pageable pageable);
}
