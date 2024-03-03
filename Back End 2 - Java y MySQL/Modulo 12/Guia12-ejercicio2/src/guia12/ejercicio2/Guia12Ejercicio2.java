/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12.ejercicio2;


import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Carlos Ezequiel Diaz
 */
public class Guia12Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Lavadora l1 = new Lavadora ();
        l1.crearLavadora();
        l1.precioFinalLavadora();
        System.out.println(l1);
        System.out.println("**********************");
        Televisor t1 = new Televisor ();
        t1.crearTelevisor();
        t1.precioFinalTelevisor();
        System.out.println(t1);*/
        
        
        /*Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
        para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
        */
        
        
        ArrayList<Electrodomestico> listaElectro=new ArrayList();
        
        Lavadora l1 = new Lavadora(10, 1000d, 50, "blanco", 'a');//precio=2800
        Lavadora l2 = new Lavadora(50, 1000d, 10, "negro", 'f');//1700
        
        Televisor t1 = new Televisor(50, true, 1000d, 20, "rojo", 'b');
        Televisor t2 = new Televisor(20, false, 1000d, 5, "gris", 'd');
       //t1 precio=3490
       //t2 precio=1600
        listaElectro.add(l1);
        listaElectro.add(l2);
        listaElectro.add(t1);
        listaElectro.add(t2);
        /*
        Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
        deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
        televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
        precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
        2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
        electrodomésticos, 2000 para lavadora y 5000 para televisor.
        */
        double precioTv=0d,precioLav=0d,precioElectro=0d;
        for (Electrodomestico aux : listaElectro) {
            aux.precioFinal();
            
            
            if(aux instanceof Televisor){
                precioTv+=aux.getPrecio(); //5090
            }
            
            if(aux instanceof Lavadora){
                precioLav+=aux.getPrecio(); //4500
            }
            
            precioElectro+=aux.getPrecio();//9590
            
        }
        
        System.out.println("Precio total de los televisores: $"+precioTv);
        System.out.println("Precio total de las lavadoras: $"+precioLav);
        System.out.println("Precio total de los electrodomesticos $"+precioElectro);
    }
    
    
}
