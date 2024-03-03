/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje3;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Eje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Generamos el scanner
        Scanner read = new Scanner(System.in);
       
        System.out.println("Ingrese una frase");
        
        String frase = read.nextLine();
        
        //Convertimos la frase en mayuscula y en minuscula
        System.out.println("Su frase en mayuscula es " + frase.toUpperCase());
        System.out.println("Su frase en mayuscula es " + frase.toLowerCase());
    }
    
}
