package com.example.crudcomJPA.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "tb_alunoJPA")
public class Aluno implements Serializable{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String nome;
    private int idade;
    @OneToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
//getters e setters

}