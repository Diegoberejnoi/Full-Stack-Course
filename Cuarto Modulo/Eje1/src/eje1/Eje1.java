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
        /*
        Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
        restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
        matemática y deben devolver sus resultados para imprimirlos en el main. 
        */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los numeros con los que desea operar");
        
        int num1 =leer.nextInt(); int num2 =leer.nextInt(); int opciones;
        
              
        
        System.out.println("Ingrese el numero de operacion que desea realizar");
        System.out.println("1. SUMAR  \n2. RESTAR \n3. MULTIPLICAR\n4. DIVIDIR");
        
        opciones= leer.nextInt();
        switch(opciones) {
            case 1: System.out.println(sumar(num1,num2));
            break;
            case 2: System.out.println(restar(num1,num2));
            break;
            case 3: System.out.println(multiplicar(num1,num2));
            break;
            case 4: System.out.println(dividir(num1,num2));
            break;
            
                    
        }             
        
        
    }
    public static int sumar(int n, int n2){
        int sumar= n+n2;
        return sumar;
    }
     public static int restar(int n, int n2){
        int restar= n-n2;
        return restar;
    }
      public static int multiplicar(int n, int n2){
        int multiplicar= n*n2;
        return multiplicar;
    }
       public static float dividir(int n, int n2){
           float aux1 = n, aux2 = n2;
        float dividir= aux1/aux2;
        return dividir;
    }
}
