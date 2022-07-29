
package com.proyec.crud.web;

import com.proyec.crud.domain.Empleado;
import com.proyec.crud.service.ServicioEmpleado;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@Slf4j
public class ControladorInicio {
     @Autowired
    private ServicioEmpleado servicioEmpleado;
    
    @GetMapping("/")// aqui indicamos que redireccionamos a la pagina http://localhost/
    public String Inicio(Model model){
        
        var empleados = servicioEmpleado.ListarEmpleados();
        
        log.info("ejecutando Spring MVC");
        model.addAttribute("empleados", empleados);
        return "index";

    }
    
    @GetMapping("/agregar")
    public String agregar(Empleado empleado){
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(Empleado empleado){
        servicioEmpleado.guardar(empleado);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String editar(Empleado empleado, Model model){
      empleado = servicioEmpleado.encontrarEmpleado(empleado);
      model.addAttribute("empleado", empleado);
        return "modificar";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(Empleado empleado){
        servicioEmpleado.eliminar(empleado);
        return "redirect:/";
    }
}
