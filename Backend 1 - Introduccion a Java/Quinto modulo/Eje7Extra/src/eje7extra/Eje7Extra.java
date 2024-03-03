/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje7extra;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Eje7Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese cuantos números desea saber de la suceción de fibonacci");
        int n = in.nextInt();
        long[] vector = new long[n];
        
        for (int i = 0; i < n; i++) {
            vector[i]=fibonacci(i+1);
        }
        for (int i = 0; i < n; i++) {
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
        
        
    }
    
    public static long fibonacci(int n) {
        long fib=0;
        long prev1=0,prev2=1;
        /*
        if(n==1 || n==2){
            fib=1;            
        } else{
            
            for (int i = 2; i < n; i++) {
            fib=fibonacci(n-1)+fibonacci(n-2);    
            }
            
        }*/
        
        for (int i = 0; i < n; i++) {
            fib=prev1+prev2;
            prev1=prev2;
            prev2=fib;
        }
        
        
        return fib;
    }
    
}
