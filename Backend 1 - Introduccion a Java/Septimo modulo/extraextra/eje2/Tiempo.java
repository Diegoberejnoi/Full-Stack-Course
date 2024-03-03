/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir
 * dos constructores: un constructor vacío y otro con la hora, minutos y
 * segundos ingresado por el usuario. Deberá definir además, los métodos getters
 * y setters correspondientes, y el método imprimirHoraCompleta(). Recordar
 * crear una validación sobre las horas, minutos y segundos ingresados por el
 * usuario. Te animas a simular el paso del tiempo en consola??????
 *
 * System.out.printf("%02d:%02d:%02d\n", hora, minutos, segundos);
 *
 *
 *
 * @author Carlos Ezequiel Diaz
 */
public class Tiempo {

    //Atributos
    private int hora, min, seg;

    //Constructores
    public Tiempo() {
    }

    public Tiempo(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    //Getters y Setters
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {

        if (hora < 0 || hora > 23) {

            System.out.println("La hora ingresada es invalida");
        } else {

            this.hora = hora;
        }

    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {

        if (min < 0 || min > 59) {

            System.out.println("los minutos ingresados son invalidos");
        } else {

            this.min = min;
        }

    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {

        if (seg < 0 || seg > 59) {

            System.out.println("los segundos ingresados son invalidos");
        } else {

            this.seg = seg;
        }

    }

    public void imprimirHoraCompleta() {

        Timer timer = new Timer();
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                System.out.printf("%02d:%02d:%02d\n", hora, min, seg);
                
                if (seg<59){
                    seg++;
                } else {
                    seg=0;
                    
                    if (min<59){
                        min++;
                    } else {
                        min=0;
                        
                        if(hora<23){
                            hora++;
                        } else {
                            hora=0;
                        }
                    }
                } 
                
                

            }
        };

        timer.scheduleAtFixedRate(tarea, 0, 1000);

    }


}
