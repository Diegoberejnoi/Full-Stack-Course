/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import ejercicio2.Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el radio de su circunferencia");
        float radio= in.nextFloat();
        in.nextLine();
        Circunferencia cir1 = new Circunferencia(radio);
        System.out.println(cir1.toString());
        System.out.println(cir1.area());
        System.out.println(cir1.perimetro());
               
        System.out.println("Ingrese otro radio");
        cir1.crearCircunferencia(in.nextFloat());
        in.nextLine();
        System.out.println(cir1.toString());
        System.out.println(cir1.area());
        System.out.println(cir1.perimetro());
        
    }
    
}
