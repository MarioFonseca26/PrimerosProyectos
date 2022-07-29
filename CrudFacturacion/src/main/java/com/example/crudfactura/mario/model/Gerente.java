package com.example.crudfactura.mario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.hibernate.annotations.Columns;

import lombok.Data;

@Data
@Entity
@Table(name = "Gerente")

public class Gerente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     @Column
    private Long id;
    @Column
    
    private String cargo;
    @Column
    
    private String codEmpleado;
    
}
