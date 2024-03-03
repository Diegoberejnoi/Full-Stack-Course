/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Diego
 */
public class Empleado {
    
    private String nombre;
    private int edad;
    private double salario;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado() {
    }
    
    /*
    Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
    "salario". Luego, crea un método "calcular_aumento" que calcule el
    aumento salarial de un empleado en función de su edad y salario actual.
    El aumento salarial debe ser del 10% si el empleado tiene más de 30
    años o del 5% si tiene menos de 30 años.
    */
    
    public void calcularAumento(){
        
        if(edad>30){
            System.out.println(nombre + " su saldo quedaria en $" + (salario*1.1));
        } else{
            System.out.println(nombre + " su saldo quedaria en $" + (salario*1.05));
        }
    }
    
}
