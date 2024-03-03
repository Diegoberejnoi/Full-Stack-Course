/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11.eje2extra.cine.Entidades;

/**
 *
 * @author Diego
 */
public class Espectador {
    
    private String nombre;
    private Integer edad;
    private Double dineroDisponible;

    public Espectador(String nombre, Integer edad, Double dineroDisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisponible = dineroDisponible;
    }

    public Espectador(Double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    public Espectador(Integer edad, Double dineroDisponible) {
        this.edad = edad;
        this.dineroDisponible = dineroDisponible;
    }
    

    public Espectador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(Double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dineroDisponible=" + dineroDisponible + '}';
    }
    
    
    
    
}
