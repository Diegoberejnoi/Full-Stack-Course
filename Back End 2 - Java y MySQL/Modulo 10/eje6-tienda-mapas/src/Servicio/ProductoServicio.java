/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ProductoServicio {
    /*
    Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
    productos que venderemos y el precio que tendrán. Además, se necesita que la
    aplicación cuente con las funciones básicas.
    Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
    eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
    Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
    Realizar un menú para lograr todas las acciones previamente mencionadas.
    */
    HashMap<String, Double> listaProductos=new HashMap();
    Scanner in = new Scanner(System.in).useDelimiter("\n");
    
    public void agregarProducto(){
        String op = "", producto;
        Double precio;
        do {
            System.out.println("Ingrese el producto que desea agregar a la lista y su precio");
            System.out.print("Nombre: ");
            producto = in.next();
            System.out.println("");
            System.out.print("Precio: ");
            precio=in.nextDouble();
            in.nextLine();
            System.out.println("");
            listaProductos.put(producto, precio);
            
            System.out.println("Desea seguir agregando productos? s/n");
            op=in.next();

        } while (op.equalsIgnoreCase("s"));

    }
    
    public void modificarPrecio() {        
        System.out.println("Cual producto desea modificar su precio?");
        String productoMod = in.next();
        if (listaProductos.containsKey(productoMod)) {
            System.out.print("Ingrese el nuevo precio: ");
            listaProductos.replace(productoMod, in.nextDouble());
            System.out.println("");
            in.nextLine();
        } else {
            System.out.println("El producto que desea modificar no se encuentra en la lista");
        }

    }

    public void eliminarProducto() {
        System.out.println("Cual producto desea eliminar de la lista?");
        String productoEliminar = in.next();
        if (listaProductos.containsKey(productoEliminar)) {
            listaProductos.remove(productoEliminar);
            System.out.println("El producto " + productoEliminar + " ha sido eliminado de la lista");
        } else {
            System.out.println("El producto que desea eliminar no se encuentró en la lista");
        }

    }

    public void mostrarProductos() {
        System.out.println("Listado de Productos");
        for (Map.Entry<String, Double> entry : listaProductos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("Producto: " + key + " $" + value);

        }
    }

    public void menu(){
        int menu;
        boolean salir=true;
        do{
            System.out.println("-------");
            System.out.println("Menú"
                    + "\n1.Agregar Productos"
                    + "\n2.Modificar Precio"
                    + "\n3.Eliminar Producto"
                    + "\n4.Mostrar Listado de Productos"
                    + "\n5.Salir");
            System.out.println("-------");
            menu=in.nextInt();
            in.nextLine();
            
            switch(menu){
                case 1: 
                    agregarProducto();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestro programa");
                    salir=false;
                    break;
                default:
                    System.out.println("Opcion no valida, vuelva a intentarlo");
                
            }

        } while (salir);
        
       
    }
    
}
