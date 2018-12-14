package ec.edu.espe.arquitectura.model;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;
import xyz.morphia.annotations.Embedded;
import xyz.morphia.annotations.Entity;
import xyz.morphia.annotations.Id;
import xyz.morphia.annotations.IndexOptions;
import xyz.morphia.annotations.Indexed;

/**
 * @author jhona
 */
@Entity(noClassnameStored = true, value = "requerimiento")
public class Requerimiento {
     @Id
    private ObjectId id;
    @Indexed(options = @IndexOptions(unique = true))
    private int codigol;
    private String nombre;
    private Date fechaPlanificada;
    private Date fechaReal;
    private String entregable;
    private int diasEsfuerzo;
    private String estado;
    //@Embedded
   // private List<DocumentacionFuncional> documentacionFuncional;  
           
     
}
