/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje5;

import Entidades.Persona;
import Service.PersonaService;

/**
 *
 * @author Diego
 */
public class Eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonaService sv = new PersonaService();
        Persona p1 = sv.crearPersona();
        
        System.out.println("La persona es menor de edad? "+sv.menorQue(p1, 18));
        sv.mostrarPersona(p1);
    }
    
}
