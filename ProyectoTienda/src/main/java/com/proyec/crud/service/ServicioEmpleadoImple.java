
package com.proyec.crud.service;


import com.proyec.crud.domain.Empleado;
import com.proyec.crud.repository.EmpleadoDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ServicioEmpleadoImple implements ServicioEmpleado{
    
    @Autowired
    private EmpleadoDao empleadoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Empleado> ListarEmpleados() {
       
        return (List<Empleado>) empleadoDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Empleado empleado) {
        empleadoDao.save(empleado);
        
    }

    @Override
    @Transactional
    public void eliminar(Empleado empleado) {
        empleadoDao.delete(empleado);
        
    }

    @Override
    @Transactional(readOnly = true)
    public Empleado encontrarEmpleado(Empleado empleado) {
        
       return empleadoDao.findById(empleado.getId()).orElse(null);
    }
}
