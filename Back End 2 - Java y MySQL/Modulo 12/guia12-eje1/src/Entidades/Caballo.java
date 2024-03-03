/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Diego
 */
public final class Caballo extends Animal{

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    

    public Caballo() {
    }
 @Override
    public String getNombre() {
        return nombre;
    }
 @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 @Override
    public String getAlimento() {
        return alimento;
    }
 @Override
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
 @Override
    public String getRaza() {
        return raza;
    }
 @Override
    public void setRaza(String raza) {
        this.raza = raza;
    }
 @Override
    public int getEdad() {
        return edad;
    }
 @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public void alimentacion(){
        System.out.print("El caballo " +nombre+ " ");
        super.alimentacion();
    }
}
