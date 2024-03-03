/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1.guia11;

import Entidades.Perro;
import Entidades.Persona;
import Enum.Tamanio;

/**
 *
 * @author Diego
 */
public class Ejercicio1Guia11 {

    public static void main(String[] args) {
        /*
        Realizar un programa para que una Persona pueda adoptar un Perro. 
        Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; 
        y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, 
        vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y 
        por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
         */
        
        Persona diegoB = new Persona("Diego","Berejnoi",28,38812914);
        Persona Carlos=new Persona("Carlos", "Diaz", 43, 28077913);
        Perro cachorro=new Perro("Bobby","Grandanes",1,Tamanio.GIGANTE);
        Perro perroViejo=new Perro("Firulais", "Labrador", 10,Tamanio.GRANDE);
        
        int opcion=(int) (Math.random()*2)+1;
        
        switch(opcion){
            case 1:
                diegoB.setMascota(cachorro);
                Carlos.setMascota(perroViejo);
                break;
            case 2:
                diegoB.setMascota(perroViejo);
                Carlos.setMascota(cachorro);
                break;            
        }
        
        System.out.println(diegoB.toString());
        System.out.println(Carlos.toString());
                
        
        
    }
}
