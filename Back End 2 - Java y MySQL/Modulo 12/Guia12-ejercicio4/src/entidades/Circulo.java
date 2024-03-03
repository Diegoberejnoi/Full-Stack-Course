/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import interfaces.calculosFormas;

/**
 *
 * @author Carlos Ezequiel Diaz
 */
public class Circulo implements calculosFormas {
    
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public double calcularArea() {
        return calculosFormas.PI*Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        
        return calculosFormas.PI*2*radio;
        
    }
    
    
}
