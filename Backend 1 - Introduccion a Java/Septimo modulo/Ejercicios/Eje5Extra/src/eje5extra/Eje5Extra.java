/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje5extra;

import Entidades.Empleado;

/**
 *
 * @author Diego
 */
public class Eje5Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado emp=new Empleado("Juan", 29, 1000);
        Empleado emp1=new Empleado("Pedro", 50, 1000);
        
        emp.calcularAumento();
        emp1.calcularAumento();
        
    }
    
}
