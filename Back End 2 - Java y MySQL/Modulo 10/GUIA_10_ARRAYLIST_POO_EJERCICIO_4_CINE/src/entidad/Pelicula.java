/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author Usuario
 */// Es un metodo que se prepara para que sea todo ordenable<comparable>
public class Pelicula  implements Comparable< Pelicula>{
    private String titulo;
    private String director;
   // private double duracion;
    Calendar duracionPelicula= Calendar.getInstance();

    public Pelicula() {
    }

    public Pelicula(String titulo, String director) {
        this.titulo = titulo;
        this.director = director;
    
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Calendar getDuracionPelicula() {
        return duracionPelicula;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracionPelicula(Calendar duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }

    @Override
    public int compareTo(Pelicula t) {
     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.titulo);
        hash = 17 * hash + Objects.hashCode(this.director);
        hash = 17 * hash + Objects.hashCode(this.duracionPelicula);
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
        final Pelicula other = (Pelicula) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.director, other.director)) {
            return false;
        }
        if (!Objects.equals(this.duracionPelicula, other.duracionPelicula)) {
            return false;
        }
        return true;
    }
    public void setduracion(int hora, int minutos, int segundos) {
        duracionPelicula.set(Calendar.HOUR_OF_DAY, hora);
        duracionPelicula.set(Calendar.MINUTE, minutos);
        duracionPelicula.set(Calendar.SECOND, segundos);
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo: " + titulo + ", director: " + director 
                + ",Hora: " + duracionPelicula.get(Calendar.HOUR_OF_DAY) +
                " Minutos: "+duracionPelicula.get(Calendar.MINUTE)+
                " Segundos: "+ duracionPelicula.get(Calendar.SECOND) +  '}';
    }
    
   
    
    
}
