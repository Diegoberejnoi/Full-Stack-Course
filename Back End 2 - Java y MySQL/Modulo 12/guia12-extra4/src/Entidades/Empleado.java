/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Diego
 */
public class Empleado extends Persona{
    
    protected int anioIncorporacion, despacho;

    public Empleado(int anioIncorporacion, int despacho, String nombre, String apellido, int dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.despacho = despacho;
    }

    public Empleado() {
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getDespacho() {
        return despacho;
    }

    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.anioIncorporacion;
        hash = 37 * hash + this.despacho;
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
        final Empleado other = (Empleado) obj;
        if (this.anioIncorporacion != other.anioIncorporacion) {
            return false;
        }
        return this.despacho == other.despacho;
    }

    @Override
    public String toString() {
        return super.toString() + "anioIncorporacion=" + anioIncorporacion + ", despacho=" + despacho + '}';
    }
    
    
    
}
