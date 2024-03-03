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
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros positivos");
        
        double num1, num2;
        do {
            num1 = leer.nextDouble();
            if (num1<=0) {
                System.out.println("El número ingresado no es un entero positivo");
                System.out.println("Intente de nuevo");
            }
        } while (num1 <= 0);
        
        do {
            num2 = leer.nextDouble();
            if (num2<=0) {
                System.out.println("El número ingresado no es un entero positivo");
                System.out.println("Intente de nuevo");
            }
        } while (num2 <= 0);
        
    int opcion;
    String salir = "N";
    
        do {
            
            System.out.println("Menú");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            
            opcion=leer.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println(num1 + "+" + num2 + " = " + num1+num2);
                    break;
                case 2:
                    System.out.println(num1 + "-" + num2 + " = " + (num1-num2));
                    break;
                case 3:
                    System.out.println(num1 + "*" + num2 + " = " + num1*num2);
                    break;
                case 4:
                    System.out.println(num1 + "/" + num2 + " = " + num1/num2);
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir del programa? (S/N)");
                    salir= leer.next();
                    salir=salir.toUpperCase();
                    break;
                default:
                    System.out.println("No selecciono una opción valida");
                    break;
            }
            
            
        } while (salir.equals("N"));
        
        
    }
    
}
