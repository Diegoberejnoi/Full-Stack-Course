/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11.ejercicio2;

import entidades.Jugador;
import entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.JuegoServicio;

/**
 *
 * @author Carlos Ezequiel Diaz
 */
public class Guia11Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JuegoServicio js = new JuegoServicio ();
        Scanner leer = new Scanner (System.in);
        System.out.print("Ingrese la cantidad de jugadores: ");
        ArrayList <Jugador> ListaJugadores = new ArrayList();
        
        int cant = leer.nextInt();
        
        if (cant>6){
          
            System.out.println("La cantidad maxima de jugadores es seis. Se tomara esa cantidad.");
            cant=6;
        } else if (cant==0) {
            
            System.out.println("la cantidad minima es uno. Se toma esa cantidad.");
            cant=1;
        }

        for (int i = 0; i < cant; i++) {
            
            Jugador j = new Jugador (i+1,"Jugador "+(i+1), false);
            ListaJugadores.add(j);
        }
        
        js.llenarJuego(ListaJugadores, new Revolver ());
        
        System.out.println("El jugador que se ha \"mojado\" es: "+ js.ronda().getNombre());
    }
    
}
