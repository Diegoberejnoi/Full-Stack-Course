/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1extra;

import Entidades.Raices;
import Servicio.RaicesServicio;
import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Eje1Extra {

    /**
     * @param args the command line arguments ((b^2)-(4*a*c)))
     */
    public static void main(String[] args) {
        // Objetos Raices de prueba
        Raices primera = new Raices(1,1,1);//x^2+x+1 - no tiene raices
        Raices segunda = new Raices(1,2,0);//x^2+2*x - raiz1 = 2 y raiz2=-2 
        Raices tercera = new Raices(1,2,1);//x^2+2*x+1 - raiz=0
        RaicesServicio service= new RaicesServicio();
        
        ArrayList<Raices> lista = new ArrayList<>(); //persona.size()=0
        lista.add(primera); //persona.size()=1 Objetos dentro persona1
        lista.add(segunda);//persona.size()=2 Objetos dentro persona1 y persona2
        lista.add(tercera);//persona.size()=3 Objetos dentro persona1, persona2 y persona3
      
        //lista.lastIndexof(x) devuelve la ultima posicion del objeto dentro de la lista
        //como no se repiten dentro del ArrayList termina devolviendo la unica posicion que tienen
        
        for (Raices x : lista) { //for mejorado
            System.out.println("El discriminante de la " + (lista.lastIndexOf(x)+1) 
                    + "° funcion es = " + service.getDiscriminante(x));
        }
        for (Raices x : lista) { 
            System.out.println("Tiene Raices de la " + (lista.lastIndexOf(x)+1) 
                    + "° funcion  es = " + service.tieneRaices(x));
        }
        for (Raices x : lista) { 
            System.out.println("Tiene Raiz de la " + (lista.lastIndexOf(x)+1) 
                    + "° funcion es = " + service.tieneRaiz(x));
        }
        for (Raices x : lista) { 
            System.out.print("La " + (lista.lastIndexOf(x)+1) + "° funcion ");
            service.obtenerRaices(x);
            System.out.println("");
        }
        for (Raices x : lista) { 
            System.out.print("La " + (lista.lastIndexOf(x)+1) + "° funcion ");
            service.obtenerRaiz(x);
            System.out.println("");
        }
        for (Raices x : lista) {
            System.out.print("La " + (lista.lastIndexOf(x)+1) + "° funcion ");
            service.calcular(x);
            System.out.println("");
        }
        
        
    }
    
}
