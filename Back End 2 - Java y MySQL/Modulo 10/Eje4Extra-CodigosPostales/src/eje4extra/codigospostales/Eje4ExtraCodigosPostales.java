/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje4extra.codigospostales;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Eje4ExtraCodigosPostales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Almacena en un HashMap los códigos postales de 10 ciudades a elección de
        esta página: https://mapanet.eu/index.htm. 
        Nota: Poner el código postal sin la letra, solo el numero. 
        • Pedirle al usuario que ingrese 10 códigos postales y sus ciudades. 
        • Muestra por pantalla los datos introducidos 
        • Pide un código postal y muestra la ciudad asociada si existe sino 
        avisa al usuario. 
        • Muestra por pantalla los datos 
        • Agregar una ciudad con su código postal correspondiente más al HashMap. 
        • Elimina 3 ciudades existentes dentro del HashMap
        */
        HashMap<Integer,String> codigosPostales=new HashMap();
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        
        String[] ciudades={"Salta","Cordoba","Rio Cuarto","Mendoza","Agua Chica","Iguazu","Bariloche",
        "Neuquen","Usuahia","Belgrano"};
        Integer[] codigos={4400,5000,5800,5500,4640,3370,8400,8353,9410,1428};
        
         for(int i=0;i<10;i++){
             codigosPostales.put(codigos[i],ciudades[i]);
         }
        
         menu(codigosPostales);
        
    }
    public static void ingresar10codigos(HashMap<Integer,String> codigosPostales){
        Scanner in = new Scanner(System.in).useDelimiter("\n");
           for (int i = 0; i < 10; i++) {
               System.out.print("Ingrese el "+(i+1) +"° codigo: ");
               int codigo=in.nextInt();
               in.nextLine();
               System.out.print("Ingrese la ciudad");
               String ciudad=in.next();
               codigosPostales.put(codigo,ciudad);
        }
    }    
    
    public static void buscarciudad(HashMap<Integer,String> codigosPostales){
        System.out.println("Ingrese el codigo postal a buscar");
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        int codigo=in.nextInt();
        in.nextLine();
        if(codigosPostales.containsKey(codigo)){
            System.out.println("La ciudad a la que pertenece es "+codigosPostales.get(codigo));
        }else{
            System.out.println("El codigo postal ingresado no pertenece a ninguna ciudad cargada");
        }
        
    }
    
    public static void mostrarLista(HashMap<Integer,String> codigosPostales){
        System.out.println("-----Listado-----");
        for (Map.Entry<Integer, String> entry : codigosPostales.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("CP: "+key+" Ciudad: "+ value);
            
        }
        
        System.out.println("-----------------");
    }
    
    public static void ingresar(HashMap<Integer, String> codigosPostales) {
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el codigo");
        int codigo = in.nextInt();
        in.nextLine();
        System.out.print("Ingrese la ciudad");
        String ciudad = in.next();
        codigosPostales.put(codigo, ciudad);
    }
    
    public static void eliminar3(HashMap<Integer, String> codigosPostales){
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        int codigo;
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el codigo postal de la "+ (i+1) +"° ciudad que desea eliminar");
            codigo=in.nextInt();
            in.nextLine();
            if (!codigosPostales.containsKey(codigo)) {
                System.out.println("La ciudad que desea eliminar no se encuentra en el listado");
            }
            codigosPostales.remove(codigo);
        }
    }
    
    public static void menu(HashMap<Integer, String> codigosPostales){
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        int op=0;
        do{
            System.out.println("-----Menu-----");
            System.out.println("1.Agregar 10 ciudades"
                    + "\n2.Mostrar ciudad asociada a un codigo postal"
                    + "\n3.Mostrar lista de ciudades"
                    + "\n4.Ingresar 1 ciudad"
                    + "\n5.Eliminar 3 ciudades de la lista"
                    + "\n6.Salir");
            System.out.println("--------------");
            op=in.nextInt();
            in.nextLine();
            
            switch(op){
                case 1:
                    ingresar10codigos(codigosPostales);
                    break;
                case 2:
                    buscarciudad(codigosPostales);
                    break;
                case 3:
                    mostrarLista(codigosPostales);
                    break;
                case 4:
                    ingresar(codigosPostales);
                    break;
                case 5:
                    eliminar3(codigosPostales);
                    break;
                case 6:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    
            }
            
        }while(op!=6);
    }
    /*
    Muestra por pantalla los datos introducidos 
     Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
        • Pide un código postal y muestra la ciudad asociada si existe sino 
        avisa al usuario. 
        • Muestra por pantalla los datos 
        • Agregar una ciudad con su código postal correspondiente más al HashMap. 
        • Elimina 3 ciudades existentes dentro del HashMap
    */
    
}



