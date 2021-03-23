/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.runt.prueba.colegio.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author driverat
 */

@Entity
@Table(name = "CURSO")
public class Curso implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "grado", nullable = false)
    private int grado;
    
    @Column(name = "salon", nullable = false)
    private String salon;
    
    @ManyToOne
    private Colegio colegio;

    public Curso() {
    }

    public Curso(int id, int grado, String salon, Colegio colegio) {
        this.id = id;
        this.grado = grado;
        this.salon = salon;
        this.colegio = colegio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public Colegio getColegio() {
        return colegio;
    }

    public void setColegio(Colegio colegio) {
        this.colegio = colegio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        hash = 67 * hash + this.grado;
        hash = 67 * hash + Objects.hashCode(this.salon);
        hash = 67 * hash + Objects.hashCode(this.colegio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Curso other = (Curso) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.grado != other.grado) {
            return false;
        }
        if (!Objects.equals(this.salon, other.salon)) {
            return false;
        }
        if (!Objects.equals(this.colegio, other.colegio)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Curso{" + "id=" + id + ", grado=" + grado + ", salon=" + salon + ", colegio=" + colegio + '}';
    }
    
    
}
