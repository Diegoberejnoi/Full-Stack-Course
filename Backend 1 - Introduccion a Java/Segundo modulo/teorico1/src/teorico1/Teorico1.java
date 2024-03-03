/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teorico1;

/**
 *
 * @author Diego
 */
public class Teorico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    String nombre;
    int numero;
    double decimales;
    boolean logico;
    char letra;
    byte unidad;
    long largo;
    
    numero = 345678;
    decimales = 3.14;
    logico= true;
    letra= 'j';
    unidad=2;
    largo= 922337203; //no me deja mas digitos que esto
    
    System.out.println("El int es " + numero);
    System.out.println("El double es " + decimales);
    System.out.println("El boolean es " + logico);
    System.out.println("El char es " + letra);
    System.out.println("El byte es " + unidad);
    System.out.println("El long es " + largo);
    
    }
}
