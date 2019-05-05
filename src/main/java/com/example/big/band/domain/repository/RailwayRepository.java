package com.example.big.band.domain.repository;



import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.big.band.domain.Railway;


@Repository
@Transactional
public interface RailwayRepository extends JpaRepository<Railway, Integer>{
    
	
	@Query
//	("FROM Railway WHERE del_flg = false")
	("FROM Railway")
    Page<Railway> findAll(Pageable pageable);
	
	@Query
	("FROM Railway WHERE railway_code = :code")
	Railway getOne(String code);
	
	@Query
	("FROM Railway WHERE del_flg = false")
    List<Railway> findAllAsList();

	

	
	
	
	
	
//	@Query
//	("FROM Railway")
//    Page<Railway> findAllById(int id);
	
	
	
}
