
package com.proyec.crud.domain;

import java.io.Serializable;
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
@Table(name = "venta")
public class Ventas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     @Column
    private Long id_venta;
    @Column
    
    private Date fecha_venta ;
    @Column
    private String nombre_comprador;
    @Column
    private double sub_total;
    @Column
    private double iva;
    @Column
    private Double  total;
    @Column
    private Long cod_producto;
    @Column
    private Long  cod_empleado;
}
