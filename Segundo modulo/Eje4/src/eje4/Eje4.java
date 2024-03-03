/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje4;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Eje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura grados en centígrados");
        
        double grados = read.nextDouble();
        System.out.println(grados + "°C equivalen a " + (grados*9/5)+32 + "°F");
    }
    
}
