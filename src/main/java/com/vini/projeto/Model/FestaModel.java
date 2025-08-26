package com.vini.projeto.Model;


import jakarta.persistence.*;

@Entity(name = "FESTA")
@Table (name = "TB_FESTA")
public class FestaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String CPF;

    public FestaModel(){
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public Long getId(){
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF(){
        return CPF;
    }
}
