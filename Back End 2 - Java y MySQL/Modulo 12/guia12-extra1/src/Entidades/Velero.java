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
public final class Velero extends Barco{
    private int numeroMastiles;

    public Velero(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    public Velero(int numeroMastiles, int matricula, double eslora, Date anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
        modulo+=numeroMastiles;
    }

    public Velero() {
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public int getMatricula() {
        return matricula;
    }

    /**
     *
     * @param matricula
     */
    @Override
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    @Override
    public Date getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Date anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.numeroMastiles;
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
        final Velero other = (Velero) obj;
        return this.numeroMastiles == other.numeroMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "numeroMastiles=" + numeroMastiles + '}';
    }
    
    
    
}
