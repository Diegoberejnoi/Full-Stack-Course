/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1;

import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class Eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Creamos 2 variables numericas para ingresar por teclado usando
        un Scanner*/
        
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        
        //creamos las variables donde vamos a guardar los numeros ingresados por teclado
        int numero1, numero2;
        
        //Pedimos al usuario que ingrese los numeros
        System.out.println("Ingrese los dos números que desea sumar");
        
        //colocamos nextInt para poder ingresar los enteros por el scanner
        numero1 = num1.nextInt();
        numero2 = num2.nextInt();
                
        //creamos la variable suma y la asignamos con la suma directamente
        long sum = numero1 + numero2;
        
        //mostramos en pantalla
        System.out.println(numero1 + " + " + numero2 + " = " + sum );
        
    }
    
}
