/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje2;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Eje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Diseñe una función que pida el nombre y la edad de N personas e
        imprima los datos de las personas ingresadas por teclado e indique si
        son mayores o menores de edad. Después de cada persona, el programa
        debe preguntarle al usuario si quiere seguir mostrando personas y frenar
        cuando el usuario ingrese la palabra “No”.
        */
        Scanner leer = new Scanner(System.in);
        String nombre, opcion;
        int edad;
        do{
          System.out.println("Ingrese el nombre y la edad");
          nombre= leer.next();
          edad = leer.nextInt();          
          menor(nombre,edad);
          System.out.println("Desea seguir mostrando personas?");
          opcion=leer.next();
          
        } while (!opcion.equalsIgnoreCase("no"));      
        
    }
    
    public static void menor(String nombre, int edad){
        if (edad<18) {
            System.out.println(nombre + " es menor de edad");
            
        } else {
            System.out.println(nombre + " es mayor de edad");
        }
    }
    
}
