/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje5;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = read.nextInt();
        
        System.out.println("El doble es " + num*2);
        System.out.println("El triple es " + num*3);
        System.out.println("La raíz cuadrada es " + Math.sqrt(num));
    }
    
}
