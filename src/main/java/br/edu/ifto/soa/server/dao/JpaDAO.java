/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifto.soa.server.dao;

import br.edu.ifto.soa.server.model.Cadastro;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author addah
 * @param <T>
 */
public class JpaDAO<T extends Cadastro> implements DAO<T> {
    private final EntityManager em;
    private final Class<T> classe;

    public JpaDAO(EntityManager em, Class<T> classe){
        this.em = em;
        this.classe = classe;
    }

    @Override
    public T findById(long id) {
        return em.find(classe, id);
    }

    @Override
    public boolean delete(T entity) {
        em.remove(entity);
        return true;
    }

    @Override
    public boolean delete(long id) {
        T entity = findById(id);
        return delete(entity);
    }

    @Override
    public long save(T entity) {
        if(entity.getId() > 0)
            em.merge(entity);
        else em.persist(entity);

        return entity.getId();
    }

    @Override
    public T findByField(String fieldName, Object value) {
        final String jpql = "select o from " + classe.getSimpleName() + " o " +
                            " where o." + fieldName + " = :" + fieldName;
        TypedQuery<T> query = em.createQuery(jpql, classe);
        query.setParameter(fieldName, value);
        return query.getSingleResult();
    }
}