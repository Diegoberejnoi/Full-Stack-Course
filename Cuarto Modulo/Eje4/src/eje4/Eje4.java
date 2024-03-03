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
        
        Scanner leer = new Scanner (System.in);
        System.out.print("Ingrese un numero: ");
        
        int n = leer.nextInt();
        
        boolean res = primo(n);
        
        if (res){
            System.out.println("El numero ingresado es Primo");
        } else {
            
            System.out.println("El numero ingresado NO es Primo");
        }
        
    }
    
    public static boolean primo (int a){
        
        int cont = 0;
        boolean resultado= false;
        for (int i=1; i<=a; i++){
            
            if (a%i==0){
                cont ++;
                
            }
            
        }
        
        if (cont<=2){
        
            resultado=true;
        
    } 
    
        return resultado;
}
    
}
