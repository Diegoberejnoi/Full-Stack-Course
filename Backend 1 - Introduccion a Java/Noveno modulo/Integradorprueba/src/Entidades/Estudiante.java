/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Diego
 */
public class Estudiante {
    
    private String alumnos[];
    private double notas[];

    public Estudiante() {
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    
    
}
