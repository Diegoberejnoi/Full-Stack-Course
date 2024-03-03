/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import NIF.NIF;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class NIFServices {
    /*
    a) Métodos getters y setters para el número de DNI y la letra.
    */
    Scanner in = new Scanner(System.in).useDelimiter("\n");
    
    public long getDNI(NIF nif){
        return nif.getDNI();
    }
     public long setDNI(NIF nif, long numero){
         nif.setDNI(numero);
         return numero;
    }
     
     public String getNIF(NIF nif){
         return nif.getLetra();
     }
     public String setNIF(NIF nif, String letra){
         nif.setLetra(letra);
         return letra;
     }
    
    /*
    b) Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
    letra que le corresponderá. Una vez calculado, le asigna la letra que
    le corresponde según La letra correspondiente al dígito verificador 
     se calculará a traves de un
método que funciona de la siguiente manera: Para calcular la letra se
toma el resto de dividir el número de DNI por 23 (el resultado debe ser
un número entre 0 y 22). El método debe buscar en un array (vector) de
caracteres la posición que corresponda al resto de la división para
obtener la letra correspondiente. La tabla de caracteres es la siguiente:
     */
     
     public String crearNif(NIF nif){
         
         String letras[]={"T","R","W","A","G","M","Y","F","P",
             "D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
         
         System.out.println("Ingrese el dni");
         long dni = in.nextLong();
         in.nextLine();
         nif.setDNI(dni);
         int resto=(int)(dni%23);
         
         nif.setLetra(letras[resto]);
         
         return letras[resto];
     }
     
     /*
    c) Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un
    guion y la letra en mayúscula; por ejemplo: 00395469-F).
    La letra correspondiente al dígito verificador se calculará a traves de un
    método que funciona de la siguiente manera: Para calcular la letra se
    toma el resto de dividir el número de DNI por 23 (el resultado debe ser
    un número entre 0 y 22). El método debe buscar en un array (vector) de
    caracteres la posición que corresponda al resto de la división para
    obtener la letra correspondiente. La tabla de caracteres es la siguiente:
    */
     
     public void mostar(NIF nif){
         System.out.println(nif.getDNI() + "-"+ nif.getLetra());
     }
    
}
