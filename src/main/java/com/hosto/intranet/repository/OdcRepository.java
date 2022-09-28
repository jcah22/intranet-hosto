package com.hosto.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hosto.intranet.entity.Odc;

@Repository
public interface OdcRepository extends JpaRepository<Odc, Integer> {

}
