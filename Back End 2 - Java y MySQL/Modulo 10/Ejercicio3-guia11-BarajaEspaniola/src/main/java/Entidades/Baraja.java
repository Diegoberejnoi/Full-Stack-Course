package Entidades;

import java.util.ArrayList;
import java.util.Objects;

public class Baraja {

    private ArrayList<Carta> baraja;

    public Baraja() {
        this.baraja=new ArrayList();
    }

    public Baraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.baraja);
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
        final Baraja other = (Baraja) obj;
        return Objects.equals(this.baraja, other.baraja);
    }

    @Override
    public String toString() {
        String string="";
        int cont=0;
        
        for (Carta carta : baraja) {
            string+=carta+" ";
            cont++;
            if(cont%4==0){
              string+="\n";
            }           
        }
        
        return string;
    }
    
    
    
}
