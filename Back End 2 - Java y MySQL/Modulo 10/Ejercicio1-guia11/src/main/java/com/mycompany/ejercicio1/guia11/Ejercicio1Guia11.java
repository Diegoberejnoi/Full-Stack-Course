/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio1.guia11;

import Entidades.Perro;
import Entidades.Persona;
import Enum.Tamanio;
import java.util.ArrayList;
import java.util.Scanner;

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
        //creacion de objetos
        ArrayList<Persona> listaPersonas = new ArrayList();
        ArrayList<Perro> listaPerros = new ArrayList();        
        ArrayList<Perro> perrosAdoptados = new ArrayList();
        Perro perroEncontrado;
        //metodos para llenar lista de personas y perros
        llenarListaPersonas(listaPersonas);
        llenarListaPerros(listaPerros);
        
        //recorremos la lista de personas para que adopten 1 perro
          for (Persona aux : listaPersonas) {
            boolean adoptado;
            //el bucle se va a repetir hasta que adopten 1 perro de los disponibles
            do {               
                //verifica que el nombre corresponda a un perro de la lista y lo asigna a una variable Perro
                perroEncontrado = encontrarPerro(listaPerros);
                //verifica que el perro no haya sido adoptado ya (true/false)
                adoptado = checkearAdopcion(perroEncontrado, perrosAdoptados);
                if (adoptado) { //si fue adoptado lo asigna al atributo mascota de la persona
                    System.out.println(aux.getNombre() + " felicitaciones, adoptaste a " + perroEncontrado.getNombre());
                    aux.setMascota(perroEncontrado);
                    perrosAdoptados.add(perroEncontrado);
                } else {//sino le pide que intente con otro
                    System.out.println("El perro ya ha sido adoptado, intente otro");
                }
            } while (!adoptado);
        }
        
        for (Persona aux:listaPersonas) {
            System.out.println(aux.toString());
        }

    }
    
    public static void llenarListaPersonas(ArrayList<Persona> listaPersonas){
        Persona persona1 = new Persona("Diego", "Berejnoi", 28, 38812914);
        Persona persona2 = new Persona("Carlos", "Diaz", 43, 28077913);
        Persona persona3 = new Persona("Santiago", "Perez");
        Persona persona4 = new Persona("Carolina", "Berejnoi");
        Persona persona5 = new Persona("Soledad", "Cosenza");
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);
}
    
    public static void llenarListaPerros(ArrayList<Perro> listaPerros){        
        Perro perro1 = new Perro("Bobby", "Grandanes", 1, Tamanio.GIGANTE);
        Perro perro2 = new Perro("Firulais", "Labrador", 10, Tamanio.GRANDE);
        Perro perro3 = new Perro("Arnaldo", "Caniche", 2, Tamanio.MICRO);
        Perro perro4 = new Perro("Sultan", "Salchicha", 8, Tamanio.PEQUENIO);
        Perro perro5 = new Perro("Rufus", "Mestizo", 5, Tamanio.MEDIANO);
        listaPerros.add(perro1);
        listaPerros.add(perro2);
        listaPerros.add(perro3);
        listaPerros.add(perro4);
        listaPerros.add(perro5);
    }
    
    public static Perro encontrarPerro(ArrayList<Perro> listaPerros ){
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        boolean encontrado = false;
        Perro perroEncontrado = new Perro();
        String nombrePerro;
        do {
            System.out.println("Estos son los perros en adopción " + listaPerros.toString());
            System.out.println(" Elija uno por su nombre");
            nombrePerro = in.next();
            for (Perro perroAux : listaPerros) {
                if (perroAux.getNombre().equalsIgnoreCase(nombrePerro)) {
                    perroEncontrado = perroAux;
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("Perro no encontrado, intente otro nombre");
                nombrePerro = in.next();
            }

        } while (!encontrado);
        return perroEncontrado;
    }
    
    public static boolean checkearAdopcion(Perro perroAAdoptar,ArrayList<Perro> listaPerrosAdoptados){
        boolean disponible = false;
        if (!listaPerrosAdoptados.contains(perroAAdoptar)) {
           disponible = true;
        } 
        return disponible;
    }
    
}

