/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.runt.prueba.colegio.servicio;

import com.runt.prueba.colegio.modelo.Asignatura;
import com.runt.prueba.colegio.modelo.AsignaturaDTO;
import com.runt.prueba.colegio.repositorio.AsignaturaRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author driverat
 * 
 */

@Service
public class AsignaturaServicio {
    
    
    @Autowired
    AsignaturaRepositorio asignaturaRepositorio;
 
    public List<Asignatura> obtenerTodas() {
        final List<Asignatura> asignaturas = new ArrayList<>();
        asignaturaRepositorio.obtenerAsignaturasCompletas().forEach(asignatura -> asignaturas.add(asignatura));
        return asignaturas;
    }
    
    public Optional < Asignatura > obtenerPorId(Integer id) {
        return asignaturaRepositorio.findById(id);
    }
    
    public List<AsignaturaDTO> obtenerAsignaturasPorProfesor(Integer idProfesor) {
        final List<Asignatura> asignaturas = new ArrayList<>();
        asignaturaRepositorio.obtenerAsignaturasPorProfesor(idProfesor).forEach(asignatura -> asignaturas.add(asignatura));
        
        final List<AsignaturaDTO> asignaturasDTO = new ArrayList<>();
        
        asignaturas.stream().forEach((asignatura) -> {
            AsignaturaDTO asignaturaDTO = new AsignaturaDTO();
            
            asignaturaDTO.setId(asignatura.getId());
            asignaturaDTO.setNombre(asignatura.getNombre());
            asignaturaDTO.setEstudiantes(asignatura.getEstudiantes());
            
            asignaturasDTO.add(asignaturaDTO);
        });
        return asignaturasDTO;
    }
}
