/*


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
package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class peliculaServicio {
  
 Scanner input = new Scanner(System.in).useDelimiter("\n");
 
 ArrayList<Pelicula> listaPeliculas= new ArrayList();

 public void crearPeliculas(){
      char salir;
       String titulo;
       String director;
      
    do{ 
     Pelicula nuevaPelicula = new Pelicula();
       do{
       System.out.println("Ingrese el titulo de la pelicula");
       titulo= input.next().toUpperCase().trim();
       }while(titulo.equals(""));
       
       do{
       System.out.println("Ingrese el nombre del director de la pelicula");
       director= input.next().toUpperCase().trim();
       }while(director.equals(""));
        nuevaPelicula.setTitulo(titulo);
        nuevaPelicula.setDirector(director);
       System.out.println("Ingrese la duracion en horas,minutos  y segundos de la pelicula");
        // guarda la hora , el minuto y los segundos en el objeto nuevaPelicula,
        // llamando a la funcion setDuracion que se encuentra en endidad Pelicula
       nuevaPelicula.setduracion(input.nextInt(),input.nextInt(), input.nextInt());
       input.nextLine();// evitar en el proximo , tome un enter vacio
       listaPeliculas.add(nuevaPelicula); // se agrega a la lista de peliculas.
        System.out.println("Desea seguir ingresando peliculas (S/N)");
        salir=input.next().toLowerCase().charAt(0);
    } while(salir=='s');   
   }
 
  public void generarPeliculas(){
    Pelicula p1= new Pelicula("9 Reinas"," Darin");
    p1.setduracion(1, 20, 20);
    Pelicula p2= new Pelicula("Malvinas"," AAA");
    p2.setduracion(2, 20, 20);
    Pelicula p3= new Pelicula("corto "," tio nico");
    p3.setduracion(0, 20, 20);
   listaPeliculas.add(p1);
   listaPeliculas.add(p2);
   listaPeliculas.add(p3);
  }
   public void mostrarPelicula(){
       System.out.println("Todas las peliculas de la Lista");
       for(Pelicula aux : listaPeliculas) {
           System.out.println(aux.toString());
       }
      // System.out.println("total de la lista: "+ listaPeliculas.size() );
   }
    public void mostrarPeliculaMayorHora(){
        int contador=0;
         System.out.println("lista de peliculas con una duracion + de 1 hora");
        for (Pelicula aux : listaPeliculas) {
            if(aux.getDuracionPelicula().get(Calendar.HOUR)>=1){
                System.out.println(aux.toString());
                contador++;
            }
        }
        System.out.println("La cantidad de peliculas:"+ contador);
    }
    public void ordenarDuracionAscendente(){
      System.out.println("Lista ordenada de  menor  a mayor por duracion de tiempo");
     Collections.sort(listaPeliculas, new Comparator<Pelicula>() {
         @Override
         public int compare(Pelicula t, Pelicula t1) {
           return t.getDuracionPelicula().compareTo(t1.getDuracionPelicula()); // compara el tiempo duracion de pelicula
         }
     });
           
    }
    
     public void ordenarDuracionDescendente(){
         System.out.println("Lista ordenada de mayor a menor por duracion de tiempo");
     Collections.sort(listaPeliculas, new Comparator<Pelicula>() {
         @Override
         public int compare(Pelicula t, Pelicula t1) {
           return t1.getDuracionPelicula().compareTo(t.getDuracionPelicula()); // compara el tiempo duracion de pelicula
         }
     });
           
    }
   public void cantidadPeliculas(){
    System.out.println("total de la lista: "+ listaPeliculas.size() );
   } 
    public void ordenarTituloAlfabeticamente(){
         System.out.println("Lista ordenada alfabeticamente por titulo");
     Collections.sort(listaPeliculas, new Comparator<Pelicula>() {
         @Override
         public int compare(Pelicula t, Pelicula t1) {
           return t.getTitulo().compareToIgnoreCase(t1.getTitulo()); // compara el tiempo duracion de pelicula
         }
     });
           
    }
   
    public void ordenarDirectorAlfabeticamente(){
         System.out.println("Lista ordenada alfabeticamente por director");
     Collections.sort(listaPeliculas, new Comparator<Pelicula>() {
         @Override
         public int compare(Pelicula t, Pelicula t1) {
           return t.getDirector().compareToIgnoreCase(t1.getDirector()); // compara el tiempo duracion de pelicula
         }
     });
           
    }
   
}
