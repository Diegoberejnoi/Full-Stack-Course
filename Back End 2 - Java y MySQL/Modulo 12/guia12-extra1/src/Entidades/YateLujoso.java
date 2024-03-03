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
public class YateLujoso extends BarcoAMotor{
    private int numeroCamarotes;

    public YateLujoso(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    public YateLujoso(int numeroCamarotes, int potencia, int matricula, double eslora, Date anioFabricacion) {
        super(potencia, matricula, eslora, anioFabricacion);
        this.numeroCamarotes = numeroCamarotes;
        modulo+=numeroCamarotes;
    }

    public YateLujoso() {
    }

    public int getNumeroCamarones() {
        return numeroCamarotes;
    }

    public void setNumeroCamarones(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public int getPotencia() {
        return potencia;
    }

    @Override
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public int getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public double getEslora() {
        return eslora;
    }

    @Override
    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    @Override
    public Date getAnioFabricacion() {
        return anioFabricacion;
    }

    @Override
    public void setAnioFabricacion(Date anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.numeroCamarotes;
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
        final YateLujoso other = (YateLujoso) obj;
        return this.numeroCamarotes == other.numeroCamarotes;
    }

    @Override
    public String toString() {
        return "YateLujoso{" + "numeroCamarones=" + numeroCamarotes + '}';
    }
    
}
