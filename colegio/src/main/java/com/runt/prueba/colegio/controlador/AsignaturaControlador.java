/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.runt.prueba.colegio.controlador;

import com.runt.prueba.colegio.excepcion.ResourceNotFoundException;
import com.runt.prueba.colegio.modelo.Asignatura;
import com.runt.prueba.colegio.modelo.AsignaturaDTO;
import com.runt.prueba.colegio.servicio.AsignaturaServicio;
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
public class AsignaturaControlador {
    
    @Autowired
    private AsignaturaServicio asignaturaServicio;
    
    @GetMapping("/asignaturas")
    public List<Asignatura> obtenerTodasAsignaturas() {
        return asignaturaServicio.obtenerTodas();
    }

    @GetMapping("/asignaturas/{id}")
    public ResponseEntity<Asignatura> obtenerAsignaturaPorId(@PathVariable(value = "id") Integer asignaturaId)
        throws ResourceNotFoundException {
        
        Asignatura asignatura = asignaturaServicio.obtenerPorId(asignaturaId)
          .orElseThrow(() -> new ResourceNotFoundException("Asignatura no encontrada con id: " + asignaturaId));
        return ResponseEntity.ok().body(asignatura);
    }
    
     @GetMapping("/asignaturas/profesor/{id}")
    public List<AsignaturaDTO> obtenerAsignaturasPorProfesor(@PathVariable(value = "id") Integer profesorId) {
        return asignaturaServicio.obtenerAsignaturasPorProfesor(profesorId);
    }
    
}
