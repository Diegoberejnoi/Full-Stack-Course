/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class CafeteraServicio {
    /*
    a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
    capacidad máxima.
   
    */
    
    Cafetera cafetera=new Cafetera();
    private Scanner in = new Scanner(System.in).useDelimiter("\n");
    
    private void llenarCafetera(Cafetera cafetera){
        
        cafetera.setCapacidadActual(cafetera.getCapacidadMaxima());
    }
    
    /* b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
    método recibe el tamaño de la taza y simula la acción de servir la
    taza con la capacidad indicada. Si la cantidad actual de café “no
    alcanza” para llenar la taza, se sirve lo que quede. El método le
    informará al usuario si se llenó o no la taza, y de no haberse llenado
    en cuanto quedó la taza.
    
    */
    
    private void servirTaza(Cafetera cafetera, int numeroTazas){
        System.out.println("Ingrese la capacidad de la/s taza/s");
        double capacidad = in.nextDouble();
        double cantidadCafe=(capacidad*(double)numeroTazas);
        
        if (cantidadCafe<=cafetera.getCapacidadActual()){
            
            System.out.println("Se han llenado " + numeroTazas 
            +" tazas");
            cafetera.setCapacidadActual(cafetera.getCapacidadActual()-cantidadCafe);
        } else {
            System.out.println("Se han llenado " + ((int)(Math.floor(cafetera.getCapacidadActual()/capacidad)))
            + "tazas completas y una taza con "
            + (cafetera.getCapacidadActual()-(Math.floor(cafetera.getCapacidadActual()/capacidad)*capacidad)));
            cafetera.setCapacidadActual(0);
        }
        
    }
    
    /*c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
    d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
    el método lo recibe y se añade a la cafetera la cantidad de café
    indicada.
    */
    
    private void vaciarCafetera(Cafetera cafetera){
        cafetera.setCapacidadActual(0);
    }
    
    private void agregarCafe(Cafetera cafetera, double cantidadCafe){
        if (cantidadCafe+cafetera.getCapacidadActual()<=cafetera.getCapacidadMaxima()){
        cafetera.setCapacidadActual((cafetera.getCapacidadActual()+cantidadCafe));
        } else{
            System.out.println("Se lleno la cafetera");
            cafetera.setCapacidadActual(cafetera.getCapacidadMaxima());
        }
    }
    
    public void menu(){
        int opcion;
        CafeteraServicio service = new CafeteraServicio();
        do{
        System.out.println("Que desea hacer?"
        +"\n1. Llenar cafetera"
        +"\n2. Servir cafe"
        +"\n3. Agregar cafe"
        +"\n4. vaciar cafetera"
        +"\n5. Salir");
        opcion=in.nextInt();
        
        switch(opcion){
            case 1:
                service.llenarCafetera(cafetera);
                break;
            case 2:
                System.out.println("Cuantas tazas desea servir?");
                service.servirTaza(cafetera, in.nextInt());
                break;
            case 3:
                System.out.println("Cuanto cafe desea agregar?");
                service.agregarCafe(cafetera, in.nextDouble());
                break;
            case 4:
                service.vaciarCafetera(cafetera);
                break;
            case 5:
                System.out.println("Gracias por usar esta cafetera");
                break;
            default:
                System.out.println("Opcion invalida");
        }
        
        }while(opcion!=5);
    }
    
    //Falta agregar un menu
}
