
package guia9.Act1;

import java.util.Scanner;

public class CadenaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cadena C1 = new Cadena();

    public void ingresarCadena() {
        System.out.println("Ingrese una frase");
        C1.setFrase(leer.nextLine());
       
    }
    public void  mostrarVocales() {
        int cont=0;
        String frase=C1.getFrase();
        for (int i = 0; i <=C1.getLongitud(); i++) {
            if (frase.charAt(i)=='a' || frase.charAt(i)=='e' || frase.charAt(i)=='i' || frase.charAt(i)=='o' || frase.charAt(i)=='u') {
                cont++;
            }
        }
        System.out.println("La palabra: "+frase+" tiene "+cont+" vocales.");
    }
    public void invertirFrase() {
        String frase=C1.getFrase();
        System.out.println("La frase invertida es: ");
        for (int i = C1.getLongitud(); i <= 0; i--) {
            System.out.print(frase.charAt(i));
        }
    }
    public void vecesRepetido() {
        String frase=C1.getFrase(), letra;
        int cont=0;
        System.out.println("Ingrese el caracter que desea contar");
        letra=leer.nextLine();
        for (int i = 0; i <= C1.getLongitud(); i++) {
            if (letra.equals(frase.charAt(i))) {
                cont++;
            }
        }
        System.out.println("El caracter '"+letra+"' se encuentra "+cont+" veces.");
    }
    public void compararLongitud() {
        String frase;
        System.out.println("Ingrese una nueva frase para comparar la longitud");
        frase=leer.nextLine();
        if (C1.getLongitud()==frase.length()) {
            System.out.println("Las dos frases tienen la misma longitud");
        } else if (C1.getLongitud()>frase.length()) {
            System.out.println("La primer frase ingresada es más grande");
        } else if (C1.getLongitud()<frase.length()) {
            System.out.println("La segunda frase ingresada es más grande");
        }
    }
    public void unirFrases() {
        String frase;
        System.out.println("Ingrese una nueva frase");
        frase=leer.nextLine();
        System.out.println(C1.getFrase()+frase);
    }
    public void reemplazar() {
        String letra, frase=C1.getFrase();
        System.out.println("Ingrese el caracter con el cual desea reemplazar");
        letra=leer.nextLine();
        for (int i = 0; i <= C1.getLongitud(); i++) {
            if (frase.charAt(i)=='a') {
                System.out.print(letra);
            } else {
                System.out.println(frase.charAt(i));
            }
        }
    }  
    public void contiene() {
        String letra, frase = C1.getFrase();
        System.out.println("Ingrese la letra que desea buscar");
        letra = leer.nextLine();
        for (int i = 0; i <= C1.getLongitud(); i++) {
            if (letra.equals(frase.charAt(i))) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }

    }
}
