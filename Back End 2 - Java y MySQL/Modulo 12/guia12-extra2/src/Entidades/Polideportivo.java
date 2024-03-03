/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Diego
 */
public class Polideportivo extends Edificio{
    private String nombre;
    private boolean tipoInstalacion; //techada(true) o abierta(false)

    public Polideportivo(String nombre, boolean tipoInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public Polideportivo(String nombre, boolean tipoInstalacion) {
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public Polideportivo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(boolean tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }
 
    @Override
    public double calcularSuperficie() {
        return (ancho*largo);
    }

    @Override
    public double calcularVolumen() {
        return (ancho*largo*alto);
    }
    
}
