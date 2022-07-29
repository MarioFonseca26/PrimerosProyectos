
package com.proyec.crud.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     @Column
    private Long id_producto;
    @Column
    private String nombre_producto ;
    @Column
    private int stock;
    @Column
    private double precio;
    @Column
    private Long cod_tipo_producto;
    @Column
    private Long  cod_gerente;
}
