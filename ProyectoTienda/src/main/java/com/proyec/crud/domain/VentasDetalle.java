/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyec.crud.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name = "ventas_detalle")
public class VentasDetalle {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column
        private Long id_venta_detalle;
        @Column
        private String producto ;
        @Column
        private String tipo_producto ;
        @Column
        private int cantidad;
        @Column
        private double sub_total;
        @Column
        private double total;
        @Column
        private Long cod_venta;
}
