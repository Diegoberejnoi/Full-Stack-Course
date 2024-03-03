/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Fabricante;
import entidades.Producto;
import java.util.Scanner;
import persistencia.FabricanteDAO;
import persistencia.ProductoDAO;

/**
 *
 * @author Carlos Ezequiel Diaz
 */
public class ProductoServicio {

    private ProductoDAO pd;
    private FabricanteDAO fd;

    public ProductoServicio() {
        this.pd = new ProductoDAO();
        this.fd = new FabricanteDAO();
    }

    public void mostrarproductos() {

        try {

            pd.mostrarTodoslosProductos();

        } catch (Exception e) {

            System.out.println("Hubo un error desconocido sql");

        }
    }

    public void mostrarproductosconPrecio() {

        try {

            pd.mostrarNombreYPrecioDelosProductos();

        } catch (Exception e) {

            System.out.println("Hubo un error desconocido sql");

        }
    }

    public void mostrarconPrecio120y202() {

        try {

            pd.mostrarProductosEntre120y202();

        } catch (Exception e) {

            System.out.println("Hubo un error desconocido sql");

        }
    }

    public void mostrarPortatiles() {

        try {

            pd.mostrarPortatiles();

        } catch (Exception e) {

            System.out.println("Hubo un error desconocido sql");

        }
    }

    public void mostrarproductomasbarato() {

        try {

            pd.productomasBarato();

        } catch (Exception e) {

            System.out.println("Hubo un error desconocido sql");

        }
    }

    public void insertarProducto() {

        try {
            Producto producto = crearProducto(); 
            pd.ingresarProducto(producto);

        } catch (Exception e) {

            System.out.println("Hubo un error desconocido sql al insertar el producto");

        }
    }

    public Producto crearProducto() {
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        Producto producto = null;
        try {
            producto= new Producto();
            System.out.println("Ingrese el nombre del producto");
            String nombre = in.nextLine();
            System.out.println("Ingrese el precio");
            double precio = in.nextDouble();
            in.nextLine();
            System.out.println("Ingrese el nombre del fabricante");
            String nombreFabricante = in.nextLine();
            Fabricante fabricante = fd.buscarFabricantePorNombre(nombreFabricante);
            
            if(fabricante==null){
                fd.ingresarFabricante(new Fabricante(nombreFabricante));
                fabricante=fd.buscarFabricantePorNombre(nombreFabricante);
            }
            
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setFabricante(fabricante);
           
        } catch (Exception e) {
            System.out.println("Hubo un error al crear el producto");
            in.nextLine();
            
        } finally{
            return producto;
        }

    }

    public void eliminarProducto() {
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        try {
            System.out.println("ingrese el nombre del producto que desea eliminar");
            String nombre = in.nextLine();
            Producto producto = pd.buscarProductoPorNombre(nombre);
            pd.eliminarProducto(producto);
        } catch (Exception e) {
            System.out.println("Hubo un error al eliminar el producto");
        }
    }

    public void modificarProducto() {
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        try {
            System.out.println("Ingrese el nombre del producto que desea modificar");
            String nombre = in.nextLine();
            Producto producto = pd.buscarProductoPorNombre(nombre);
            System.out.println("Ingrese el nuevo nombre");
            nombre = in.nextLine();
            System.out.println("Ingrese el nuevo precio");
            double precio = in.nextDouble();
            in.nextLine();
            System.out.println("Ingrese el nuevo fabricante");
            String nombreFabricante = in.nextLine();
            Fabricante fabricante = fd.buscarFabricantePorNombre(nombreFabricante);
            if(fabricante==null){
                fd.ingresarFabricante(new Fabricante(nombreFabricante));
                fabricante=fd.buscarFabricantePorNombre(nombre);
            }
            pd.modificarProducto(producto, nombre, precio, fabricante);
        } catch (Exception e) {
            in.nextLine();
            System.out.println("Hubo un error al modificar el producto");
        }
    }

}
