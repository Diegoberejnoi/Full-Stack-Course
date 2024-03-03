/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import ejercicio4.Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la base y la altura");
        Rectangulo forma=new Rectangulo(in.nextInt(),in.nextInt());
        
        System.out.println(forma.toString());
        
        forma.dibujarRectangulo();
        System.out.println("area=" + forma.area());
        System.out.println("perimetro= " + forma.perimetro());
        
        Rectangulo forma1=new Rectangulo();
        forma1.dibujarRectangulo();
        System.out.println("area=" + forma1.area());
        System.out.println("perimetro= " + forma1.perimetro());
        
        
    }
    
}
