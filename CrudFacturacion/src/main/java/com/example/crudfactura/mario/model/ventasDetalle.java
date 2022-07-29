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
@Table(name = "VentasDetalle")
public class ventasDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     @Column
    private Long idVentaDetalle;
    @Column
    private String Producto ;
    @Column
    private String tipoProducto ;
    @Column
    private int cantidad;
    @Column
    private double subTotal;
    @Column
    private double total;
    @Column
    private Long codVenta;
    
}
