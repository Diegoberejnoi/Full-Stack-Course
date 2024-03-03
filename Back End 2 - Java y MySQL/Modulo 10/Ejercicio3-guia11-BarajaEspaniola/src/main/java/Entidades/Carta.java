package Entidades;

import java.util.Objects;

public class Carta {

    private Integer valor;
    private String palo;

    public Carta() {
    }

    public Carta(Integer valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return " ["+ valor + " de " + palo+ "]";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.valor);
        hash = 59 * hash + Objects.hashCode(this.palo);
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
        final Carta other = (Carta) obj;
        if (!Objects.equals(this.palo, other.palo)) {
            return false;
        }
        return Objects.equals(this.valor, other.valor);
    }
    
    
}
