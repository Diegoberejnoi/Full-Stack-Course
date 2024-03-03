/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class FechaService {
    /*a) Método fechaNacimiento que pregunte al usuario día, mes y año de
    su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
    El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
    new Date(anio, mes, dia);
    b) Método fechaActual que cree un objeto fecha con el día actual. Para
    esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
    fechaActual = new Date();
    El método debe retornar el objeto Date.
    c) Método diferencia que reciba las dos fechas por parámetro y retorna
    la diferencia de años entre una y otra (edad del usuario).
*/
    Scanner in = new Scanner(System.in).useDelimiter("\n");
    
    public Date fechaNacimiento(){
        System.out.println("ingrese su fecha de nacimiento dd/mm/yyyy");
        int dia = in.nextInt(), mes=in.nextInt(), anio=in.nextInt();
        return new Date(anio-1900,mes-1,dia);
    }
    
    public Date fechaActual(){
        return new Date();
    }
    
    public int diferencia(Date nacimiento, Date actual){
        long diferencia = actual.getTime() - nacimiento.getTime();
        // Convertir la diferencia a años
        long anios = diferencia / 1000 / 60 / 60 / 24 / 365;
        
        return (int) anios;
    }
    
    
    
}
