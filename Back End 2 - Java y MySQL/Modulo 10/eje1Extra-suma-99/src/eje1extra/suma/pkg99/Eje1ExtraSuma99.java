/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1extra.suma.pkg99;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Eje1ExtraSuma99 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        ArrayList <Integer> valores = new ArrayList ();
        Scanner leer = new Scanner (System.in);
        int numero;
        int suma=0;
        
        do{
            
            System.out.print("Ingrese un numero entero: ");
            numero = leer.nextInt();
            
            if (numero!=-99){
                
                valores.add(numero);
                suma+= numero;
            }
                
                        
        } while (numero!=-99);
        
        System.out.println("Se han leido "+valores.size()+" valores.");
        System.out.println("La suma de los numeros ingresados es "+suma);
        System.out.println("El promedio de los numeros ingresados es "+(double)suma/(valores.size()));
        
        
    }
    }
    

