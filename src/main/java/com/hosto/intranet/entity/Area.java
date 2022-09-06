package com.hosto.intranet.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "areas")
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre")
    @NonNull
    private String Nombre;



    public Area() {
    }


    public Area(Integer id, String nombre, List<Usuario> usuarios) {
        this.id = id;
        Nombre = nombre;
        this.usuarios = usuarios;
    }







    @OneToMany(mappedBy = "area")
    private List<Usuario> usuarios;



    public Integer getId() {
        return id;
    }



    public void setId(Integer id) {
        this.id = id;
    }



    public String getNombre() {
        return Nombre;
    }



    public void setNombre(String nombre) {
        Nombre = nombre;
    }



    public List<Usuario> getUsuarios() {
        return usuarios;
    }



    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }


    


    
}
