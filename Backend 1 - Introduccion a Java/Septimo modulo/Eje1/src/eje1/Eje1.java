/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1;

import eje1.entidades.Libro;

/**
 *
 * @author Diego
 */
public class Eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro l1= new Libro();
        l1.cargarLibro();
        System.out.println(l1);
        
    }
    
}
