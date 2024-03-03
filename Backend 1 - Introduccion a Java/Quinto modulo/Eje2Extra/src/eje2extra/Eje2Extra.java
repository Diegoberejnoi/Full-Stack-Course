/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje2extra;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Eje2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el tamaño del vector");
        int n = in.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int [n];
        
        System.out.println("Ingrese el primer vector");
        for (int i=0;i<n;i++) {
            vector1[i]=in.nextInt();
        }
        System.out.println("Ingrese el segundo vector");
        for (int i=0;i<n;i++) {
            vector2[i]=in.nextInt();
        }
        
        boolean igualdad=true;
        for (int i = 0; i < n; i++) {
            if (vector1[i]!=vector2[i]) {
                igualdad=false;
                break;
            }
            
            
            
        }
        if (igualdad) {
                System.out.println("Los vectores son iguales");
            }else {
                System.out.println("Los vectores son distintos");
            }
          
    }
    
}
