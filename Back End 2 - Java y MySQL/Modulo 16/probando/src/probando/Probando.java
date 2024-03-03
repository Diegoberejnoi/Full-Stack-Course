/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package probando;

import Persona.Persona;

/**
 *
 * @author Diego
 */
public class Probando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p1 = new Persona();
        String nombre=null;
        
        try {
            if(!nombre.equals(null)){
                p1.setNombre(nombre);
            }
        } catch (Exception e) {
            System.out.println("El nombre no puede ser nul");
        }
        
        
    }
    
}
