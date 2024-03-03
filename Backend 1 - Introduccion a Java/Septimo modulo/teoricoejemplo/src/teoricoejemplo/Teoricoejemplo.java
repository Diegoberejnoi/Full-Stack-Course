/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoricoejemplo;

import java.util.Scanner;
import teoricoejemplo.entidades.Mascota;

/**
 *
 * @author Diego
 */
public class Teoricoejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        
        Mascota m1 = new Mascota("fernando", in.next(), "Perro");
        
       
        
        System.out.println(m1.apodo + " " + m1.nombre + " " + m1.edad + " " + m1.tipo);
    }
    
}
