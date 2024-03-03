/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaeje9;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class GuiaEje9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, suma = 0, cont = 0;
        
        do {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            
            
            if (num == 0) {
                System.out.println("Se capturo el 0") ;
                break;
            }else if (num>0){    
                suma += num;
            }
            
            cont ++;
            
        } while (cont <= 20);
        
        System.out.println("La suma de los números ingresados es " + suma);
    }
    
}
