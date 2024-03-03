/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Juego;
import entidades.Jugador;
import entidades.Revolver;
import java.util.ArrayList;

/**
 *llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 * @author Carlos Ezequiel Diaz
 */
public class JuegoServicio {
    
    Juego j = new Juego ();
    
    public void llenarJuego (ArrayList<Jugador>jugadores, Revolver r){
        
        j.setListaJugadores(jugadores);
        RevolverServicio rs = new RevolverServicio(r);
        rs.llenarRevolver();
        j.setRevolver(r);
    }
    
    public Jugador ronda (){
        JugadorServicio js = new JugadorServicio();
        
        ArrayList<Jugador>jugadores = j.getListaJugadores();
        boolean mojado = false;
        
        
        
        
        do {
            
        for (Jugador aux : jugadores) {
            
            js.setJ(aux);
            mojado = js.disparo(j.getRevolver());
            
            
            
            if (mojado) {
                
                return aux;
            } else {
                
                System.out.println("El jugador "+aux.getNombre()+ " no se ha mojado: ");
                System.out.println("Pasa al siguiente jugador");
                System.out.println("-------------------------------------");
            }
                        
                       
        }
                    
        } while (!mojado);
        
        
        return new Jugador();
    }
    
}
