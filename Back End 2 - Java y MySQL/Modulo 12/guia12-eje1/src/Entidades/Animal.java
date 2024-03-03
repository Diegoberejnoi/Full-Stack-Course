/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Diego
 */
public class Animal {
    //La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal
    protected String nombre, alimento, raza;
    protected int edad;

    public Animal(String nombre,  String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }

    public Animal() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    /*
    Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
    mensaje por pantalla informando de que se alimenta
    */
    public void alimentacion(){
        System.out.println("se alimenta de " + alimento);
    };
}
