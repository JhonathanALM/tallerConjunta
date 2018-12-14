/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.model;

import xyz.morphia.annotations.Embedded;
import xyz.morphia.annotations.Property;

/**
 *
 * @author USUARIO
 */
@Embedded
public class DocumentoFuncional {
    
    @Property("nombre")
    private String nombre;
    
    @Property("fecha_planificada")
    private String fecha_planificada;
    
    @Property("fecha_aprovacion")
    private String fecha_aprovacion;
    
    @Property("estado")
    private String estado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_planificada() {
        return fecha_planificada;
    }

    public void setFecha_planificada(String fecha_planificada) {
        this.fecha_planificada = fecha_planificada;
    }

    public String getFecha_aprovacion() {
        return fecha_aprovacion;
    }

    public void setFecha_aprovacion(String fecha_aprovacion) {
        this.fecha_aprovacion = fecha_aprovacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    } 
    
    
}
