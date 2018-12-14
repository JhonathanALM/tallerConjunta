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
public class ErroresEncontrados {

    @Property("tipo_error")
    private String tipo_error;

    @Property("descripcion")
    private String descripcion;

    @Property("estado")
    private String estado;

    public String getTipo_error() {
        return tipo_error;
    }

    public void setTipo_error(String tipo_error) {
        this.tipo_error = tipo_error;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
