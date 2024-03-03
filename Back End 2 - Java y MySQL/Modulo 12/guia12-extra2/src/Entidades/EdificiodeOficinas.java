/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Diego
 */
public class EdificiodeOficinas extends Edificio{
    private int numerodeOficinas, cantPersonas, cantPisos;

    public EdificiodeOficinas(int numerodeOficinas, int cantPersonas, int cantPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numerodeOficinas = numerodeOficinas;
        this.cantPersonas = cantPersonas;
        this.cantPisos = cantPisos;
    }

    public EdificiodeOficinas(int numerodeOficinas, int cantPersonas, int cantPisos) {
        this.numerodeOficinas = numerodeOficinas;
        this.cantPersonas = cantPersonas;
        this.cantPisos = cantPisos;
    }

    public EdificiodeOficinas() {
    }

    public int getNumerodeOficinas() {
        return numerodeOficinas;
    }

    public void setNumerodeOficinas(int numerodeOficinas) {
        this.numerodeOficinas = numerodeOficinas;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }
     //Crear el método cantPersonas(), que muestre
    //cuantas personas entrarían en un piso y cuantas en todo el edificio.
    public void cantidadPersonas(){
        System.out.println("La cantidad de personas que entran en un piso son "
                +(cantPersonas*numerodeOficinas));
        System.out.println("La cantidad de personas que entran en el edificio son "
                +(cantPersonas*numerodeOficinas*cantPisos));
    }

    @Override
    public double calcularSuperficie() {
     return (ancho*largo);
    }

    @Override
    public double calcularVolumen() {
    return(ancho*largo*alto);
    }
    
}
