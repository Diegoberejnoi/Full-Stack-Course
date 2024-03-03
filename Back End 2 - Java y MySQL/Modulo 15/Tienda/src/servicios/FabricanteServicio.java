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

public class FabricanteServicio {

    FabricanteDAO fd = new FabricanteDAO();

    public Fabricante crearFabricante() throws Exception {
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        Fabricante fabricante = null;
        try {
            System.out.println("Ingrese el nombre del fabricante");
            fabricante = new Fabricante(in.nextLine());
            return fabricante;
        } catch (Exception e) {
            throw e;
        }

    }

    public void ingresarFabricante() {

        try {
            fd.ingresarFabricante(crearFabricante());

        } catch (Exception e) {

            System.out.println("Hubo un error desconocido sql al ingresar");

        }

    }

    public void eliminarFabricante() {
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        try {
            System.out.println("ingrese el nombre del fabricante que desea eliminar");
            String nombre = in.nextLine();
            Fabricante fabricante = fd.buscarFabricantePorNombre(nombre);
            fd.eliminarFabricante(fabricante);
        } catch (Exception e) {
            System.out.println("Hubo un error al eliminar el fabricante");
        }
    }

    public void modificarFabricante() {
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        try {
            System.out.println("Ingrese el nombre del fabricante que desea modificar");
            String nombre = in.nextLine();
            Fabricante fabricante = fd.buscarFabricantePorNombre(nombre);
            System.out.println("Ingrese el nuevo nombre");
            nombre = in.nextLine();
            fd.modificarFabricante(fabricante, nombre);
        } catch (Exception e) {
            in.nextLine();
            System.out.println("Hubo un error al modificar el fabricante");
        }
    }
    
    public void mostrarFabricantes(){
        try {
            fd.mostrarFabricantes();
        } catch (Exception e) {
            System.out.println("Error al mostrar fabricantes");
        }
    }

} 

