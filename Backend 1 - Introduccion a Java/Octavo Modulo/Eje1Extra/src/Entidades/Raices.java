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
public class Raices {
    /*
    donde representaremos los
    valores de una ecuación de 2º grado. Tendremos los 3 coeficientes
    como atributos, llamémosles a, b y c. Hay que insertar estos 3 valores
    para construir el objeto a través de un método constructor. Luego, en
    RaicesServicio las operaciones que se podrán realizar son las siguientes:
    */
    private int a,b,c;//y=a*x^2+b*x+c

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    
}
