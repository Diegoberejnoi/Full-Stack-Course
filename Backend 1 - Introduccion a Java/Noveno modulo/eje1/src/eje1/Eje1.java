/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1;

import Entidades.Cadena;
import Servicio.CadenaServicio;

/**
 *
 * @author Diego
 */
public class Eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cadena oracion = new Cadena("Frase de prueba");
        CadenaServicio servicio = new CadenaServicio();
        
        servicio.mostrarVocales(oracion);
        servicio.invertirFrase(oracion);
        servicio.vecesRepetido(oracion, "e");
        servicio.vecesRepetido(oracion, "j");
        servicio.compararLongitud(oracion, "Frase chica");
        servicio.compararLongitud(oracion, "Frase chica mas larga que la otra");
        servicio.compararLongitud(oracion, "Frase de prueba");
        servicio.unirFrase(oracion, "unir");
        servicio.reemplazar(oracion, "P");
        System.out.println(servicio.contiene(oracion, "e"));
        System.out.println(servicio.contiene(oracion, "j"));
        
    }
    
}
