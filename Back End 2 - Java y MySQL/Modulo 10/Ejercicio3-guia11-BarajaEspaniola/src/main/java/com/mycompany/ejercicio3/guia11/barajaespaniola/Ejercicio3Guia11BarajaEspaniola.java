/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3.guia11.barajaespaniola;

import Entidades.Juego;
import Servicios.JuegoServicio;

/**
 *
 * @author Diego
 */
public class Ejercicio3Guia11BarajaEspaniola {

    public static void main(String[] args) {
        Juego juego =new Juego();
        JuegoServicio js = new JuegoServicio();
        js.menu(juego);
    }
}
