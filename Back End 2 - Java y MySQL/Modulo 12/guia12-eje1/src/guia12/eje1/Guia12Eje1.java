/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12.eje1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author Diego
 */
public class Guia12Eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal perro1 = new Perro("Stich","Carnivoro",15,"Doberman");
        Animal perro2=new Perro("Teddy","Croquetas",10,"Chihuahua");
        Animal gato1=new Gato("Pelusa","Galletas",15,"Siames");
        Animal caballo=new Caballo("Spark","Pasto",25,"Fino");
        
        perro1.alimentacion();
        perro2.alimentacion();
        gato1.alimentacion();
        caballo.alimentacion();
    }
    
}
