/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje2extra;

import Entidades.Ahorcado;
import Service.AhorcadoService;

/**
 *
 * @author Diego
 */
public class Eje2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AhorcadoService sv =new AhorcadoService();
       
        sv.juego();
        
    }
    
}
