/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje2;

import static java.lang.Math.round;
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
        // TODO code application logic here
        
        /*
        Realizar un algoritmo que llene un vector de tamaño N con valores
        aleatorios y le pida al usuario un número a buscar en el vector. El
        programa mostrará dónde se encuentra el numero y si se encuentra
        repetido
        */
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese la dimension del vector");
        int n=in.nextInt();
        
        int[] vector = new int[n];
        
        for (int i=0; i<n;i++) {
            vector[i]=(int) (Math.random()*10);
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
        
        System.out.println("Que número desea buscar?");
        int valor = in.nextInt();
        int cont=0;
        
        for (int i=0; i<n;i++) {
            
            if(valor == vector[i] && cont==0){
                
                System.out.print("El número "+valor+" se encuentra en la posición "+i);
                cont++;
            } else if (valor == vector[i] && cont>0){
                System.out.print(", "+i);
            }
            
        }
        System.out.println("");
        if (cont==0){
            System.out.println("El número "+valor+" no se encuentra dentro del vector");
        }
        
        
    }
    
}
