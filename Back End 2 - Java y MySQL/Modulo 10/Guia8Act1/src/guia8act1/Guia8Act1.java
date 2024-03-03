
package guia8act1;

import java.util.Scanner;

public class Guia8Act1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //Creo el servicio para poder utilizarlo.
        CuentaBancariaServicio ServicioBancario = new CuentaBancariaServicio();
        int op;
        boolean salir=false;
        
        System.out.println("Bienvenido");
        System.out.println("Primero crearemos su cuenta");
        //Para llamar un metodo de otra clase debo poner el nombre del servicio que cree y que quiero llamar.
        ServicioBancario.crearCuenta();
        
        
        System.out.println("Menu de opciones:");
        System.out.println("1.Ingresar dinero");
        System.out.println("2.Extraer dinero");
        System.out.println("3.Extracción rápida");
        System.out.println("4.Consultar saldo");
        System.out.println("5.Mostrar los datos de la cuenta");
        System.out.println("6.Salir");
        op = leer.nextInt();
        while (salir==false) {
          switch(op) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                salir=true;
                break;
            default: 
                System.out.println("El número ingresado no es correcto");
                break;
        }  
        }
        
    }
    
}
