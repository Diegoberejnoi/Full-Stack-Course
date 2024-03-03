/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication101;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class JavaApplication101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
        programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
        después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
        salir, se mostrará todos los perros guardados en el ArrayList.*/
        ArrayList<String> razas=new ArrayList();
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        String op;
        
        do{
            System.out.println("Ingrese una raza de perro");
            String raza=in.next();
            razas.add(raza);
            
            //validacion de opcion correcta
            do{
               System.out.println("Desea seguir agregando razas a la lista?"+
                    "\nsi/no");
            op=in.next();
            
                if (!(op.equals("si")||op.equals("no"))) {
                    System.out.println("Opción invalida");                    
                }
            
            }while(!(op.equals("si")||op.equals("no")));
            
        }while(op.equals("si"));
        
        //imprimir por pantalla usando un bucle
        //for (int i = 0; i < razas.size(); i++) {
        //    System.out.println(razas.get(i));
        //}
        
        //imprimir por pantalla usando el metodo toString del ArrayList
        System.out.println(razas.toString());
        
        /*
        Continuando el ejercicio anterior, después de mostrar los perros, al usuario 
        se le pedirá
        un perro y se recorrerá la lista con un Iterator, se buscará el perro en 
        la lista. Si el perro
        está en la lista, se eliminará el perro que ingresó el usuario y se 
        mostrará la lista
        ordenada. Si el perro no se encuentra en la lista, se le informará al 
        usuario y se mostrará
        la lista ordenada.
        */
        System.out.println("Ingrese una raza que desee eliminar");
        String razaEliminar=in.next();
        Iterator<String> each=razas.iterator();
        boolean encontrado=false;
        
        while(each.hasNext()){
            if(each.next().equals(razaEliminar)){
                each.remove();
                encontrado=true;
            }            
        }
        
        Collections.sort(razas);
        if (!encontrado) {
            System.out.println("La raza de perros ingresada no se encuentra en la lista");
        }
        System.out.println(razas.toString());
        
    }
    
}
