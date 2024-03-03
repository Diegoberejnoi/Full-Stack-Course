/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaeje6;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class GuiaEje6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 2 números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if (num1>25 && num2>25) {
             System.out.println("Ambos números ingresados son mayores a 25");   
    } else if (num1 > 25 || num2 > 25) {
            System.out.println("Alguno de los números ingresado es mayor a 25");
    } else {
            System.out.println("Ninguno de los números ingresados es mayor a 25");
    }
    
}
}
