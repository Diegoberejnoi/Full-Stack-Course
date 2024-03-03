/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import guia11.eje2extra.cine.Entidades.Asiento;
import guia11.eje2extra.cine.Entidades.Cine;
import guia11.eje2extra.cine.Entidades.Espectador;
import guia11.eje2extra.cine.Entidades.Pelicula;
import java.sql.Time;
import java.util.ArrayList;


/**
 *
 * @author Diego
 */
public class CineServicio {
    
    public void iniciarSala(Cine cine){             
        for (int i = 0; i < 8; i++) {
           ArrayList<Asiento> filas=new ArrayList();  
            for (int j = 0; j < 6; j++) {
               filas.add(new Asiento());
            }
            cine.getButacas().add(filas);
        }
    }

    public void mostrarSala(Cine cine) {
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                System.out.print((i + 1));
                switch ((j + 1)) {
                    case 1:
                        System.out.print(" A ");
                        if (butacaOcupada(cine,i,j)) {
                            System.out.print("X | ");
                        } else {
                            System.out.print("  | ");
                        }
                        break;
                    case 2:
                        System.out.print(" B ");
                        if (butacaOcupada(cine,i,j)) {
                            System.out.print("X | ");
                        } else {
                            System.out.print("  | ");
                        }
                        break;
                    case 3:
                        System.out.print(" C ");
                        if (butacaOcupada(cine,i,j)) {
                            System.out.print("X | ");
                        } else {
                            System.out.print("  | ");
                        }
                        break;
                    case 4:
                        System.out.print(" D ");
                        if (butacaOcupada(cine,i,j)) {
                            System.out.print("X | ");
                        } else {
                            System.out.print("  | ");
                        }
                        break;
                    case 5:
                        System.out.print(" E ");
                        if (butacaOcupada(cine,i,j)) {
                            System.out.print("X | ");
                        } else {
                            System.out.print("  | ");
                        }
                        break;
                    case 6:
                        System.out.print(" F ");
                        if (butacaOcupada(cine,i,j)) {
                            System.out.print("X | ");
                        } else {
                            System.out.print("  | ");
                        }
                }

            }
            System.out.println("");
        }
    }

    public void crearPelicula(Cine cine) {
        cine.setPelicula(new Pelicula("Los piratas del caribe", "Sandberg", 18, new Time(2, 23, 0)));
        cine.setPrecioEntrada(1000.00);
    }

    public boolean puedeComprarEntrada(Cine cine, Espectador espectador) {
        boolean puedeComprar=espectador.getDineroDisponible()>=cine.getPrecioEntrada() && espectador.getEdad()>=cine.getPelicula().getEdadMinima();
        if(puedeComprar){
            ArrayList<Espectador> espectadores=cine.getEspectadores();
            espectador.setDineroDisponible(espectador.getDineroDisponible()-cine.getPrecioEntrada());
            espectadores.add(espectador);
        }
        return puedeComprar;
    }
    
    public boolean butacaOcupada(Cine cine,int fila,int columna){
        return cine.getButacas().get(fila).get(columna).isOcupado(); 
    }
    public void ubicarEspectador(Cine cine) {
        boolean ubicar;
        do {
            int fila = (int) (Math.random() * 8);
            int columna = (int) (Math.random() * 6);
            ubicar = !butacaOcupada(cine, fila, columna);
            if(ubicar){
                cine.getButacas().get(fila).get(columna).setOcupado(ubicar);
            }

        } while (!ubicar);
    }
    
    public boolean salaLlena(Cine cine) {
        boolean hayLugar = true;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                hayLugar = butacaOcupada(cine, i, j);
                if (!hayLugar) {
                    return hayLugar;
                }
            }

        }
        return hayLugar;
    }
    
    public void simulacion(Cine cine){
        crearPelicula(cine);
        for (int i = 0; i < 50; i++) {  
            Espectador espectador = new Espectador(((int)(Math.random()*80) + 10),(Math.random()*2000.00));
            if(puedeComprarEntrada(cine,espectador) && !salaLlena(cine) ){                
                    ubicarEspectador(cine);                
            }
        }
    }
}
