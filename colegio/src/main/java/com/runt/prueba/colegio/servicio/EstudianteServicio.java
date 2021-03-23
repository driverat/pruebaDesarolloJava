/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.runt.prueba.colegio.servicio;

import com.runt.prueba.colegio.modelo.Estudiante;
import com.runt.prueba.colegio.repositorio.EstudianteRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author driverat
 */

@Service
public class EstudianteServicio {
    
    @Autowired
    EstudianteRepositorio estudianteRepositorio;
 
    // Get all students from the h2 database.
    public List<Estudiante> obtenerTodos() {
        final List<Estudiante> estudiantes = new ArrayList<>();
        estudianteRepositorio.findAll().forEach(estudiante -> estudiantes.add(estudiante));
        return estudiantes;
    }
    
    public Optional < Estudiante > obtenerPorId(Integer id) {
        return estudianteRepositorio.findById(id);
    }
    
}
