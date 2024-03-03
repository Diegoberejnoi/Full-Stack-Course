/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg27.ejercicio.pkg6;

import Entidades.Curso;
import Servicios.CursoService;

/**
 *
 * @author Carlos Ezequiel Diaz
 */
public class Encuentro27Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CursoService cs = new CursoService();
        Curso c = cs.crearCurso();
        
        System.out.println(c);
        
        cs.calcularGananciaSemanal(c);
        
    }
    
}
