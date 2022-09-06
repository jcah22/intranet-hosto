package com.hosto.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hosto.intranet.entity.Directivo;

@Repository
public interface DirectivoRepository extends JpaRepository<Directivo,Integer> {
    
}
