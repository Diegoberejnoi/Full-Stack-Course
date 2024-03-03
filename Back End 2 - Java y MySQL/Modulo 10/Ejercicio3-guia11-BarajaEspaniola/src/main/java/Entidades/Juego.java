package Entidades;

import java.util.ArrayList;
import java.util.Objects;

public class Juego {

    private Baraja mazo;
    private Baraja monton;

    public Juego() {
       
        ArrayList<Carta> baraja = new ArrayList();
        
        for (int i = 0; i < 12; i++) {            
            if ((i+1)!=8 && (i+1)!=9) {
                
                baraja.add(new Carta(i + 1, "Espada"));
                baraja.add(new Carta(i + 1, "Basto"));
                baraja.add(new Carta(i + 1, "Oro"));
                baraja.add(new Carta(i + 1, "Copa"));
            }
        }
        
         this.mazo=new Baraja(baraja);
         this.monton=new Baraja();
        
    }

    public Juego(Baraja mazo, Baraja monton) {
        this.mazo = mazo;
        this.monton = monton;
    }

    public Baraja getMazo() {
        return mazo;
    }

    public void setMazo(Baraja mazo) {
        this.mazo = mazo;
    }

    public Baraja getMonton() {
        return monton;
    }

    public void setMonton(Baraja monton) {
        this.monton = monton;
    }

    @Override
    public String toString() {
        return "Juego{" + "mazo=" + mazo + ", monton=" + monton + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.mazo);
        hash = 71 * hash + Objects.hashCode(this.monton);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Juego other = (Juego) obj;
        if (!Objects.equals(this.mazo, other.mazo)) {
            return false;
        }
        return Objects.equals(this.monton, other.monton);
    }
    
    
    
    
}
