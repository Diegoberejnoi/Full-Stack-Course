/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje4extra;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Eje4Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        Cuenta cue=new Cuenta();
        System.out.println("El saldo es " + cue.getSaldo());
        System.out.println("Cuanto desea retirar?");
        cue.retirarDinero(in.nextDouble());
        
    }
    
}
