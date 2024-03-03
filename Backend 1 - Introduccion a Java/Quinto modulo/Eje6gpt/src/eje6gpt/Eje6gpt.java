/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje6gpt;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Eje6gpt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        
        // Pedir al usuario que ingrese los valores de la matriz
        System.out.println("Ingrese los valores de la matriz de 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = in.nextInt();
                
                // Verificar que los valores ingresados estén dentro del rango de 1 a 9
                while (matriz[i][j] < 1 || matriz[i][j] > 9) {
                    System.out.println("El valor ingresado es incorrecto. Ingrese un valor entre 1 y 9:");
                    matriz[i][j] = in.nextInt();
                }
            }
        }
        
        // Calcular la suma de las filas, columnas y diagonales de la matriz
        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;
        int[] sumaFilas = new int[3];
        int[] sumaColumnas = new int[3];
        for (int i = 0; i < 3; i++) {
            sumaDiagonal1 += matriz[i][i];
            sumaDiagonal2 += matriz[i][2-i];
            for (int j = 0; j < 3; j++) {
                sumaFilas[i] += matriz[i][j];
                sumaColumnas[j] += matriz[i][j];
            }
        }
        
        // Verificar si todas las sumas son iguales
        boolean esMagica = true;
        int sumaMagica = sumaFilas[0];
        if (sumaDiagonal1 != sumaMagica || sumaDiagonal2 != sumaMagica) {
            esMagica = false;
        }
        for (int i = 0; i < 3; i++) {
            if (sumaFilas[i] != sumaMagica || sumaColumnas[i] != sumaMagica) {
                esMagica = false;
            }
        }
        
        // Imprimir el resultado
        if (esMagica) {
            System.out.println("La matriz ingresada es una matriz mágica.");
        } else {
            System.out.println("La matriz ingresada no es una matriz mágica.");
        }
    }
}


