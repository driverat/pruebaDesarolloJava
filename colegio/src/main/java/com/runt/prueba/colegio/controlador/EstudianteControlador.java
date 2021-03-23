/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.runt.prueba.colegio.controlador;

import com.runt.prueba.colegio.excepcion.ResourceNotFoundException;
import com.runt.prueba.colegio.modelo.Estudiante;
import com.runt.prueba.colegio.servicio.EstudianteServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author driverat
 */

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/prueba/v1")
public class EstudianteControlador {
    
    @Autowired
    private EstudianteServicio estudianteServicio;

    @GetMapping("/estudiantes")
    public List<Estudiante> obtenerTodosEstudiantes() {
        return estudianteServicio.obtenerTodos();
    }

    @GetMapping("/estudiantes/{id}")
    public ResponseEntity<Estudiante> obtenerEstudiantePorId(@PathVariable(value = "id") Integer estudianteId)
        throws ResourceNotFoundException {
        
        Estudiante estudiante = estudianteServicio.obtenerPorId(estudianteId)
          .orElseThrow(() -> new ResourceNotFoundException("Estudiante no encontrado con id :: " + estudianteId));
        return ResponseEntity.ok().body(estudiante);
    }

}
