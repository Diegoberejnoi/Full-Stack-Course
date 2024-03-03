/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje6extra;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Eje6Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
        caracteres y, a medida que el usuario las va ingresando, construya una
        “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
        palabras se ubicarán todas en orden horizontal en una fila que será
        seleccionada de manera aleatoria. Una vez concluida la ubicación de las
        palabras, rellene los espacios no utilizados con un número aleatorio del 0
        al 9. Finalmente imprima por pantalla la sopa de letras creada.
        Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
        siguientes funciones de Java substring(), Length() y Math.random().
         */
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        String[][] matriz =new String[20][20];
        String palabra="";
        int posicion=0, fila;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j]="0";
            }
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese una palabra entre 3 y 5 letras");
            palabra=in.next();
            
            while(palabra.length()<3 || palabra.length()>5 ){
                System.out.println("El número de caracteres no es valido, intente de nuevo");
                palabra=in.next();
            }
            
            do{
                fila=(int) (Math.random()*20);
            switch(palabra.length()){
                case 3:
                    posicion=(int) (Math.random()*17);
                    
                    break;
                case 4:
                    posicion=(int) (Math.random()*16);
                    break;
                case 5:
                    posicion=(int) (Math.random()*15);
                    break;                
            }
                if (matriz[fila][posicion].equals("0") && matriz[fila][posicion+palabra.length()].equals("0")) {
                    break;
                }
            }while(true);
            
            
            
           for (int j = 0; j < palabra.length(); j++) {
                    matriz[fila][posicion]=palabra.substring(j,j+1);
                    posicion++;
                }
    
            
        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if(matriz[i][j].equals("0")){
                 matriz[i][j]=Integer.toString((int) (Math.random()*10));
                }
            }
        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
}
