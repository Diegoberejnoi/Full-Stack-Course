/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10_arraylist_poo_ejercicio_4_cine;

import servicio.peliculaServicio;

/**
 *
 * @author Usuario
 */
public class GUIA_10_ARRAYLIST_POO_EJERCICIO_4_CINE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         peliculaServicio ps= new peliculaServicio();
         ps.generarPeliculas();
         ps.mostrarPelicula();
         ps.cantidadPeliculas();
         ps.mostrarPeliculaMayorHora();
         ps.cantidadPeliculas();
         ps.ordenarDuracionAscendente();
         ps.mostrarPelicula();
         ps.cantidadPeliculas();
         ps.ordenarDuracionDescendente();
         ps.mostrarPelicula();
         ps.cantidadPeliculas();
         ps.ordenarTituloAlfabeticamente();
         ps.mostrarPelicula();
         ps.ordenarDirectorAlfabeticamente();
         ps.mostrarPelicula();
        
    }
    
}
