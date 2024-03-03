/*

• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package entidades;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private Pistola pistola;
    
    public void llenarJuego(ArrayList<Jugador>jugadores, Pistola r){
        this.jugadores = jugadores;
        this.pistola = r;
    }
    
    public boolean ronda(){
        int cont = 0;
        do {
            if (cont == jugadores.size()){
                cont = 0;
            }
            jugadores.get(cont).disparo(pistola);
            if (jugadores.get(cont).isMojado()){
                System.out.println("Jugador: " + jugadores.get(cont).getNombre() + " ELIMINADO");
                jugadores.remove(cont);
                return true;
            }
            cont++;
        } while (true);
    }
}
