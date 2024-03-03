/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11.eje2extra.cine.Entidades;

/**
 *
 * @author Diego
 */
public class Asiento {
    private boolean ocupado;

    public Asiento(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Asiento() {
        ocupado=false;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    
}
