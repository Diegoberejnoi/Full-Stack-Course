/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje8;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Eje8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dimension;
        
        System.out.println("Ingrese la dimension del cuadrado");
        
        dimension= leer.nextInt();
        
        for (int i = 0; i < dimension; i++) {
            
            for (int j = 0; j < dimension; j++) {

                if (i == 0 || i == dimension-1 || j == 0 || j == dimension-1) {
                System.out.print("*");
                
                } else {
                System.out.print(" ");
            }
                            
            }

            System.out.println("");
        }
        
    }
    
}
