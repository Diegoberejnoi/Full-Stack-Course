/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.Scanner;
import servicios.FabricanteServicio;
import servicios.ProductoServicio;

/**
 *
 * @author Carlos Ezequiel Diaz
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ProductoServicio ps = new ProductoServicio();
        FabricanteServicio fs = new FabricanteServicio();
        Scanner leer = new Scanner(System.in);

        int op = 0;
        do {
            System.out.println("MENU");

            System.out.println("1- Listar los nombres de todos los productos");
            System.out.println("2- Listar nombres y precios de todos los productos");
            System.out.println("3- Listar aquellos productos que su precio esté entre 120 y 202");
            System.out.println("4- Buscar y listar todos los Portátiles de la tabla producto");
            System.out.println("5- Listar el nombre y el precio del producto más barato");
            System.out.println("6- Ingresar producto");
            System.out.println("7- Ingresar fabricante");
            System.out.println("8- Modificar producto");
            System.out.println("9- Modificar fabricante");
            System.out.println("10- Eliminar producto");
            System.out.println("11- Eliminar fabricante");
            System.out.println("12- Mostrar fabricantes");
            System.out.println("13- Salir");
            System.out.print("Ingrese una opción: ");

            op = leer.nextInt();
            leer.nextLine();

            switch (op) {

                case 1:
                    ps.mostrarproductos();
                    break;

                case 2:
                    ps.mostrarproductosconPrecio();
                    break;
                case 3:
                    ps.mostrarconPrecio120y202();
                    break;
                case 4:
                    ps.mostrarPortatiles();
                    break;
                case 5:
                    ps.mostrarproductomasbarato();
                    break;
                case 6:
                    ps.insertarProducto();
                    break;
                case 7:
                    fs.ingresarFabricante();
                    break;
                case 8:
                    ps.modificarProducto();
                    break;
                case 9:
                    fs.modificarFabricante();
                    break;
                case 10:
                    ps.eliminarProducto();
                    break;
                case 11:
                    fs.eliminarFabricante();
                    break;
                case 12:
                    fs.mostrarFabricantes();
                    break;
                case 13:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Opción no valida");

            }

        } while (op != 13);

    }

}
