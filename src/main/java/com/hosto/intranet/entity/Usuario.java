package com.hosto.intranet.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre")
    @NotNull
    private String nombre;
    @Column(name = "apellido_paterno")
    @NotNull
    private String apellidoPaterno;
    @Column(name = "apellido_materno")
    @NotNull
    private String apellidoMaterno;
    @Column(name = "telefono")
    @NotNull
    private String telefono;
    @Column(name = "correo")
    @NotNull
    private String correo;

    @Column(name = "status")
    @NotNull
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "area_id")
    private Area area;

    @ManyToMany
    private List<Odc> odc;

    public Usuario() {
    }

    public Usuario(Integer id, @NotNull String nombre, @NotNull String apellidoPaterno, @NotNull String apellidoMaterno,
            @NotNull String telefono, @NotNull String correo, @NotNull boolean status, Area area, List<Odc> odc) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.correo = correo;
        this.status = status;
        this.area = area;
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

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public List<Odc> getOdc() {
        return odc;
    }

    public void setOdc(List<Odc> odc) {
        this.odc = odc;
    }

}
