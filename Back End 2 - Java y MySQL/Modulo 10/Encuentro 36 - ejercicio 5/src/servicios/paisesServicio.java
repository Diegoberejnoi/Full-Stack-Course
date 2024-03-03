/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Carlos Ezequiel Diaz
 */
public class paisesServicio {
    
    Scanner leer = new Scanner (System.in);
    Set <String> listaPaises = new HashSet();
    
    public void crearPais (){
        
        String op="";
        
        
        do{
            
            System.out.print("Ingrese el nombre de un país: ");
                      
            listaPaises.add(leer.nextLine());
            
            System.out.print("Desea seguir ingresando paises? (s/n): ");
            op = leer.nextLine();
            System.out.println("-------------------------------------");
            
        } while (op.equalsIgnoreCase("s"));
        
        System.out.println(listaPaises.toString());
        
    }
    
    public void MostrarListaOrdenada (){
        
        ArrayList <String> ListaP = new ArrayList (listaPaises);
        Collections.sort(ListaP);
        System.out.println(ListaP.toString());
        
    }
    
    public void eliminarPais () {
        System.out.println("");
        System.out.print("Ingrese el pais que desea eliminar: ");
        String eliminar = leer.nextLine();
        boolean encontrado = false;
        
        Iterator <String> it = listaPaises.iterator();
        
        /*while (it.hasNext())
         {
            
             if (it.next().equals(eliminar)){
                 
                 it.remove();
                 encontrado = true;
             }
             
        }*/
        
        for (String aux : listaPaises) {
            
            if (aux.equals(eliminar)){
                 
                 listaPaises.remove(aux);
                 encontrado = true;
             }
            
        }
        
        
        if (!encontrado) {
            
            System.out.println("El pais ingresado no se encuentra en el conjunto");
            
        } else {
            
            MostrarListaOrdenada();
        }
        
    }
    
}
