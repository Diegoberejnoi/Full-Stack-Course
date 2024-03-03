/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import java.util.Date;
import static java.util.Date.parse;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        Date prueba = parse(in.nextLine());
        System.out.println(prueba);
    }
    
}
