/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje11teorico;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Eje11teorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Escribir un programa que procese una secuencia de caracteres ingresada por
        teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
        la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
        la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
        mantienen sin cambios.
        a e i o u
        @ # $ % *
        Realice un subprograma que reciba una secuencia de caracteres y retorne la
        codificación correspondiente. Utilice la estructura “según” para la
        transformación.
        Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
        La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase terminada por un .");
        String frase=leer.nextLine();
        
        System.out.println(codificar(frase));
        
    }
    
    public static String codificar(String frase){
        
        String letra;
        String codificada="";
        
        for (int i = 0; i < frase.length(); i++) {
            
            letra=frase.substring(i, i+1);
            
            switch(letra){
                case "a":
                    codificada+="@";
                    break;
                case "e":
                    codificada+="#";
                    break;
                case "i":
                    codificada+="$";
                    break;
                case "o":
                    codificada+="%";
                    break;
                case "u":
                    codificada+="*";
                    break;
                default:
                    codificada+=letra;
                    
                         
                            
            }
            
        }
        return codificada;   
}
    
}


