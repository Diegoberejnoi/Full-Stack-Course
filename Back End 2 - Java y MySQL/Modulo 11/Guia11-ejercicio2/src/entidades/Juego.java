package entidades;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> ListaJugadores;
    private Revolver revolver;
    
    //Constructores

    public Juego(ArrayList<Jugador> ListaJugadores, Revolver revolver) {
        this.ListaJugadores = ListaJugadores;
        this.revolver = revolver;
    }

    public Juego() {
        ListaJugadores = new ArrayList();
        
    }

    public ArrayList<Jugador> getListaJugadores() {
        return ListaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> ListaJugadores) {
        this.ListaJugadores = ListaJugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }
    
    
}
