
package com.proyec.crud.repository;
import com.proyec.crud.domain.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface EmpleadoDao extends CrudRepository<Empleado, Long>{
    
}
