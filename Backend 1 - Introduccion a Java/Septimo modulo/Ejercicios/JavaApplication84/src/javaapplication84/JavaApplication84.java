/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication84;

import Entidades.Puntos;

/**
 *
 * @author Diego
 */
public class JavaApplication84 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Puntos p1 = new Puntos();
        
        p1.crearPuntos();
        System.out.println("La distancia entre los puntos es " + p1.distancia());
        
        
    }
    
}
