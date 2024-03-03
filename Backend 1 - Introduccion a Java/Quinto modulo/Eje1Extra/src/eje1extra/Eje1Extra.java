/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1extra;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Eje1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el tamaño de su vector");
        int n = in.nextInt();
        int[] vector = new int[n];
        int sum=0;
        System.out.println("Ingrese los números que desee sumar");
          for (int i = 0; i < n; i++) {
            vector[i]=in.nextInt();  
            sum+=vector[i];
        }
            
        System.out.println("La suma es " + sum);
    }
    
}
