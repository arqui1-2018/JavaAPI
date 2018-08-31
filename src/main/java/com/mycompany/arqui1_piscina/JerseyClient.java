/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arqui1_piscina;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author drbones
 */
@Path("/jsonServices")
public class JerseyClient {

    @GET
    @Path("/print/prueba/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public String produceJSON(@PathParam("name") String name) {
        return "Digo: " + name;
    }

    /*
    @POST
    //@Consumes(MediaType.APPLICATION_JSON)
    @Path("/insert/ABB")
    public String insertABB(@FormParam("nombres") String nombre, @FormParam("apellidos") String apellido, @FormParam("carnet") int carnet, @FormParam("dpi") int dpi, @FormParam("fecha") String fecha,
            @FormParam("direccion") String direccion, @FormParam("creditos") int creditos) {
        Estudiante est = new Estudiante(carnet, dpi, nombre, apellido, fecha, direccion, "0", creditos);

        arbol.add(dpi, est);
        arbol.Preorden(arbol.getRaiz());

        return est.toString();
    }

    @GET
    @Path("/Graph")
    @Produces(MediaType.TEXT_PLAIN)
    public String print() {
        return "digraph G{ Hola }";
    }
    
    @GET
    @Path("/print/ABB")
    @Produces(MediaType.TEXT_PLAIN)
    public String printABB() {
        return "digraph G{" + arbol.Graficar(arbol.getRaiz()) + "}";
    }*/

}
