package com.example.big.band.domain.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.big.band.domain.Manager;



@Repository
@Transactional
public interface ManagerRepository extends JpaRepository<Manager, Integer>{
    
	@Query
	("FROM Manager")
    Page<Manager> findAll(Pageable pageable);
	
	@Query
	("FROM Manager WHERE loginId = :loginId")
	Manager findByLoginId(String loginId);
}
