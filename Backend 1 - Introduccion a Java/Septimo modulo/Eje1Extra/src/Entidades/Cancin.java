/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;




public class Cancin {
   private String autor; 
   private String titulo; 

    public Cancin(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public Cancin() {
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }





    
}