/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12.extra2;

import Entidades.Edificio;
import Entidades.EdificiodeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Guia12Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Edificio> listaEdificios=new ArrayList();
        /*
        Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
        dos polideportivos y dos edificios de oficinas. 
        */
        listaEdificios.add(new Polideportivo("PoliA", true, 10, 50, 20));
        listaEdificios.add(new Polideportivo("PoliB", false, 20, 50, 100));
        listaEdificios.add(new EdificiodeOficinas(10, 2, 20, 100, 10, 50));
        listaEdificios.add(new EdificiodeOficinas(20, 5, 5, 50, 20, 100));
    
    
        /*
        Luego, recorrer este array y ejecutar los
        métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
        superficie y el volumen de cada edificio.
        Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
        techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
        cantPersonas() y mostrar los resultados de cada edificio de oficinas.
        */
        int techados=0,abiertos=0;
        for (Edificio edificio : listaEdificios) {
            System.out.println("El edificio tiene una superficie de "+edificio.calcularSuperficie());
            System.out.println("El edificio tiene un volumen de "+edificio.calcularVolumen());
            
            if(edificio instanceof Polideportivo){
                if(((Polideportivo) edificio).isTipoInstalacion()){
                    techados++;
                }else{
                    abiertos++;
                }
                
            }
            
            if(edificio instanceof EdificiodeOficinas){
                ((EdificiodeOficinas) edificio).cantidadPersonas();
            }
            
        }
        
        System.out.println("La cantidad de polideportivos techados son "+techados);
        System.out.println("La cantidad de polideportivos abiertos son "+abiertos);
    
    
    }
}
