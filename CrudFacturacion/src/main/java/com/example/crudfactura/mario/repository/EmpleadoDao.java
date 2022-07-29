package com.example.crudfactura.mario.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.crudfactura.mario.model.Empleado;

public interface EmpleadoDao extends CrudRepository<Empleado, Long> {
    
}
