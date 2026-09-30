package br.com.senai.infoa.backend.projeto_grupo.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "estudante")

public class Estudante {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name = "id")
    private Integer id;
    
    @Column (name = "nome")
    private String nome;
    
    @Column (name = "data_nascimento")
    private LocalDate dataNascimento;


    //construtores
    public Estudante() {
    }

    public Estudante(Integer id, String nome, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    //getters e setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    
}
