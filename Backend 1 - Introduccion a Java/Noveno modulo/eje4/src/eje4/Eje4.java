/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje4;

import Servicio.FechaService;
import java.util.Date;

/**
 *
 * @author Diego
 */
public class Eje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FechaService servicio= new FechaService();
        Date fecha = servicio.fechaNacimiento();
        Date fechaActual = servicio.fechaActual();
        System.out.println(fecha.toString());
        System.out.println(fechaActual.toString());
        
        System.out.println("El usuario tiene " + servicio.diferencia(fecha,fechaActual));
        
        
    }
    
    
}
