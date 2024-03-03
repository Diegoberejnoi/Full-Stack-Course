/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12.extra1;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoAMotor;
import Entidades.Velero;
import Entidades.YateLujoso;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Diego
 */
public class Guia12Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Barco> listadoBarcos= new ArrayList();
        listadoBarcos.add(new Velero(5, 1, 10, new Date())); //9*105 945
        listadoBarcos.add(new BarcoAMotor(10, 1, 10, new Date())); //9*110 990
        listadoBarcos.add(new YateLujoso(50, 3, 1, 10,new Date())); //9*153 1377
        listadoBarcos.add(new Barco(1, 10, new Date()));//9*100 900
        ArrayList<Alquiler> listadoAlquileres=new ArrayList();
        
        for (Barco barco : listadoBarcos) {
            listadoAlquileres.add(new Alquiler(new Date(2023-1900,05,01), new Date(2023-1900,05,10), barco));
        }
        
        for (Alquiler alquiler : listadoAlquileres) {
            System.out.println("El coste del alquiler es "+ alquiler.getCoste());
        }    
       
        
        
    }
    
}
