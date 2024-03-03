/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.Entidades;

/**
 *
 * @author Diego
 */
public class Operacion {
    
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public Operacion() {
        this.numero1 = 1;
        this.numero2 = 2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(int numero1, int numero2){
        this.numero1= numero1;
        this.numero2=numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }
    
    public int sumar(){
        int suma = numero1+numero2;
        return suma;
    }
    public int resta(){
        int resta = numero1-numero2;
        return resta;
    }
    /*
    Método multiplicar(): primero valida que no se haga una
    multiplicación por cero, si fuera a multiplicar por cero, el método
    devuelve 0 y se le informa al usuario el error. Si no, se hace la
    multiplicación y se devuelve el resultado al main
    */
    
    public int multiplicar(){
        int mult=0;
        if(numero1==0 || numero2==0){
            System.out.println("Error: Usted ha intentado multiplicar por 0");
        } else{
            mult= numero1*numero2;
        }
        return mult;
    }
    
    /*
    Método dividir(): primero valida que no se haga una división por cero,
    si fuera a pasar una división por cero, el método devuelve 0 y se le
    informa al usuario el error se le informa al usuario. Si no, se hace la
    división y se devuelve el resultado al main.
    */
    
     public float dividir(){
        float div=0;
        if(numero2==0){
            
            System.out.println("Error: Usted ha intentado dividir por 0");
        } else{
            div=(float)(numero1)/(float)(numero2);
        }
        return div;
    }

    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
 
    
}
