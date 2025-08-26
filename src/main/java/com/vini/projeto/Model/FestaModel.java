package com.vini.projeto.Model;


import jakarta.persistence.*;

import java.io.Serializable;

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



}
