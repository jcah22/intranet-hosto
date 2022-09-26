package com.hosto.intranet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hosto.intranet.entity.Requisicion;
import com.hosto.intranet.entity.Usuario;

@Repository
public interface RequsicionRepository extends JpaRepository<Requisicion,Integer> {


     //  @Query("SELECT p FROM Producto  p WHERE p.nombre LIKE %?1% " + "OR p.marca LIKE %?1%" + "OR p.hechoEn LIKE %?1%")
     @Query("SELECT r FROM Requisicion r WHERE"  + " LIKE %?1%")
     public List<Usuario> findAll(String palabraClave);

     public List<Usuario> listarTodos();
    
}
