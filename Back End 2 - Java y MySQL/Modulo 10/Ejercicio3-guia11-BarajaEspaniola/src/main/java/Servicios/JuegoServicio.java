/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Baraja;
import Entidades.Carta;
import Entidades.Juego;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class JuegoServicio {

    /*
    Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.*/
    public void barajar(Baraja mazo) {
        Collections.shuffle(mazo.getBaraja());
        Collections.shuffle(mazo.getBaraja());
        Collections.shuffle(mazo.getBaraja());
    }

    /*
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.*/
    public Carta siguienteCarta(Juego juego) {
        Carta siguiente = new Carta(0, "noCarta");
        if (cartasDisponibles(juego) > 0) {
            siguiente = juego.getMazo().getBaraja().get(0);
            juego.getMazo().getBaraja().remove(0);
            juego.getMonton().getBaraja().add(siguiente);
            System.out.println("Carta entregada: " + siguiente.toString());
        } else {
            System.out.println("No quedan más cartas en la baraja");
        }

        return siguiente;
    }

    /*
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.*/
    public int cartasDisponibles(Juego juego) {
        return juego.getMazo().getBaraja().size();
    }

    /*
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.*/

    public void darCartas(Juego juego) {
        System.out.println("Cuantas cartas quiere?");
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        int nCartas = in.nextInt();
        in.nextLine();
        if (nCartas <= cartasDisponibles(juego)) {
            for (int i = 0; i < nCartas; i++) {
                System.out.print((i + 1) + "° Carta ");
                siguienteCarta(juego);
            }
        } else {
            System.out.println("No hay suficiente cartas");
        }
    }

    /*
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario*/
    public void cartasMonton(Juego juego) {
        if (juego.getMonton().getBaraja().size() > 0) {
            System.out.println(juego.getMonton().toString());
        } else {
            System.out.println("No hay cartas en el monton");
        }
    }

    /*
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
     */
    public void mostrarBaraja(Juego juego) {
        if (cartasDisponibles(juego) > 0) {
            System.out.println(juego.getMazo().toString());
        } else {
            System.out.println("No quedan cartas en el mazo");
        }
    }

    public void menu(Juego juego) {
        int opcion = 0;
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        do {
            System.out.println("-----");
            System.out.println("Menú"
                    + "\n1.Barajar"
                    + "\n2.Dar cartas"
                    + "\n3.Número de cartas restantes"
                    + "\n4.Ver cartas del monton"
                    + "\n5.Mostrar baraja"
                    + "\n6.Salir");
            System.out.println("-----");

            opcion = in.nextInt();
            in.nextLine();

            switch (opcion) {
                case 1:
                    barajar(juego.getMazo());
                    break;
                case 2:
                    darCartas(juego);
                    break;
                case 3:
                    System.out.println(cartasDisponibles(juego));
                    break;
                case 4:
                    cartasMonton(juego);
                    break;
                case 5:
                    mostrarBaraja(juego);
                    break;
                case 6:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 6);

    }

}
