package com.hosto.intranet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hosto.intranet.entity.Requisicion;

@Repository
public interface RequsicionRepository extends JpaRepository<Requisicion, Integer> {

    // @Query("SELECT r FROM Requsicion r WHERE r.codigo LIKE ?1% ")
    // public List<Requisicion> findByCodigo(String codigo);
    @Query(

            value = "select * from requicisiones WHERE requicisiones.codigo LIKE %:filtro%", nativeQuery = true)
    List<Requisicion> searchFiltroRepository(String filtro);
}
