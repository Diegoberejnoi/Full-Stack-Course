/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia11.eje2extra.cine;

import Servicio.CineServicio;
import guia11.eje2extra.cine.Entidades.Cine;

/**
 *
 * @author Diego
 */
public class Guia11Eje2ExtraCine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CineServicio cs = new CineServicio();
        Cine cine = new Cine();
        cs.iniciarSala(cine);
        cs.simulacion(cine);
        cs.mostrarSala(cine);
    }
    
}
