package com.example.crudfactura.mario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Producto")
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     @Column
    private Long idProducto;
    @Column
    private String nombreProducto ;
    @Column
    private int stock;
    @Column
    private double precio;
    @Column
    private Long codTipoProducto;
    @Column
    private Long  codGerente;
}
