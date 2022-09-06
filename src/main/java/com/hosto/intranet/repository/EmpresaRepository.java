package com.hosto.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hosto.intranet.entity.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa,Integer> {
    
}
