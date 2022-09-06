package com.hosto.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hosto.intranet.entity.Area;

@Repository
public interface AreaRepository extends JpaRepository<Area,Integer>{
    
}
