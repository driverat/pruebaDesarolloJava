/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.runt.prueba.colegio.controlador;

import com.runt.prueba.colegio.modelo.Profesor;
import com.runt.prueba.colegio.servicio.ProfesorServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author driverat
 */

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/prueba/v1")
public class ProfesorControlador {
    
    @Autowired
    private ProfesorServicio profesorServicio;
    
    @GetMapping("/profesores")
    public List<Profesor> obtenerTodasAsignaturas() {
        return profesorServicio.obtenerTodos();
    }
    
}
