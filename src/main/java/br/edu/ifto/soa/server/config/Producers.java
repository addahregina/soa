/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifto.soa.server.config;

import br.edu.ifto.soa.server.dao.DAO;
import br.edu.ifto.soa.server.dao.JpaDAO;
import br.edu.ifto.soa.server.model.Cadastro;
import java.lang.reflect.ParameterizedType;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Produces;

/**
 *
 * @author addah
 */
public class Producers {
//    @Produces 
    @PersistenceContext
    private EntityManager em;
    
    /**
     *
     * @param <T>
     * @param ip
     * @return
     */
    @Produces
    public <T extends Cadastro> DAO<T> getDao(InjectionPoint ip){
        ParameterizedType t = (ParameterizedType) ip.getType();
        Class classe = (Class) t.getActualTypeArguments()[0];
        return new JpaDAO<>(em, classe);
    }        
}