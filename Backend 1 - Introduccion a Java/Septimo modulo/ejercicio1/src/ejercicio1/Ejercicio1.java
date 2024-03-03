/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import ejercicio1.Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro lib1 = new Libro();
        Scanner in = new Scanner(System.in).useDelimiter("\n");
               
        System.out.println("Ingrese el el número de ISBN, el título, el autor del\n" +
"    libro y el número de páginas");
        Libro lib2= new Libro();
        
        long isbn = in.nextLong();//12 
        in.nextLine();
        String titulo = in.nextLine();
        String autor = in.nextLine();
        int numero = in.nextInt();
        in.nextLine();
        
        lib2.cargarLibro(isbn, titulo, autor, numero);
        
        System.out.println(lib1.toString() + lib2.toString());
        //
        Math.sqrt((Math.pow(x2-x1,2)+(Math.pow(y2-y1,2));
        
    }
    
}
