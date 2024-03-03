/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1.entidades;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Libro {
    public int ISBN;
    public String titulo;
    public String autor;
    public int numeroDePaginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numeroDePaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }
    
   public void cargarLibro(){
       Scanner in = new Scanner(System.in).useDelimiter("\n");
       System.out.println("Ingrese el ISBN");
       ISBN=in.nextInt();
       in.nextLine();
       System.out.println("Ingrese el titulo");
       titulo=in.nextLine();
       
       System.out.println("Ingrese el autor");
       autor=in.nextLine();
     
       System.out.println("Ingrese el numero de paginas");
       numeroDePaginas=in.nextInt();
       in.nextLine();
      
   }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroDePaginas=" + numeroDePaginas + '}';
    }
   
    
}
