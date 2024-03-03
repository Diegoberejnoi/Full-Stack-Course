/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje6;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Eje6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        int[][] matriz = new int[3][3];
        
        System.out.println("ingrese los números de su matriz mágica");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                matriz[i][j]=in.nextInt();
                
                while (matriz[i][j]<1 || matriz[i][j]>9){
                    System.out.println("el número ingresado es incorrecto");
                    matriz[i][j]=in.nextInt();
                }
                                
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        
        int diagPrin=0, sum=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==j){
                    diagPrin+=matriz[i][j];
                }
                
                if(i == (2 - j)){
                    sum+=matriz[i][j];
                }
            }
        }
                
        int cont=0;
        
        if (diagPrin==sum){
            cont++;
        }
        
        for (int i = 0; i < 3; i++) {
            sum=0;
            for (int j = 0; j < 3; j++) {
                sum+=matriz[i][j];
            }
            if (diagPrin==sum) {
                cont++;
            }
            
        }
        
        for (int i = 0; i < 3; i++) {
            sum=0;
            for (int j = 0; j < 3; j++) {
                sum+=matriz[j][i];
            }
            if (diagPrin==sum) {
                cont++;
            }
        }
        
        if (cont==7) {
            System.out.println("La matriz ingresada es magica");
            
        }else{
            System.out.println("La matriz ingresada no es magica");
        }
        
    }
    
}
