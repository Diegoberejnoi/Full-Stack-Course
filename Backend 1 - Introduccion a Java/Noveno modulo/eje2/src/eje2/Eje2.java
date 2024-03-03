/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje2;

import Entidades.ParDeNumeros;
import Servicio.ParDeNumeroServicio;


/**
 *
 * @author Diego
 */
public class Eje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumeros numeros = new ParDeNumeros();
        
        
        ParDeNumeroServicio.mostrarValores(numeros);
        System.out.println("El mayor es = "+ ParDeNumeroServicio.devolverMayor(numeros));
        System.out.println("El menor es = "+ ParDeNumeroServicio.devolverMenor(numeros));
        System.out.println("El mayor^menor es = "+ ParDeNumeroServicio.calcularPotencia(numeros));
        System.out.println("El raiz del menor es = "+ ParDeNumeroServicio.calcularRaiz(numeros));
        
    }
    
}
