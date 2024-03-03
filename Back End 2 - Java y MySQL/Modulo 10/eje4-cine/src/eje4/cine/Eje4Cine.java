/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje4.cine;

import Servicio.PeliculaServicio;

/**
 *
 * @author Diego
 */
public class Eje4Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
       
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
22
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
        */
        PeliculaServicio sv = new PeliculaServicio();
        sv.crearPelicula();
        sv.mostrarPeliculas();
        sv.mostrarPeliculasLargas();
        sv.ordenarDuracionMayoraMenor();
        sv.ordenarDuracionMenoraMayor();
        sv.ordenarTitulo();
        sv.ordenarDirector();
    }
    
}
