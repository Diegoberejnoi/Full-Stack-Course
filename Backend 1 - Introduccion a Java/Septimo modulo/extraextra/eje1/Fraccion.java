/* Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador 
   de cada fracción). Crear la clase servicio que contenga métodos para sumar, restar, 
   multiplicar y dividir fracciones.  Mostrar por pantalla un menú de opciones para 
   que el usuario decida que ver.
 */
package EntidadesExtra2;

import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class Fraccion {

    private int num1;
    private int den1;
    private int num2;
    private int den2;

    public Fraccion() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getDen1() {
        return den1;
    }

    public void setDen1(int den1) {
        this.den1 = den1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getDen2() {
        return den2;
    }

    public void setDen2(int den2) {
        this.den2 = den2;
    }

    public float operacion() {
        float resultado = 0;
        int opMenu;
        Scanner leerValores = new Scanner(System.in);

        do {
            System.out.println("----Menu---- \n"
                    + "1- Sumar \n"
                    + "2- Restar \n"
                    + "3- Multiplicar \n"
                    + "4- Dividir \n"
                    + "Elija una operacion a realizar");
            opMenu = leerValores.nextInt();

            switch (opMenu) {
                case 1:
                    resultado = ((float) num1 * den2 + den1 * num2) / (den1 * den2);
                    break;
                case 2:
                    resultado = ((float) num1 * den2 - den1 * num2) / (den1 * den2);
                    break;
                case 3:
                    resultado = ((float) num1 * num2) / (den1 * den2);
                    break;
                case 4:
                    resultado = (((float) num1 * den2) / (den1 * num2));
                    break;
                default:
                    System.out.println("Opcion ingresada incorrecta");
            }

        } while (opMenu < 1 || opMenu > 4);
        return resultado;

    }
}
