/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje3;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Eje3 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la dimesion de vector");
        int n = read.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 99999);
            //System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0;
        for (int i = 0; i < n; i++) {
            int num = vector[i];
            int cont = 0;
            do {
                num /= 10;
                cont++;
            } while (num > 0);
            switch (cont) {
                case 1:
                    uno++;
                    break;
                case 2:
                    dos++;
                    break;
                case 3:
                    tres++;
                    break;
                case 4:
                    cuatro++;
                    break;
                case 5:
                    cinco++;
                    break;

            }
        }
        System.out.println("En el vector hay "+uno+" números de una cifra");        
        System.out.println("En el vector hay "+dos+" números de dos cifras");
        System.out.println("En el vector hay "+tres+" números de tres cifras");
        System.out.println("En el vector hay "+cuatro+" números de cuatro cifras");
        System.out.println("En el vector hay "+cinco+" números de cinco cifras");
    }

}
    

