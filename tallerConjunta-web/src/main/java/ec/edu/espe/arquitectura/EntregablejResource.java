/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura;

import ec.edu.espe.arquitectura.model.Entregable;
import ec.edu.espe.arquitectura.mongo.EntregableFacade;
import java.util.Date;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author jhona
 */
@Path("entregable")
@RequestScoped
public class EntregablejResource {
    
    @EJB(beanName="ent")
    private EntregableFacade ejbPersona ;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of EntregablejResource
     */
    public EntregablejResource() {
    }

    /**
     * Retrieves representation of an instance of ec.edu.espe.arquitectura.EntregablejResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of EntregablejResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postJson(Entregable p) {
        java.util.Date fecha = new Date();
        p.setFechaReal(fecha.toString());
        ejbPersona.create(p);
        return Response.status(Response.Status.CREATED).entity(p).build();
    }
}
