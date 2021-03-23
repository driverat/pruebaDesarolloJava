/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.runt.prueba.colegio.repositorio;

import com.runt.prueba.colegio.modelo.Asignatura;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author driverat
 */
@Repository
public interface AsignaturaRepositorio extends JpaRepository<Asignatura, Integer>{
    
   @Query("select asignatura from Asignatura asignatura left join fetch asignatura.profesor left join fetch asignatura.curso ")
   List<Asignatura> obtenerAsignaturasCompletas();
   
   @Query("select asignatura from Asignatura asignatura left join fetch asignatura.profesor left join fetch asignatura.curso where asignatura.profesor.id = :idProfesor")
   List<Asignatura> obtenerAsignaturasPorProfesor(@Param("idProfesor") Integer idProfesor);
    
}
