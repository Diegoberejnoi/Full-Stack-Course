/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg40.extra3;

import entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Carlos Ezequiel Diaz
 */
public class Encuentro40Extra3 {

    /**También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libro o no.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashSet <Libro> listaLibros = new HashSet ();
        Scanner leer = new Scanner (System.in);
        String op="";
        
        do {
            System.out.print("Ingrese el Titulo del libro: ");
            String titulo = leer.nextLine();
            System.out.print("Ingrese el autor: ");
            String autor = leer.nextLine();
            System.out.print("Ingrese la cantidad total de ejemplares: ");
            int ejemplares = leer.nextInt();
            System.out.print("Ingrese la cantidad de ejemplares prestados: ");
            int prestados = leer.nextInt();
            leer.nextLine();
            
            listaLibros.add(new Libro (titulo, autor, ejemplares, prestados));
            
            System.out.print("Desea ingresar otro libro? (s/n): ");
            op = leer.nextLine();
            
        } while (op.equalsIgnoreCase("s"));
           
        /*Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
método. El método se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
que no queden ejemplares disponibles para prestar. Devuelve true si se ha
podido realizar la operación y false en caso contrario.*/
        
        System.out.print("Ingrese el titulo del libro que se quiere prestar: ");
        String titulo = leer.nextLine();
        
        for (Libro aux : listaLibros) {
            
            if (titulo.equalsIgnoreCase(aux.getTitulo())){
                
                boolean rta = aux.Prestamo();
                
            }
            
        }
        
        
        System.out.print("Ingrese el titulo del libro que se quiere devolver: ");
        String titulo2 = leer.nextLine();
        
        for (Libro aux : listaLibros) {
            
            if (titulo2.equalsIgnoreCase(aux.getTitulo())){
                
                boolean rta = aux.Devolucion();
                
            }
            
        }
        
        for (Libro aux : listaLibros) {
            
            System.out.println(aux);
                        
        }
        
        
        
    }
    
}
