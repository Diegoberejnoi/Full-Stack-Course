/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra2;

import EntidadesExtra2.Fraccion;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerValores = new Scanner(System.in);
        Fraccion fracciones1 = new Fraccion();

        System.out.println("Ingrese numerador y denominador para cada fraccion");
        System.out.println("Fraccion1 \n"
                + "Numerador 1: ");
        fracciones1.setNum1(leerValores.nextInt());

        do {
            System.out.println(
                    "Denominador 1: ");
            fracciones1.setDen1(leerValores.nextInt());
            if(fracciones1.getDen1() == 0){
                System.out.println("El denominador no puede ser 0");
            }
        } while (fracciones1.getDen1() == 0);
        
        
        do {
            System.out.println(
                    "Numerador 2: ");
            fracciones1.setNum2(leerValores.nextInt());
            if(fracciones1.getNum2() == 0){
                System.out.println("El denominador no puede ser 0");
            }
        } while (fracciones1.getDen1() == 0);

        do {
            System.out.println(
                    "Denominador 2: ");
            fracciones1.setDen2(leerValores.nextInt());
            if(fracciones1.getDen2() == 0){
                System.out.println("El denominador no puede ser 0");
            }
        } while (fracciones1.getDen1() == 0);
        
        
        System.out.println("El resultado de la operacion elegida es: "+fracciones1.operacion());
        
    }

}
