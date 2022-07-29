package com.example.crudfactura.mario.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name = "Venta")
public class Venta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     @Column
    private Long idVenta;
    @Column
    private Date fechaVenta ;
    @Column
    private String nombreComprador;
    @Column
    private double sunTotal;
    @Column
    private double IVA;
    @Column
    private Double  total;
    @Column
    private Long codProducto;
    @Column
    private Long  codEmpleado;
}

