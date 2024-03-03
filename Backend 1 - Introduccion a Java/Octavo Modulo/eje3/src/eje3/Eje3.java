/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje3;

import Servicio.PersonaServicio;
import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Eje3 {

    public static void main(String[] args) {
        PersonaServicio persona1 = new PersonaServicio();
        PersonaServicio persona2 = new PersonaServicio();
        PersonaServicio persona3 = new PersonaServicio();
        PersonaServicio persona4 = new PersonaServicio();
        
        persona1.crearPersona();
        
        if (persona1.mayorEdad()) {
            System.out.println("Persona 1 es mayor de edad");
        } else {
            System.out.println("Persona 1 No es mayor de edad");
        }
        
       persona2.crearPersona();
       
       if (persona2.mayorEdad()) {
           System.out.println("Persona 2 es mayor de edad");
       } else {
           System.out.println("Persona 2 no es mayor de edad");
       }
       
        persona3.crearPersona();
        if (persona3.mayorEdad()) {
           System.out.println("Persona 3 es mayor de edad");
       } else {
           System.out.println("Persona 3 no es mayor de edad");
       }
        
        persona4.crearPersona();
        if (persona4.mayorEdad()) {
           System.out.println("Persona 4 es mayor de edad");
       } else {
           System.out.println("Persona 4 no es mayor de edad");
       }
        
        //Creacion de un arreglo con los objetos 
        ArrayList<PersonaServicio> personas = new ArrayList<>(); //persona.size()=0
        personas.add(persona1); //persona.size()=1 Objetos dentro persona1
        personas.add(persona2);//persona.size()=2 Objetos dentro persona1 y persona2
        personas.add(persona3);//persona.size()=3 Objetos dentro persona1, persona2 y persona3
        personas.add(persona4);
        
        int ideal=0, debajo=0, encima=0, edad=0; //contadores
        
        for (PersonaServicio x : personas) { //for mejorado
            if(x.calcularIMC() < 0) {
               debajo++; 
            } else if (x.calcularIMC() == 0) {
                ideal++;
            } else {
                encima++;
            }
            
            if (x.mayorEdad()) {
                edad++;
            }
        }
        
        System.out.println("el porcentaje de los que tienen peso ideal es " + ((float) ideal/4) + "%");
        System.out.println("el porcentaje de los que tienen peso por encima del ideal: " + ((float) encima/4) + "%");
        System.out.println("el porcentaje de los que tienen peso por debajo del ideal: " + ((float) debajo/4) + "%");
        System.out.println("el porcentaje de los mayores de edad: " + ((float) edad/4) + "%");
        System.out.println("el porcentaje de los menores de edad: " + (1- (float) edad/4) + "%");
        
    }
}

