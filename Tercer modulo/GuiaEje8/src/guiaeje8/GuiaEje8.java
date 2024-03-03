/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaeje8;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class GuiaEje8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nota");
        
        int nota = leer.nextInt();
        
        while (nota<0 || nota>10) {
            System.out.println("La nota ingresada es invalida, ingresela de nuevo");
            nota = leer.nextInt();
        }
        
        System.out.println("Su nota es " + nota);
        
        
    }
    
}
