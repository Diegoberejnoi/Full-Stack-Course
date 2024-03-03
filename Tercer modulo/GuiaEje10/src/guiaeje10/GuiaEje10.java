/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaeje10;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class GuiaEje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 4 números entre 1 y 20");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int num3 = leer.nextInt();
        int num4 = leer.nextInt();
        
        while (num1<1 || num1>20) {
            System.out.println("El primer número ingresado no es valido, intentelo de nuevo");
            num1=leer.nextInt();
            
        } 
        
        while (num2<1 || num2>20) {
            System.out.println("El segundo número ingresado no es valido, intentelo de nuevo");
            num2=leer.nextInt();
            
        } 
    
        while (num3<1 || num3>20){
            System.out.println("El tercer número ingresado no es valido, intentelo de nuevo");
            num3=leer.nextInt();
            
        } 
                
        while (num4<1 || num4>20) {
            System.out.println("El cuarto número ingresado no es valido, intentelo de nuevo");
            num4=leer.nextInt();
            
        }  
        
        System.out.print(num1);
        for (int i=0; i<num1; i++){
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print(num2);
        for (int i=0; i<num2; i++){
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print(num3);
        for (int i=0; i<num3; i++){
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print(num4);
        for (int i=0; i<num4; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    
}
