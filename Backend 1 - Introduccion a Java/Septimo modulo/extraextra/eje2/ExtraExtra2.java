/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra.extra2;

import Entidades.Tiempo;
import java.util.Scanner;

/**
 *
 * @author Carlos Ezequiel Diaz
 */
public class ExtraExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tiempo t1 = new Tiempo();
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Ingrese la hora: ");
        t1.setHora(leer.nextInt());
        System.out.println("");
        
        System.out.print("Ingrese los minutos: ");
        t1.setMin(leer.nextInt());
        System.out.println("");
        
        System.out.print("Ingrese los segundos: ");
        t1.setSeg(leer.nextInt());
        System.out.println("");
        
        t1.imprimirHoraCompleta();
    }
    
}
