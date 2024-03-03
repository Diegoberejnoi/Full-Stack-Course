/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;


public class Juego {
    
    private int numero, adivinar, intentos;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
    
    /**
    *Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
    a dos jugadores jugar un juego de adivinanza de números. El primer
    jugador elige un número y el segundo jugador intenta adivinarlo. El
    segundo jugador tiene un número limitado de intentos y recibe una pista
    de "más alto" o "más bajo" después de cada intento. El juego termina
    cuando el segundo jugador adivina el número o se queda sin intentos.
    Registra el número de intentos necesarios para adivinar el número y el
    número de veces que cada jugador ha ganado.
 */
     public void iniciarJuego(){
        Scanner in = new Scanner(System.in).useDelimiter("\n"); //es para sacar el cache del enter
        int dificultad =0 , cont = 1;

        do {
            System.out.println("Defina la dificultad: ");
            System.out.println("1. Facil (10 intentos)");
            System.out.println("2. Normal (5 intentos)");
            System.out.println("3. Dificil (2 intentos)");
            dificultad = in.nextInt();

            switch (dificultad) {
                case 1:
                    this.intentos = 10;
                    break;
                case 2:
                    this.intentos = 5;
                    break;
                case 3:
                    this.intentos = 2;
                    break;
                default:
                    System.out.println("La opcion ingresada no es válida");}

            }while (dificultad < 1 || dificultad > 3);

            System.out.println("Jugador 1, por favor ingrese el número a adivinar");
            this.numero = in.nextInt();

            do {
                System.out.println("Jugador 2 este es su " + cont + " intento, intente adivinar el número");
                this.adivinar = in.nextInt();
                
                if (adivinar < numero) {
                    System.out.println("Más alto");
                } else if (adivinar > numero) {
                    System.out.println("Más bajo");
                } else {
                    break;
                }

                cont++;

            }while (cont != (intentos+1));

            if (adivinar == numero) {
                System.out.println("Felicidades, usted ha adivinado en " + cont + " intentos");
            } else {
                System.out.println("Lo lamentamos, usted no ha adivinado");
            }
        }
 
    }

    
    
    

