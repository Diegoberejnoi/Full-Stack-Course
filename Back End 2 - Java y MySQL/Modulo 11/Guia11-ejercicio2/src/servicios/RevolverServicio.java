/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Revolver;

/**
 *• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
* 
• mojar(): devuelve true si la posición del agua coincide con la posición actual
* 
• siguienteChorro(): cambia a la siguiente posición del tambor
* 
• toString(): muestra información del revolver (posición actual y donde está el agua)
* 
 * @author Carlos Ezequiel Diaz
 */
public class RevolverServicio {
    
    Revolver r;

    public RevolverServicio(Revolver r) {
        this.r = r;
    }
    
    
    
    public void llenarRevolver(){
        
        r.setPosicionActual((int) (Math.random()*6)+1);
        r.setPosicionAgua((int) (Math.random()*6)+1);
        
    }
 
    public boolean mojar(){
        
        boolean resultado = false;
        
        if (r.getPosicionActual()==r.getPosicionAgua()){
            
            resultado = true;
        }
        
        return resultado;
        
    }
    
    public void siguienteChorro(){
        
        if (r.getPosicionActual()==6){
            
            r.setPosicionActual(1);
        } else {
            
            r.setPosicionActual(r.getPosicionActual()+1);
        }
        
    }
    
    public void mostrar(){
        
        System.out.println(r.toString());
    }
}
