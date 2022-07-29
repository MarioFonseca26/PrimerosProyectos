package com.example.crudfactura.mario.service;

import java.util.List;

import com.example.crudfactura.mario.model.Empleado;

public interface ServicioEmpleado {
    public List<Empleado> ListarEmpleados();

    public void guardar(Empleado empleado);

    public void eliminar (Empleado empleado);

    public Empleado encontrarEmpleado(Empleado empleado);
}
