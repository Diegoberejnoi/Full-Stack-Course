/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.Entidades;

/**
 *
 * @author Diego
 */
public class Libro {
    //ISBN, Título, Autor, Número de páginas
    public long ISBN;
    public String titulo;
    public String autor;
    public int nPaginas;

    public Libro(long ISBN, String titulo, String autor, int nPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = nPaginas;
    }

    public Libro() {
        this.ISBN=1;
        this.titulo = "titulo";
        this.autor = "autor";
        this.nPaginas = 1;
    }
    
    /*
    Crear un
    método para cargar un libro pidiendo los datos al usuario y luego
    informar mediante otro método el número de ISBN, el título, el autor del
    libro y el número de páginas.
    */
    
   public void cargarLibro(long ISBN, String titulo, String autor, int nPaginas){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = nPaginas;
   }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", nPaginas=" + nPaginas + '}';
    }
   
   
    
    
    
    
}
