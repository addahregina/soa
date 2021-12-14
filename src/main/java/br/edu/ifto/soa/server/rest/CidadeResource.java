/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifto.soa.server.rest;

import br.edu.ifto.soa.server.dao.DAO;
import br.edu.ifto.soa.server.model.Cidade;
import br.edu.ifto.soa.server.model.Usuario;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author addah
 */
@Path("/cidade")
public class CidadeResource {
    @Inject
    private DAO dao;

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario findById(@PathParam("id") long id) {
        return (Usuario) dao.findById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public long insert(Cidade cidade) {
        return dao.save(cidade);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean update(Cidade cidade) {
        //Se retornou um id maior que 0, é porque o usuário foi salvo no BD
        return dao.save(cidade) > 0;
    }

    @DELETE
    @Path("{id}")
    public boolean delete(@PathParam("id") long id) {
        return dao.delete(id);
    }
}