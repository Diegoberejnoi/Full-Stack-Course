/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class CantanteServicio {
     /*
        Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes
        famosos y tendrá como atributos el nombre y discoConMasVentas. Se debe,
        además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 
        objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los 
        nombres de cada cantante y su disco con más ventas por pantalla. Una vez 
        agregado los 5, en otro bucle, crear un menú que le de la opción al 
        usuario de agregar un cantante más, mostrar todos los cantantes, 
        eliminar un cantante que el usuario elija o de salir del programa. 
        Al final se deberá mostrar la lista con todos los cambios.  
        */
    ArrayList<CantanteFamoso> listaCantantes = new ArrayList();
    Scanner in = new Scanner(System.in).useDelimiter("\n");
    
    public CantanteFamoso crearCantante(){
        System.out.println("Ingrese el nombre del cantante");
        String nombre = in.next();
        System.out.println("Ingrese su disco más vendido");
        String disco=in.next();        
        return new CantanteFamoso(nombre,disco);
    }
    
    public void agregarCantantes(){
        String op="s";
        do{
            listaCantantes.add(crearCantante());
            System.out.println("Desea seguir agregando cantantes a la lista? s/n");
            op=in.next();
        } while (op.equalsIgnoreCase("s"));        
    }
    
    public void agregar5Cantantes(){
        listaCantantes.add(new CantanteFamoso("Aluminio","Metal"));
        listaCantantes.add(new CantanteFamoso("Gallina","Animales 3.0"));
        listaCantantes.add(new CantanteFamoso("Illich","Coleccion de Pavadas 2"));
        listaCantantes.add(new CantanteFamoso("Carlos","Impuestos"));
        listaCantantes.add(new CantanteFamoso("Diego","Los pandas deberian haberse extinguido"));
    }
    public void mostrarLista(){
        for (CantanteFamoso aux : listaCantantes) {
            System.out.println(aux.toString());
        }
    }
    
    public void eliminarCantante(){
        System.out.println("Cual cantante desea eliminar?");
        String nombre = in.next();
        boolean encontrado=false;
        for (int i = 0; i < listaCantantes.size(); i++) {
           if(listaCantantes.get(i).getNombre().equalsIgnoreCase(nombre)){
               listaCantantes.remove(i);
               encontrado=true;
           }
        }
        
        if (encontrado) {
            System.out.println("Cantante "+ nombre +" eliminado de la lista");
        }else{
            System.out.println("El cantante " + nombre + " no se encuentra en la lista");
        }
    }
    /*
    Collections.sort(listaPelicula, (p1, p2) -> Double.compare(p2.getDuracion(),
    p1.getDuracion()));
    */
    public void menu(){
        int op=0;
        do {
            System.out.println("-----------");
            System.out.println("Menu"
                    + "\n1.Agregar Cantantes"
                    + "\n2.Agregar cinco Cantantes"
                    + "\n3.Eliminar un Cantante"
                    + "\n4.Mostrar Cantantes de la Lista"
                    + "\n5.Salir");
            System.out.println("-----------");
            op=in.nextInt();
            in.nextLine();
            
            switch(op){
                case 1:
                    agregarCantantes();
                    break;
                case 2:
                    agregar5Cantantes();
                    System.out.println("Se han agregado los 5 Cantantes");
                    break;
                case 3:
                    eliminarCantante();
                    break;
                case 4:
                    mostrarLista();
                    break;
                case 5:
                    System.out.println("Muchas gracias por usar este programa");
                    break;
                default:
                    System.out.println("Opcion ingresada incorrecta");
                            
            }
            
        } while (op!=5);
        
    }
    
}
