/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Cuenta {
    private String titular;
    private double saldo=Math.random()*1000;

    public double getSaldo() {
        return saldo;
    }
    
    /*
    Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
    Luego, crea un método "retirar_dinero" que permita retirar una cantidad
    de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
    negativo después de realizar una transacción de retiro.
    */
    public void retirarDinero(double retirar) {

        if (retirar > saldo) {
            System.out.println("Transacción invalida");
        } else {
            this.saldo -= retirar;
        }

        System.out.println("su saldo es de $" + saldo);

    }

}
