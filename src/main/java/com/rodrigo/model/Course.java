package com.rodrigo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data  //aqui tem os setter, getters and constructors (lombok)
@Entity //para modelar os banco de dados

public class Course {

    //Qnto mais informação tiver p o banco de dados, melhor...

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 200, nullable = false)
    private String name;
    
    @Column(length = 30, nullable = false)
    private String category;
    
}
