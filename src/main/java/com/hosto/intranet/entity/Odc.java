package com.hosto.intranet.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ODC")
public class Odc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha")
    @NotNull
    private Date fecha;
    @Column(name = "descripcion")
    @NotNull
    private String descripcion;
    @Column(name = "total")
    @NotNull
    private Double total;
    @Column(name = "flete")
    @NotNull
    private boolean flete;
    @Column(name = "uso_cfdi")
    @NotNull
    private String usoCfdi;
    @Column(name = "factura")
    private String factura;

    @ManyToMany(mappedBy = "odc")
    private List<Usuario> usuarios;

    @OneToOne
    private Directivo directivo;

    @OneToOne
    private Status status;

    @ManyToOne
    @JoinColumn(name = "req_id")
    private Requisicion requisicion;

    public Odc() {
    }

    public Odc(Integer id, @NotNull Date fecha, @NotNull String descripcion, @NotNull Double total,
            @NotNull boolean flete, @NotNull String usoCfdi, String factura, List<Usuario> usuarios,
            Directivo directivo, Status status, Requisicion requisicion) {
        this.id = id;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.total = total;
        this.flete = flete;
        this.usoCfdi = usoCfdi;
        this.factura = factura;
        this.usuarios = usuarios;
        this.directivo = directivo;
        this.status = status;
        this.requisicion = requisicion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public boolean isFlete() {
        return flete;
    }

    public void setFlete(boolean flete) {
        this.flete = flete;
    }

    public String getUsoCfdi() {
        return usoCfdi;
    }

    public void setUsoCfdi(String usoCfdi) {
        this.usoCfdi = usoCfdi;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Directivo getDirectivo() {
        return directivo;
    }

    public void setDirectivo(Directivo directivo) {
        this.directivo = directivo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Requisicion getRequisicion() {
        return requisicion;
    }

    public void setRequisicion(Requisicion requisicion) {
        this.requisicion = requisicion;
    }

}
