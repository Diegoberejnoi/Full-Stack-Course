/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12teorico;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio12teorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
        usuario, validando que el primer número múltiplo del segundo e imprima si el
        primer número es múltiplo del segundo, sino informe que no lo son.
        */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1=leer.nextInt(), num2=leer.nextInt();
        EsMultiplo(num1,num2);
    }
    
    public static void EsMultiplo(int numero1, int numero2) {
        
        if(numero1%numero2==0){
            System.out.println(numero1 + " es multiplo de " + numero2);
        } else{
            System.out.println(numero1 + " no es multiplo de " + numero2);
        }
        
    }
}
