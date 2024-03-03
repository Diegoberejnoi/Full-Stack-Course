/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg36.ejercicio.pkg5;

import servicios.paisesServicio;

/**
 *
 * @author Carlos Ezequiel Diaz
 */
public class Encuentro36Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        paisesServicio ps = new paisesServicio();
        ps.crearPais();
        ps.MostrarListaOrdenada();
        ps.eliminarPais();
        
    }
    
}
