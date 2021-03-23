/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.runt.prueba.colegio.repositorio;

import com.runt.prueba.colegio.modelo.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author driverat
 */
@Repository
public interface ProfesorRepositorio extends JpaRepository<Profesor, Integer>{
    
}
