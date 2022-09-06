package com.hosto.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hosto.intranet.entity.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status,Integer>{
    
}
