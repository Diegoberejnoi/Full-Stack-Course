/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidad;

import Entidad.Pelicula;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Diego
 */
public class Comparador {
    
    
    public static Comparator<Pelicula> ordenarDuracionMenoraMayor =new Comparator<Pelicula>(){
    @Override
    public int compare(Pelicula pelicula1, Pelicula pelicula2) {
        Double duracion1=pelicula1.getDuracion();
        Double duracion2=pelicula2.getDuracion();
        return duracion1.compareTo(duracion2);
    }
};
    
    public static Comparator<Pelicula> ordenarDuracionMayoraMenor =new Comparator<Pelicula>(){
    @Override
    public int compare(Pelicula pelicula1, Pelicula pelicula2) {
        Double duracion1=pelicula1.getDuracion();
        Double duracion2=pelicula2.getDuracion();
        return duracion2.compareTo(duracion1);
    }
};

    public static Comparator<Pelicula> ordenarTitulo =new Comparator<Pelicula>(){
    @Override
    public int compare(Pelicula pelicula1, Pelicula pelicula2) {
        String titulo1=pelicula1.getTitulo();
        String titulo2=pelicula2.getTitulo();
        return titulo1.compareTo(titulo2);
    }
};
    public static Comparator<Pelicula> ordenarDirector =new Comparator<Pelicula>(){
    @Override
    public int compare(Pelicula pelicula1, Pelicula pelicula2) {
        String director1=pelicula1.getDirector();
        String director2=pelicula2.getDirector();
        return director1.compareTo(director2);
    }
};


    
}
