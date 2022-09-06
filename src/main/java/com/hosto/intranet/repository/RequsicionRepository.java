package com.hosto.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hosto.intranet.entity.Requisicion;

@Repository
public interface RequsicionRepository extends JpaRepository<Requisicion,Integer> {
    
}
