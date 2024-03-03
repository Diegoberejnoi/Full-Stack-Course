/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class PeliculaServicio {
    private Scanner in;
    private ArrayList<Pelicula> lista;
    
      public PeliculaServicio() {
        in= new Scanner(System.in).useDelimiter("\n");
        lista=new ArrayList();
    }
    
    /*
    En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
    Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.*/

      public void crearPelicula(){
          String op="s";
          
          while(op.equalsIgnoreCase("s")){
          System.out.println("Ingrese el titulo de la pelicula");
          String titulo=in.nextLine();
          System.out.println("Ingrese el director de la pelicula");
          String director=in.nextLine();
          System.out.println("Ingerse la duración de la película en horas");
          double duracion=in.nextDouble();
          in.nextLine();
          lista.add(new Pelicula(titulo,director,duracion));
          System.out.println("Desea agregar otra pelicula?");
          op=in.nextLine();          
          }
         
      }
      
         /*
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.

    */
      public void mostrarPeliculas(){
          System.out.println("-----------------");
          for (Pelicula aux : lista) {
              System.out.println(aux);              
          }
          System.out.println("-----------------");
      }
      
      public void mostrarPeliculasLargas(){
          Iterator<Pelicula> each=lista.iterator();
          ArrayList<Pelicula> peliculasLargas=new ArrayList();
        while (each.hasNext()) {
            Pelicula pel = each.next();
            if (pel.getDuracion() > 1) {
                peliculasLargas.add(pel);
            }
        }
          System.out.println("-----------------");
          System.out.println("Las peliculas de mas de 1 hora son las siguientes:");
        for (Pelicula aux : peliculasLargas) {
            System.out.println(aux);
        }
        System.out.println("-----------------");
    }
      
      /*
      • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
      */
      
      public void ordenarDuracionMenoraMayor(){
          
          Collections.sort(lista, new Comparator<Pelicula>() {
    @Override
    public int compare(Pelicula pelicula1, Pelicula pelicula2) {
        Double duracion1=pelicula1.getDuracion();
        Double duracion2=pelicula2.getDuracion();
        return duracion1.compareTo(duracion2);
    }
});
          System.out.println("Las películas ordenadas de menor a mayor duracion:");
          mostrarPeliculas();
      }
      public void ordenarDuracionMayoraMenor(){
          Collections.sort(lista, new Comparator<Pelicula>() {
    @Override
    public int compare(Pelicula pelicula1, Pelicula pelicula2) {
        Double duracion1=pelicula1.getDuracion();
        Double duracion2=pelicula2.getDuracion();
        return duracion2.compareTo(duracion1);
    }
});
          System.out.println("Las películas ordenadas de mayor a menor duracion:");
          mostrarPeliculas();
      }
      
       public void ordenarTitulo(){
          Collections.sort(lista, new Comparator<Pelicula>() {
    @Override
    public int compare(Pelicula pelicula1, Pelicula pelicula2) {
        String titulo1=pelicula1.getTitulo();
        String titulo2=pelicula2.getTitulo();
        return titulo1.compareTo(titulo2);
    }
});
          System.out.println("Las películas ordenadas por titulo:");
          mostrarPeliculas();
      }
      
      public void ordenarDirector(){
          Collections.sort(lista, new Comparator<Pelicula>() {
    @Override
    public int compare(Pelicula pelicula1, Pelicula pelicula2) {
        String director1=pelicula1.getDirector();
        String director2=pelicula2.getDirector();
        return director1.compareTo(director2);
    }
});
          System.out.println("Las películas ordenadas por director:");
          mostrarPeliculas();
      }
    
}
