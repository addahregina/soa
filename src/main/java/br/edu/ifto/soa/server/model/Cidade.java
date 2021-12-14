/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifto.soa.server.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EntityManager;

/**
 *
 * @author addah
 */
@Entity
public class Cidade implements Cadastro, Serializable{
    private long id;
    private String nome;
    private String uf;
    private EntityManager em;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(String uf) {
        this.uf = uf;
    }
}