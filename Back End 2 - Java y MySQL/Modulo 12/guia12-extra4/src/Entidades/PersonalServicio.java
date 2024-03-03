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
public final class PersonalServicio extends Empleado{
    private String seccion;

    public PersonalServicio(String seccion, int anioIncorporacion, int despacho, String nombre, String apellido, int dni, String estadoCivil) {
        super(anioIncorporacion, despacho, nombre, apellido, dni, estadoCivil);
        this.seccion = seccion;
    }

    public PersonalServicio() {
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.seccion);
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
        final PersonalServicio other = (PersonalServicio) obj;
        return Objects.equals(this.seccion, other.seccion);
    }

    @Override
    public String toString() {
        return "Personal de Servicio{" +super.toString()+ "seccion=" + seccion + '}';
    }
    
    
}
