package com.example.crudcomJPA.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_endereco")
public class Endereco{

    @Id
    @GeneratedValue
    private int id;
    private String logradouro;
    private String bairro;
    private String cep;

    @OneToOne(mappedBy="endereco")
    private Aluno aluno;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
