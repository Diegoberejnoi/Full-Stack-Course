/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje5;

/**
 *
 * @author Diego
 */
public class Eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] matrizB = new int [3][3];
        int[][] matriz= {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println("\n");
        int cont = 0;
        
        for (int i=0; i<3;i++){
            for (int j = 0; j < 3; j++) {
                matrizB[i][j]=matriz[j][i];
                              
                
             }
            System.out.println("");
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matrizB[i][j]+"]");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               if (matriz[i][j]!=-1*matrizB[i][j]) {
                    cont++;
                }
            }
            
        }
        
        if (cont==0) {
            System.out.println("La matriz es antisimetrica");
            
        }else{
            System.out.println("La matriz no es antisimetrica");
        }
    }
    
}
