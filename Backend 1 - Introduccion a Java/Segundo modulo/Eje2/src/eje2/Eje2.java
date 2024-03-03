/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje2;

import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class Eje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos el scanner
        Scanner frase = new Scanner(System.in);
        
        //Pedimos al usuario que ingrese su nombre
        System.out.println("Ingrese su nombre");
        //creamos la variable nombre le asignamos el valor que ingresara el usuario
        String nombre = frase.next();
        
        //Imprimimos en pantalla
        System.out.println("Hola " + nombre);
        
        
    }
    
}
