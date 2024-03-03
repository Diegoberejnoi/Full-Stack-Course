/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class CuentaBancariaServicio {
    private Scanner in = new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBancaria crearCuenta(){
        CuentaBancaria cuenta = new CuentaBancaria();
        
        System.out.println("Ingrese el número de cuenta");
        cuenta.setNumeroCuenta(in.nextInt());
        System.out.println("Ingrese su dni");
        cuenta.setDniCliente(in.nextInt());
        cuenta.setSaldoActual(1000);
        
        return cuenta;
        
    }
    
    public double ingresar(CuentaBancaria cuenta){
        System.out.println("Ingrese el importe a depositar");
        double cantidad=in.nextDouble(), saldo=cuenta.getSaldoActual()+cantidad;
        cuenta.setSaldoActual(saldo);
        return saldo;
    }
    
    public double retirar(CuentaBancaria cuenta){
        System.out.println("Ingrese el importe a retirar");
        double cantidad = in.nextDouble(), saldo = cuenta.getSaldoActual();
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente, puede retirar hasta un maximo de "
                    + cuenta.getSaldoActual());
            saldo = 0;
        }
        cuenta.setSaldoActual(saldo);
        return saldo;
    }
    
    public double extraccionRapida(CuentaBancaria cuenta){
        System.out.println("Ingrese el importe a retirar menor a " 
                + (cuenta.getSaldoActual()*0.2));
        double cantidad = in.nextDouble(), saldo = cuenta.getSaldoActual();
        if (cantidad <= (saldo*0.2)) {
            saldo -= cantidad;
        } else {
            System.out.println("Solo puede retirar hasta "
                    + (saldo*0.2));
            saldo -= (saldo*0.2);
        }
        cuenta.setSaldoActual(saldo);
        return saldo;
    }
    
    public void consultarSaldo(CuentaBancaria cuenta){
        System.out.println("Su saldo actual es de " + cuenta.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println("Su numero de cuenta es " 
        + cuenta.getNumeroCuenta()
        + "\nSu dni es " + cuenta.getDniCliente()
        +"\nSu saldo es " + cuenta.getSaldoActual());
    }
    
    public void menu(){
        CuentaBancariaServicio sc1 = new CuentaBancariaServicio();
        CuentaBancaria cuenta = sc1.crearCuenta();
        int opcion;
        do{
         System.out.println("1.Ingresar dinero"
        +"\n2.Retirar dinero"
        +"\n3.Extracción rápida"
        +"\n4.Consultar el saldo"
        +"\n5.Consultar datos"
        +"\n6.Salir");
        opcion=in.nextInt();
        
        switch(opcion){
            case 1:
                sc1.ingresar(cuenta);
                break;
            case 2:
                sc1.retirar(cuenta);
                break;
            case 3:
                sc1.extraccionRapida(cuenta);
                break;
            case 4:
                sc1.consultarSaldo(cuenta);
                break;
            case 5: 
                sc1.consultarDatos(cuenta);
                break;
            case 6:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("Opcion no valida");
        }
        
        }while(opcion!=6);
    }
    
    
}
