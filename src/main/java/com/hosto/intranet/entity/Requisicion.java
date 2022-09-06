package com.hosto.intranet.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "requicisiones")
public class Requisicion {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre")
    @NotNull
    private String nombre;
    @Column(name = "codigo")
    @NotNull
    private String codigo;

    @ManyToMany
    private List<Empresa> empresas;

    @OneToMany(mappedBy = "requisicion")
    private List<Odc> odc;

    public Requisicion() {
    }


    public Requisicion(Integer id, @NotNull String nombre, @NotNull String codigo, List<Empresa> empresas,
            List<Odc> odc) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.empresas = empresas;
        this.odc = odc;
    }







    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(List<Empresa> empresas) {
        this.empresas = empresas;
    }

   



    
}
