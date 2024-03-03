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
        // TODO code application logic here
        /*
        Crea una aplicación que a través de una función nos convierta una
        cantidad de euros introducida por teclado a otra moneda, estas pueden
        ser a dólares, yenes o libras. La función tendrá como parámetros, la
        cantidad de euros y la moneda a convertir que será una cadena, este no
        devolverá ningún valor y mostrará un mensaje indicando el cambio
        (void).
        El cambio de divisas es:
        i. * 0.86 libras es un 1 €
        ii. * 1.28611 $ es un 1 €
        iii. * 129.852 yenes es un 1 €
        */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros");
        float euro = leer.nextFloat();
        int opcion;
        
        do{
            System.out.println("Elija la moneda a la que desea convertir");
            System.out.println("1. Libras \n2. Pesos \n3. yenes \n4. Cambiar monto \n5. Salir");
            opcion=leer.nextInt();
            if(opcion<1 || opcion >5){
                System.out.println("La opcion ingresada fue incorrecta");
            } else if (opcion==4){
                System.out.println("Ingrese el nuevo monto en euros");
                euro=leer.nextFloat();
            } else{
                conversor(euro, opcion);
            }
                        
        } while(opcion!=5);
        
        
    }
    
    public static void conversor(float money, int moneda){
        switch(moneda){
            case 1:
                System.out.println((money*0.86) + " Libras");
                break;
            case 2:
                System.out.println((money*1.28611) + " $");
                break;
            case 3:
                System.out.println((money*129.852) + " yenes");
                break;
            case 5:
                System.out.println("Muchas gracias");
                break;
        }
            
    }
    
}
