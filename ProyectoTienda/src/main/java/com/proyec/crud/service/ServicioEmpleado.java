
package com.proyec.crud.service;


import com.proyec.crud.domain.Empleado;
import java.util.List;

public interface ServicioEmpleado {
    public List<Empleado> ListarEmpleados();

    public void guardar(Empleado empleado);

    public void eliminar (Empleado empleado);

    public Empleado encontrarEmpleado(Empleado empleado);
}
