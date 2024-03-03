/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje5;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
        */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor límite");
        int limite = leer.nextInt();
        int num, sum=0;
        
        do {
            System.out.println("Ingrese un número para sumar");
            num=leer.nextInt();
            sum+=num;
        } while (sum<=limite);
           
        System.out.println("La suma fue de " + sum);
    }
    
}
