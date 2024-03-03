/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12.ejercicio4;

import entidades.Circulo;
import entidades.Rectangulo;

/**
 *
 * @author Carlos Ezequiel Diaz
 */
public class Guia12Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo c1 = new Circulo (5);
        Rectangulo r1 = new Rectangulo(5,4);
        
        System.out.println("El area del circulo es: "+c1.calcularArea());
        System.out.println("El perimetro del circulo es: "+c1.calcularPerimetro());
        
        System.out.println("El area del rectangulo es: "+r1.calcularArea());
        System.out.println("El perimetro del rectangulo es: "+r1.calcularPerimetro());
        
    }
    
}
