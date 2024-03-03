
package guia8act1;

import java.util.Scanner;

public class CuentaBancariaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //Crear cuenta. Como voy a trabajar con todo el objeto llamo la clase donde 
    //se encuentran los atributos del objeto por eso puse "public CuentaBancaria"
    public CuentaBancaria crearCuenta() {
        CuentaBancaria C1 = new CuentaBancaria();
        System.out.println("Iniciando la creacion de la cuenta:");
        int numeroCuenta = (int) Math.random()*5;
        C1.setNumeroCuenta(numeroCuenta);
        System.out.println("Ingrese el dni");
        long dniCliente = leer.nextLong();
        C1.setDniCliente(dniCliente);
        System.out.println("Ingrese el saldo actual");
        double saldoActual = leer.nextDouble();
        C1.setSaldoActual(saldoActual);
        System.out.println("Cuenta creada con exito");
        return C1;
    }
    
    //Ingresar dinero. Como voy a trabajar solo con un atributo del objeto y lo voy 
    //a modificar pongo el "double" y en parentesis le explico que clase de objeto 
    //y que objeto voy a modificar.
    public double ingresar(CuentaBancaria C1) {
        double ingresoSaldo;
        System.out.println("Ingrese la cantidad de dinero que desea ingresar");
        ingresoSaldo = leer.nextDouble();
        
        //El set permite modificar el valor, el get lo trae. Siempre que quiero trabajar
        //con los atributos debo usar el set y get (ya que estan en privado).
        C1.setSaldoActual(ingresoSaldo+C1.getSaldoActual());
        
        return C1.getSaldoActual();
    }
    
    //Retirar dinero. Siempre tengo que llamar al atributo con el nombre del objeto
    //y el get, aunque sea solo para poder usar el valor para comparar.
    public double Retirar(CuentaBancaria C1) {
        double retirarSaldo;
        System.out.println("Ingrese la cantidad de dinero que desea retirar");
        retirarSaldo = leer.nextDouble();
        C1.getSaldoActual();
        if (retirarSaldo<=C1.getSaldoActual()) {
            C1.setSaldoActual(C1.getSaldoActual()-retirarSaldo);
            
        } else if (retirarSaldo>C1.getSaldoActual()) {
            System.out.println("Saldo insuficiente");
            System.out.println("Usted puede retirar hasta $"+C1.getSaldoActual());
            C1.setSaldoActual(0);
        }
        return C1.getSaldoActual();
    }
    
    //Extracción del 20% del sueldo actual.
    public double extraccionRapida(CuentaBancaria C1) {
        double extraRapida;
        C1.getSaldoActual();
        System.out.println("Su saldo es $"+C1.getSaldoActual());
        extraRapida = C1.getSaldoActual()*0.20;
        System.out.println("Retirará $"+extraRapida);
        C1.setSaldoActual(C1.getSaldoActual()-extraRapida);
        return C1.getSaldoActual();
    }
    
    //Consultar Saldo. Como no devuelve nada modificado es "void".
    public void consultarSaldo(CuentaBancaria C1) {
        String respuesta;
        System.out.println("¿Desea consultar su saldo? S/N");
        respuesta = leer.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            System.out.println("Su saldo actual es: $"+C1.getSaldoActual());
        }
    }
    
    //Consultar los datos de la cuenta.
    public void consultarDatos(CuentaBancaria C1) {
        System.out.println("Los datos de la cuenta n° "+C1.getNumeroCuenta()+" son:");
        System.out.println("DNI del cliente: "+C1.getDniCliente());
        System.out.println("Saldo actual: "+C1.getSaldoActual());
    }
}
