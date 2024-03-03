/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class AhorcadoService {
    Scanner in = new Scanner(System.in).useDelimiter("\n");
    //private Ahorcado juego;

    public Ahorcado crearJuego(){
        System.out.println("Ingrese la palabra");
        String palabra =in.next();
        int longitud = palabra.length();        
        char[] palabraV = new char[longitud];
        char[] letrasV = new char[longitud];
        for (int i = 0; i < longitud; i++) {
            palabraV[i]=palabra.charAt(i);
            letrasV[i]='_';
        }
        System.out.println("Ingrese la cantidad de jugadas máximas");
        int nIntentos=in.nextInt();
        Ahorcado juego=new Ahorcado(palabraV,letrasV,nIntentos);
        return juego;        
    }
    
    public int longitud(Ahorcado juego){
        return juego.getPalabra().length;
    }
    
    public void buscar(Ahorcado juego, char letra) {
        char[] palabra = Arrays.copyOf(juego.getPalabra(), juego.getPalabra().length);
        char[] letrasEncontradas = Arrays.copyOf(juego.getLetras(), juego.getLetras().length);
        for (int i = 0; i < longitud(juego); i++) {
            if (palabra[i] == letra) {
                System.out.println("La letra " + letra + " se encontró en la posición " + (i + 1));
                letrasEncontradas[i] = letra;
            }
        }
         juego.setLetras(letrasEncontradas);
    }

    public boolean encontradas(Ahorcado juego, char letra) {
       
        int contador = 0;
        buscar(juego, letra);
        char[] letrasEncontradas = Arrays.copyOf(juego.getLetras(), juego.getLetras().length);
        for (int i = 0; i < longitud(juego); i++) {
            if (letrasEncontradas[i] != '_') {
                contador++;
            }            
        }
        System.out.println("Usted a encontrado " + contador
                    + "\nle faltan " + (longitud(juego) - contador));
        return contador>0;
    }
    
    public int intentos(Ahorcado juego){
        return juego.getNjugadas();
    }
    
    public void juego(){
        Ahorcado ahorcado = crearJuego();
        int nIntentos=intentos(ahorcado);
        char letra;
        
        char[] palabra = Arrays.copyOf(ahorcado.getPalabra(), ahorcado.getPalabra().length);
        char[] letrasEncontradas = Arrays.copyOf(ahorcado.getLetras(), ahorcado.getLetras().length);
        
        do{
            for (int i = 0; i < longitud(ahorcado); i++) {
                System.out.print(letrasEncontradas[i]+" ");
            }
            System.out.println("");
            
            System.out.println("Ingrese una letra");
            letra=in.next().charAt(0);
            if(!encontradas(ahorcado,letra)){
                nIntentos--;
            }       
            
            letrasEncontradas = Arrays.copyOf(ahorcado.getLetras(), ahorcado.getLetras().length);
            if(Arrays.equals(palabra, letrasEncontradas)){
                break;
            }         
            System.out.println("Le quedan "+nIntentos+" intentos");
        }while(nIntentos!=0 );
        
        if(nIntentos>0){
            System.out.println("Felicidades, ha ganado");
        }else{
            System.out.println("Se han agotados los intentos");
        }
    }
}
