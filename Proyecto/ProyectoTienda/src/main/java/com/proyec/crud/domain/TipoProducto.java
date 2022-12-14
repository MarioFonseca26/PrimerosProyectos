/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@Table(name = "tipo_producto")
public class TipoProducto implements Serializable {
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     @Column
    private Long id;
   
    @Column
    private String tipo_producto; 
}
