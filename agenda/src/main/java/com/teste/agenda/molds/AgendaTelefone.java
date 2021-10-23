package com.teste.agenda.molds;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_AgendaTelefonica")

public class AgendaTelefone implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;

    private String nome;

    private int telefone;

    public AgendaTelefone() {
    }

    public AgendaTelefone(long id, String nome, int telefone) {

        this.id = id;
        
        this.nome = nome;

        this.telefone = telefone;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public AgendaTelefone telefone(int telefone){
        setTelefone(telefone);
        return this;
    }

    public AgendaTelefone nome(String nome){
        setNome(nome);
        return this;
    }

}
