/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Jugador;
import entidades.Revolver;

/**
 *disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
* 
 * @author Carlos Ezequiel Diaz
 */
public class JugadorServicio {
    
    Jugador j = new Jugador();

    public Jugador getJ() {
        return j;
    }

    public void setJ(Jugador j) {
        this.j = j;
    }
    
    
    
    public boolean disparo (Revolver r){
        
        RevolverServicio rs = new RevolverServicio(r);
        boolean mojado = rs.mojar();
        rs.siguienteChorro();
        
        j.setMojado(mojado);
        
        return mojado;
    }
    
        
}
