/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.model;

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
@Entity(noClassnameStored = true, value = "entregable")
public class Entregable {
    @Id
    private ObjectId id;
    
    @Property("codigoE")
    @Indexed(options = @IndexOptions(name = "codigoRol",unique = true))
    private String codigoE;
    
    @Property("fechaPlanificada")
    private String fechaPlanificada;
    
    @Property("fechaReal")
    private String fechaReal;

    public Entregable() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getCodigoE() {
        return codigoE;
    }

    public void setCodigoE(String codigoE) {
        this.codigoE = codigoE;
    }

    public String getFechaPlanificada() {
        return fechaPlanificada;
    }

    public void setFechaPlanificada(String fechaPlanificada) {
        this.fechaPlanificada = fechaPlanificada;
    }

    public String getFechaReal() {
        return fechaReal;
    }

    public void setFechaReal(String fechaReal) {
        this.fechaReal = fechaReal;
    }

    @Override
    public String toString() {
        return "Entregable{" + "id=" + id + ", codigoE=" + codigoE + ", fechaPlanificada=" + fechaPlanificada + ", fechaReal=" + fechaReal + '}';
    }
    
    
    
}
