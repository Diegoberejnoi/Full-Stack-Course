/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje3;

import Service.ArregloService;

/**
 *
 * @author Diego
 */
public class Eje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double vectorA[]= new double[50];
        double vectorB[]= new double[20];
        ArregloService service=new ArregloService();
        
        service.inicializarA(vectorA);
        System.out.print("Vector A:");
        service.mostrar(vectorA);
        service.ordenar(vectorA);
        service.inicializarB(vectorB,vectorA);
        System.out.print("Vector A:");
        service.mostrar(vectorA);
        System.out.print("Vector B:");
        service.mostrar(vectorB);
        
    }
    
}
