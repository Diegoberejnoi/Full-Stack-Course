/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NIF;

/**
 *
 * @author Diego
 */
public class NIF {
    
    /*
    Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs
    con su correspondiente letra (NIF). Los atributos serán el número de DNI
    (entero largo) y la letra (String o char) que le correspond
    */
    
    private long DNI;
    private String letra;

    public NIF(long DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public NIF() {
    }

    public long getDNI() {
        return DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    
    
    
}
