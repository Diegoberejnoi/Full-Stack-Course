/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.ParDeNumeros;

/**
 *
 * @author Diego
 */
public class ParDeNumeroServicio {
    
    public static void mostrarValores(ParDeNumeros numeros){
        
        System.out.println("Numero 1 = " + numeros.getNumero1() +
                "\nNumero 2 = " + numeros.getNumero2());
        
    }
    
    public static double devolverMayor(ParDeNumeros numeros){
        double mayor=numeros.getNumero1();
        if (mayor<numeros.getNumero2()){
            mayor=numeros.getNumero2();
        }
        return mayor;
    }
    public static double devolverMenor(ParDeNumeros numeros){
        double menor=numeros.getNumero1();
        if (menor>numeros.getNumero2()){
            menor=numeros.getNumero2();
        }
        return menor;
    }
    public static double calcularPotencia(ParDeNumeros numeros){
        double mayor=Math.round((float) devolverMayor(numeros));
        double menor=Math.round((float) devolverMenor(numeros));
        return Math.pow(mayor, menor);
    }
    public static double calcularRaiz(ParDeNumeros numeros){
        double menor=Math.abs(devolverMenor(numeros));
        return Math.sqrt(menor);
    }
    
}
