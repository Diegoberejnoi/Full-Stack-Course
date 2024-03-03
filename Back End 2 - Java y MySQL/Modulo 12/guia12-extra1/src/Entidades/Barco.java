/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Diego
 */
public class Barco {
    /*
    su matrícula, su eslora en metros y año de fabricación
    */
    
    protected int matricula;
    protected double eslora;
    protected Date anioFabricacion;
    protected double modulo;
    
    public Barco() {
    }

    public Barco(int matricula, double eslora, Date anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
        this.modulo=eslora*10;
    }
    public void calcularModulo(){
        modulo=eslora*10;
    }

    public double getModulo() {
        return modulo;
    }

    public void setModulo(double modulo) {
        this.modulo = modulo;
    }
    

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public Date getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Date anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.matricula;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.eslora) ^ (Double.doubleToLongBits(this.eslora) >>> 32));
        hash = 83 * hash + Objects.hashCode(this.anioFabricacion);
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
        final Barco other = (Barco) obj;
        if (this.matricula != other.matricula) {
            return false;
        }
        if (Double.doubleToLongBits(this.eslora) != Double.doubleToLongBits(other.eslora)) {
            return false;
        }
        return Objects.equals(this.anioFabricacion, other.anioFabricacion);
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion + '}';
    }
    
    
    
}
