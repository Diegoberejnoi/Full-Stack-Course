/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1extra;

import Entidades.Cancin;

/**
 *
 * @author Diego
 */
public class Eje1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancin cancin1 = new Cancin();
        cancin1.setAutor("Charly Garcia");
        cancin1.setTitulo("Demoliendo Hoteles");
        System.out.println("titulo: " + cancin1.getTitulo());
        System.out.println("Autor: " + cancin1.getAutor());
        Cancin cancin2 = new Cancin("Fito Paez", " Giros");
        System.out.println("titulo: " + cancin2.getTitulo());
        System.out.println("Autor: " + cancin2.getAutor());

    }

}
    

