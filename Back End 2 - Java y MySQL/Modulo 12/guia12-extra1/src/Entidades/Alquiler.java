/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Diego
 */
public class Alquiler {
    /*
    Para cada Alquiler se guarda: el
    nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
    amarre y el barco que lo ocupará.
    */
    private double coste;
    private String nombre;
    private int dni;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private String posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(Date fechaAlquiler, Date fechaDevolucion, Barco barco) {
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.barco = barco;
        int dias=(int) TimeUnit.DAYS.convert(fechaDevolucion.getTime()-fechaAlquiler.getTime(), TimeUnit.MILLISECONDS);
        this.coste=dias*barco.getModulo();
    }
    
  

    public Alquiler(String nombre, int dni, Date fechaAlquiler, Date fechaDevolucion, String posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
        int dias=(int) TimeUnit.DAYS.convert(fechaDevolucion.getTime()-fechaAlquiler.getTime(), TimeUnit.MILLISECONDS);
        this.coste=dias*barco.getModulo();
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + this.dni;
        hash = 41 * hash + Objects.hashCode(this.fechaAlquiler);
        hash = 41 * hash + Objects.hashCode(this.fechaDevolucion);
        hash = 41 * hash + Objects.hashCode(this.posicionAmarre);
        hash = 41 * hash + Objects.hashCode(this.barco);
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
        final Alquiler other = (Alquiler) obj;
        if (this.dni != other.dni) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.posicionAmarre, other.posicionAmarre)) {
            return false;
        }
        if (!Objects.equals(this.fechaAlquiler, other.fechaAlquiler)) {
            return false;
        }
        if (!Objects.equals(this.fechaDevolucion, other.fechaDevolucion)) {
            return false;
        }
        return Objects.equals(this.barco, other.barco);
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dni=" + dni + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + '}';
    }
    
    
}
