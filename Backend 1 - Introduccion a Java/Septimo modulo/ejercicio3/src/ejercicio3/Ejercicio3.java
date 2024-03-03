/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import ejercicio3.Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese los 2 valores con los que desea operar");
        
        Operacion cuenta1 = new Operacion(in.nextInt(), in.nextInt());
        System.out.println(cuenta1.toString());
        
       
        Operacion cuenta2 = new Operacion();
        System.out.println(cuenta2.toString());
        
       
        System.out.println("set numero1");
        cuenta2.setNumero1(in.nextInt());
        System.out.println("set numero2");
        cuenta2.setNumero2(in.nextInt());
        
        int num1=cuenta2.getNumero1(), num2=cuenta2.getNumero2();
        System.out.println("cuenta 2: numero1= "+ num1 + " y numero2= " + num2);
        
        System.out.println("ingrese num1 y num2 para cuenta 1");
        cuenta1.crearOperacion(in.nextInt(), in.nextInt());
        System.out.println(cuenta1.toString());
        
        int suma, resta, multiplicacion;
        float division;
        suma=cuenta1.sumar();
        resta=cuenta1.resta();
        multiplicacion=cuenta1.multiplicar();
        division=cuenta1.dividir();
        System.out.println("suma= " + suma);
        System.out.println("resta= " + resta);
        System.out.println("multiplicacion= " + multiplicacion);
        System.out.println("division= " + division);

        
    }
    
}
