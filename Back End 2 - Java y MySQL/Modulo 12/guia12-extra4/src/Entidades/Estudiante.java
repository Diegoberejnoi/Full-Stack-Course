/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Objects;

/**
 *
 * @author Diego
 */
public final class Estudiante extends Persona{
    
    private String curso;

    public Estudiante() {
        
    }

    public Estudiante(String curso, String nombre, String apellido, int dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.curso);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estudiante other = (Estudiante) obj;
        return Objects.equals(this.curso, other.curso);
    }

    @Override
    public String toString() {
        return "Estudiante{" + super.toString() + "curso=" + curso + '}';
    }
    
    
    
}
