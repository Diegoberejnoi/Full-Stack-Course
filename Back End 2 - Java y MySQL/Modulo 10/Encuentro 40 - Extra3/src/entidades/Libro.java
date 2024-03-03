/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *el título del libro, autor, número de ejemplares y número de ejemplares prestados
 * @author Carlos Ezequiel Diaz
 */
public class Libro {
    //Atributos
    
    private String titulo, autor;
    private int ejemplares, prestados;
    
    //Contructores

    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public Libro() {
    }
    
    //Getter y Setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
    
    public boolean Prestamo (){
        
        
         if (this.prestados<this.ejemplares){
             
             this.prestados++;
             System.out.println("El prestamo se ha realizado correctamente");
             return true;
             
         } else {
             
             System.out.println("El prestamo no se ha podido realizar por falta de stock.");
             return false;
         }
         
        
        
    }
    
    public boolean Devolucion (){
        
        
         if (this.prestados>0){
             
             this.prestados--;
             System.out.println("La devolución se ha realizado correctamente");
             return true;
             
         } else {
             
             System.out.println("La devolución no se ha podido realizar ya que no hay libros prestados de ese titulo.");
             return false;
         }
         
        
        
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", prestados=" + prestados + '}';
    }
}
