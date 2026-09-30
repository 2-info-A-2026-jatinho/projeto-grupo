package br.com.senai.infoa.backend.projeto_grupo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "materia")

public class Materia {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;
    
    @Column(name = "status")
    private String status;

    @Column(name = "codigo")
    private String codigo;

   
    //construtores
     public Materia() {
    }

    public Materia(String codigo, Integer id, String status) {
        this.codigo = codigo;
        this.id = id;
        this.status = status;
    }

    //getters e setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
