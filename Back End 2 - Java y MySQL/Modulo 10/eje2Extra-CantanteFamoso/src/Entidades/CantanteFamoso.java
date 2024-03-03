/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Objects;

/**
 *
 * @author Diego
 */
public class CantanteFamoso {
     /*
        Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes
        famosos y tendrá como atributos el nombre y discoConMasVentas. Se debe,
        además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 
        objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los 
        nombres de cada cantante y su disco con más ventas por pantalla. Una vez 
        agregado los 5, en otro bucle, crear un menú que le de la opción al 
        usuario de agregar un cantante más, mostrar todos los cantantes, 
        eliminar un cantante que el usuario elija o de salir del programa. 
        Al final se deberá mostrar la lista con todos los cambios.  
        */
    private String nombre,discoConMasVentas;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String nombre, String discoConMasVentas) {
        this.nombre = nombre;
        this.discoConMasVentas = discoConMasVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoConMasVentas() {
        return discoConMasVentas;
    }

    public void setDiscoConMasVentas(String discoConMasVentas) {
        this.discoConMasVentas = discoConMasVentas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + Objects.hashCode(this.discoConMasVentas);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CantanteFamoso other = (CantanteFamoso) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.discoConMasVentas, other.discoConMasVentas)) {
            return false;
        }
        return true;
    }

    

    

    @Override
    public String toString() {
        return "Cantante: " + nombre + ", disco más vendido: " + discoConMasVentas + "";
    }
    
    
}
