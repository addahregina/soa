/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifto.soa.server.dao;

import br.edu.ifto.soa.server.model.Cadastro;

/**
 *
 * @author addah
 * @param <T>
 */
public interface DAO<T extends Cadastro> {
    T findById(long id);
    T findByField(String fieldName, Object value);
    boolean delete(T entity);
    boolean delete(long id);
    long save(T entity);
}
