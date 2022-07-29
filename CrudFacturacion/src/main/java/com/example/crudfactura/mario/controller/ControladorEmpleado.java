package com.example.crudfactura.mario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.crudfactura.mario.model.Empleado;
import com.example.crudfactura.mario.service.ServicioEmpleado;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/Empleado")
public class ControladorEmpleado {
    
    @Autowired
    private ServicioEmpleado servicioEmpleado;

    @GetMapping("/")
    public String inicio(Model model){
        var empleados = servicioEmpleado.ListarEmpleados();
        log.info("Ejecutando el controlador Spring MVC");
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
