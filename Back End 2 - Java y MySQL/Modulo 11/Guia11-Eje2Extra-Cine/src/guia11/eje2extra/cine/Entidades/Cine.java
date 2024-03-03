/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11.eje2extra.cine.Entidades;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Cine {
    private ArrayList<Espectador> espectadores;
    private Pelicula pelicula;
    private Double precioEntrada;
    private ArrayList<ArrayList<Asiento>> butacas;

    public Cine() {
        espectadores=new ArrayList();
        pelicula=new Pelicula();
        butacas=new ArrayList();
    }

    
    public Cine(Double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public ArrayList<ArrayList<Asiento>> getButacas() {
        return butacas;
    }

    public void setButacas(ArrayList<ArrayList<Asiento>> butacas) {
        this.butacas = butacas;
    }
    

    @Override
    public String toString() {
        return "Cine{" + "espectadores=" + espectadores + ", pelicula=" + pelicula + ", precioEntrada=" + precioEntrada + '}';
    }
    
    
}
