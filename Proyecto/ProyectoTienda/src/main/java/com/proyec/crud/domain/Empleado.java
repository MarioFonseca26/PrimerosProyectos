
package com.proyec.crud.domain;

import java.io.Serializable;
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
@Table(name = "empleado")
public class Empleado implements Serializable{   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    
    @Column   
    private String apellido;
    
    @Column  
    private String cedula;
    
    @Column
    private String correo;
    
    @Column
     private String nombre;
}
