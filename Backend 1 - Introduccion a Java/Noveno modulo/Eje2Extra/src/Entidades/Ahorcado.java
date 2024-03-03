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
public class Ahorcado {
    
    
    private char[] palabra;
    private char[] letras;
    private int njugadas;

    public Ahorcado(char[] palabra, char[] letras, int njugadas) {
        this.palabra = palabra;
        this.letras = letras;
        this.njugadas = njugadas;
    }

    public Ahorcado() {
    }

    public char[] getPalabra() {
        return palabra;
    }

    public char[] getLetras() {
        return letras;
    }

    public int getNjugadas() {
        return njugadas;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public void setLetras(char[] letras) {
        this.letras = letras;
    }

    public void setNjugadas(int njugadas) {
        this.njugadas = njugadas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", letras=" + letras + ", njugadas=" + njugadas + '}';
    }
    
    
    
    
}
