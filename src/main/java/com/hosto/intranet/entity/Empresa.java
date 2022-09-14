package com.hosto.intranet.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    @NotEmpty
    private String nombre;
    @Column(name = "rfc")
    @NotEmpty
    private String rfc;
    @Column(name = "direccion")
    @NotEmpty
    private String direccion;

    public List<Requisicion> getRequisiciones() {
        return requisiciones;
    }

    public void setRequisiciones(List<Requisicion> requisiciones) {
        this.requisiciones = requisiciones;
    }

    @NotEmpty
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "correo")
    @Email
    private String correo;

    @Column(name = "imagen")
    @NotEmpty
    private String imagen;

    @ManyToMany(mappedBy = "empresas")
    private List<Requisicion> requisiciones;

    public Empresa() {
    }

    public Empresa(Integer id, @NotEmpty String nombre, @NotEmpty String rfc, @NotEmpty String direccion,
            @NotEmpty String telefono, @Email String correo, @NotEmpty String imagen, List<Requisicion> requisiciones) {
        this.id = id;
        this.nombre = nombre;
        this.rfc = rfc;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.imagen = imagen;
        this.requisiciones = requisiciones;
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

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

}
