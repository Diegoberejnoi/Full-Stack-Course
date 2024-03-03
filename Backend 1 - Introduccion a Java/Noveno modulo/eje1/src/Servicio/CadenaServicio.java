/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cadena;

/**
 *
 * @author Diego
 */
public class CadenaServicio {

    public int mostrarVocales(Cadena frase) {
        int nvocales = 0;
        char letra;
        int longitud = frase.getLongitud();
        for (int i = 0; i < longitud; i++) {
            letra = frase.getFrase().charAt(i);
            if (letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u') {
                nvocales++;
            }
        }

        System.out.println("La frase " + frase.getFrase() + " tiene " + nvocales + " vocales");
        return nvocales;
    }

    public void invertirFrase(Cadena frase) {
        int longitud = frase.getLongitud();
        String fraseInv="";
        for (int i = longitud-1; i > -1; i--) {
            fraseInv+=frase.getFrase().charAt(i);
        }
        System.out.println("La frase invertida es " + fraseInv);
    }

    public int vecesRepetido(Cadena frase, String letra) {
        int nRepetido = 0;
        char aux;
        int longitud = frase.getLongitud();

        for (int i = 0; i < longitud; i++) {
            aux = frase.getFrase().toLowerCase().charAt(i);
            if (aux == letra.charAt(0)) {
                nRepetido++;
            }

        }
        System.out.println("La frase " + frase.getFrase() + " tiene " + nRepetido+ " letras " + letra);
        return nRepetido;
    }

    public void compararLongitud(Cadena frase, String frase2){
        
        if (frase.getLongitud()>frase2.length()){
            System.out.println("La frase que compone la clase es más larga que la frase ingresada");
        }else if (frase.getLongitud()<frase2.length()){
            System.out.println("La frase que compone la clase es más corta que la frase ingresada");
        }else{
            System.out.println("Ambas frases tienen la misma longitud");
        }
        
        
    }
    
    public void unirFrase(Cadena frase, String frase2){
        System.out.println(frase.getFrase()+frase2);
    }
    
    public void reemplazar(Cadena frase, String letra){
        String fraseaux=frase.getFrase(), frasemod="";
        int longitud=frase.getLongitud();
        
        for (int i = 0; i < longitud; i++) {
            if (fraseaux.charAt(i)=='a') {
                frasemod+=letra;
            }else{
                frasemod+=fraseaux.charAt(i);
            }
            
        }
        System.out.println(frasemod);
        
    }
    
    public boolean contiene(Cadena frase, String letra) {
        boolean presente = false;
        char aux;
        int longitud = frase.getLongitud();

        for (int i = 0; i < longitud; i++) {
            aux = frase.getFrase().toLowerCase().charAt(i);
            presente = aux == letra.charAt(0);
            if (presente) {
             break;
            }

        }
        
        return presente;
    }
    
    
}

