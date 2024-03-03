/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author Diego
 */
public class BarcoAMotor extends Barco{
    protected int potencia; //en caballos de vapor

    public BarcoAMotor() {
    }

    public BarcoAMotor(int potencia, int matricula, double eslora, Date anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
        modulo+=potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.potencia;
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
        final BarcoAMotor other = (BarcoAMotor) obj;
        return this.potencia == other.potencia;
    }

    @Override
    public String toString() {
        return "BarcoAMotor{" + "potencia=" + potencia + '}';
    }
    
    
}
