/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.runt.prueba.colegio.servicio;

import com.runt.prueba.colegio.modelo.Profesor;
import com.runt.prueba.colegio.repositorio.ProfesorRepositorio;
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
public class ProfesorServicio {
    
    
    @Autowired
    ProfesorRepositorio profesorRepositorio;
 
    // Get all students from the h2 database.
    public List<Profesor> obtenerTodos() {
        final List<Profesor> profesores = new ArrayList<>();
        profesorRepositorio.findAll().forEach(profesor -> profesores.add(profesor));
        return profesores;
    }
    
    public Optional < Profesor > obtenerPorId(Integer id) {
        return profesorRepositorio.findById(id);
    }
}
