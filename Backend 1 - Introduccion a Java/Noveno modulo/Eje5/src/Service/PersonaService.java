/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *a) Método crearPersona que pida al usuario Nombre y fecha de
    nacimiento de la persona a crear. Retornar el objeto Persona creado.
    * 
    b) Método calcularEdad que calcule la edad del usuario utilizando el
    atributo de fecha de nacimiento y la fecha actual.
    * 
    c) Método menorQue recibe como parámetro una Persona y una edad.
    Retorna true si la persona es menor que la edad consultada o false
    en caso contrario.
    * 
    d) Método mostrarPersona que muestra la información de la persona
    deseada.
4
 */
public class PersonaService {
    Scanner in = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){
        
        System.out.println("Ingrese el nombre y la fecha de nacimiento de la persona (dia/mes/anño)");
        String nombre = in.nextLine();
        int dia=in.nextInt();
        int mes = in.nextInt()-1;
        int anio = in.nextInt()-1900;
        Date fechaNacimiento=new Date(anio,mes,dia);
        Persona persona = new Persona(nombre, fechaNacimiento);
        return persona;
    }
    
    public int diferencia (Date fechaNacimiento){
        
        int edad;
        Date fechaActual=new Date();
        Date fechaCumple = new Date();
      
        fechaCumple = (Date)fechaNacimiento.clone();              
        fechaCumple.setYear(fechaActual.getYear());
        
      if (fechaCumple.after(fechaActual)) {

            edad = fechaActual.getYear() - fechaNacimiento.getYear()-1;

       } else {
            
         edad = fechaActual.getYear() - fechaNacimiento.getYear();
       }

        return edad;

    }
    
    public boolean menorQue(Persona persona, int edad2){
      
        int edad=diferencia(persona.getFecha());
        
        return edad<edad2;
    }
    
    public void mostrarPersona(Persona persona){
        System.out.println(persona);
    }
    
    
    
}
