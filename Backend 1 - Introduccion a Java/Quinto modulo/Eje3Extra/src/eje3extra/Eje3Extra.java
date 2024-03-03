/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje3extra;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Eje3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Dimensione el vector");
        int n = in.nextInt();
        int[] vector =new int[n];
        rellena(vector);
        imprime(vector);
        
    }
    
    public static void rellena(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int) (Math.random()*10);
        }
    }
    public static void imprime(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]");;
        }
        System.out.println("");
    }
    
}
