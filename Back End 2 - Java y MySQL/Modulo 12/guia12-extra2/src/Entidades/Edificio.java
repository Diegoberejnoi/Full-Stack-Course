/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Diego
 */
public abstract class Edificio {
    //ancho, alto y largo
    protected double ancho, alto, largo;

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public Edificio() {
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.ancho) ^ (Double.doubleToLongBits(this.ancho) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.alto) ^ (Double.doubleToLongBits(this.alto) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.largo) ^ (Double.doubleToLongBits(this.largo) >>> 32));
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
        final Edificio other = (Edificio) obj;
        if (Double.doubleToLongBits(this.ancho) != Double.doubleToLongBits(other.ancho)) {
            return false;
        }
        if (Double.doubleToLongBits(this.alto) != Double.doubleToLongBits(other.alto)) {
            return false;
        }
        return Double.doubleToLongBits(this.largo) == Double.doubleToLongBits(other.largo);
    }

    @Override
    public String toString() {
        return "Edificio{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }
    
    public abstract double calcularSuperficie();
    public abstract double calcularVolumen();
}
