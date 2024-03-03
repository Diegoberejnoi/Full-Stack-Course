/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje13guia;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Eje13Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String equipo[] = new String[6];
        
        for (int i = 0; i < 6; i++) {
            equipo[i]=in.nextLine();
         
            
        }
        for (int i = 0; i < 6; i++) {
               System.out.println("[" + equipo[i] + "]");
        }
    }
    
}
