/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.model;

import java.util.List;
import org.bson.types.ObjectId;
import xyz.morphia.annotations.Embedded;
import xyz.morphia.annotations.Entity;
import xyz.morphia.annotations.Id;
import xyz.morphia.annotations.IndexOptions;
import xyz.morphia.annotations.Indexed;
import xyz.morphia.annotations.Property;
/**
 *
 * @author jorge
 */
@Entity(noClassnameStored = true, value = "pruebas")
public class Pruebas {
    @Id
    private ObjectId id;
    
    @Property("fechaPlanifiInicial")
    private String fechaPlanifiInicial;
    
    @Property("fechaInicioInicial")
    private String fechaInicioInicial;
    
    @Property("fechaAprobacion")
    private String fechaAprobacion;
    
    @Property("estado")
    private String estado;
    
    @Embedded
    private List<ErroresEncontrados> errorEncontrado;

    public Pruebas() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getFechaPlanifiInicial() {
        return fechaPlanifiInicial;
    }

    public void setFechaPlanifiInicial(String fechaPlanifiInicial) {
        this.fechaPlanifiInicial = fechaPlanifiInicial;
    }

    public String getFechaInicioInicial() {
        return fechaInicioInicial;
    }

    public void setFechaInicioInicial(String fechaInicioInicial) {
        this.fechaInicioInicial = fechaInicioInicial;
    }

    public String getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(String fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<ErroresEncontrados> getErrorEncontrado() {
        return errorEncontrado;
    }

    public void setErrorEncontrado(List<ErroresEncontrados> errorEncontrado) {
        this.errorEncontrado = errorEncontrado;
    }

    @Override
    public String toString() {
        return "Pruebas{" + "id=" + id + ", fechaPlanifiInicial=" + fechaPlanifiInicial + ", fechaInicioInicial=" + fechaInicioInicial + ", fechaAprobacion=" + fechaAprobacion + ", estado=" + estado + ", errorEncontrado=" + errorEncontrado + '}';
    }
    
    
    
    
    
}
