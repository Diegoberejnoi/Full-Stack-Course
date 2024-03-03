/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje7;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Eje7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String cadena,letra1, letra2;
        int contadorCorrecto=0, contadorIncorrecto=0;
        
        do {
            System.out.println("Ingrese su cadena de caracteres");
            
            do {
                 cadena=leer.nextLine();
                 
                 if (cadena.length() !=5) {
                     System.out.println("La cadena no es de 5 caracteres, vuelva a ingresarla");
                }
                 
            } while (cadena.length() !=5);
            
           /*
            letra1=cadena.substring(0,1);
            letra2=cadena.substring(4);
            */
            if (cadena.equals("&&&&&")) {
                break;
            } else if (cadena.substring(0,1).equals("X") && cadena.substring(4).equals("O")) {
                contadorCorrecto++;
            } else {
                contadorIncorrecto++;
            }
            
        } while (!cadena.equals("&&&&&"));
        
        System.out.println("La cantidad de cadenas correctas es " + contadorCorrecto);
        System.out.println("La cantidad de cadenas incorrectas es " + contadorIncorrecto);
        
    }
    
}
