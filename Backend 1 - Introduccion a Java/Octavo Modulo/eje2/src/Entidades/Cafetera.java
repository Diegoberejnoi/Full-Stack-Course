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
public class Cafetera {
    /*
    Programa Nespresso. Desarrolle una clase Cafetera en el paquete
    Entidades con los atributos capacidadMáxima (la cantidad máxima de
    café que puede contener la cafetera) y cantidadActual (la cantidad
    actual de café que hay en la cafetera). Agregar constructor vacío y con
    parámetros así como setters y getters.
    */
    
    private double capacidadMaxima,capacidadActual;

    public Cafetera() {
        this.capacidadMaxima=2;
    }

    public Cafetera(double capacidadMaxima, double capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", capacidadActual=" + capacidadActual + '}';
    }
    
    
    
    
}
