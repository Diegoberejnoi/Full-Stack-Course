/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Cliente;
import Entidades.Cuota;
import Entidades.Poliza;
import Entidades.Vehiculo;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class PolizaServicio {

    private ArrayList<Poliza> listaPolizas;
    private Scanner in;

    public void arrancarBasedeDatos() {
        listaPolizas = new ArrayList();
        in = new Scanner(System.in).useDelimiter("\n");
    }

    //como iniciar polizas ingresando clientes, sus respectivos vehiculos y en cuantas cuotas
    
    public void nuevaPoliza() {

        Cliente cliente = crearCliente();
        Vehiculo vehiculo = crearVehiculo();
        System.out.print("Ingrese el número de la nueva Poliza: ");
        Integer numeroPoliza = in.nextInt();
        in.nextLine();
        Date fechaInicio = new Date();
        Date fechaVencimiento = crearFechaVencimientoPoliza();
        Cuota cuota = crearCuota(fechaInicio);
        System.out.print("Ingrese el valor del vehículo: ");
        Double montoTotalAsegurado = in.nextDouble() * 0.70;
        in.nextLine();
        System.out.print("¿Incluye cobertura por daño de granizo? s/n: ");
        boolean incluyeGranizo = Character.toLowerCase(in.next().charAt(0)) == 's';
        Double montoMaximoGranizo = incluyeGranizo ? montoTotalAsegurado * 0.15 : 0;
        System.out.print("Ingrese el tipo de cobertura: ");
        String tipoCobertura = in.next();
        Poliza poliza = new Poliza(cliente, vehiculo, numeroPoliza, fechaInicio,
                fechaVencimiento, cuota, montoTotalAsegurado, incluyeGranizo, montoMaximoGranizo, tipoCobertura);
        listaPolizas.add(poliza);

    }

    public Cliente crearCliente() {
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = in.next();
        System.out.print("Ingrese el apellido del cliente: ");
        String apellido = in.next();
        System.out.print("Ingrese el DNI del cliente: ");
        Integer dni = in.nextInt();
        in.nextLine();
        System.out.print("Ingrese el domicilio del cliente: ");
        String domicilio = in.next();
        System.out.println("Ingrese el telefono del cliente: ");
        Integer numeroTelefono = in.nextInt();
        in.nextLine();
        return new Cliente(nombre, apellido, dni, domicilio, numeroTelefono);
    }

    public Vehiculo crearVehiculo() {
        System.out.print("Ingrese la marca del vehículo: ");
        String marca=in.next();
        System.out.print("Ingrese el modelo del vehículo: ");
        String modelo=in.next();
        System.out.print("Ingrese el año del vehículo: ");
        Integer anio=in.nextInt();
        System.out.println("Ingrese el número del moto: ");
        Integer numeroMotor=in.nextInt();
        System.out.print("Ingrese el número del chasis: ");
        Integer chasis=in.nextInt();
        in.nextLine();
        System.out.print("Ingrese el color del vehículo: ");
        String color=in.next();
        System.out.print("Ingrese tl tipo de vehículo (camioneta,sedán, etc.: )");
        String tipo=in.next();

        return new Vehiculo(marca,modelo,anio,numeroMotor,chasis,color,tipo);
    }

    public Date crearFechaVencimientoPoliza() {
        System.out.println("Ingrese la fecha que de vencimiento de la poliza dd/mm/aaaa");
        int dia=in.nextInt();
        int mes=in.nextInt();
        int anio=in.nextInt();
        in.nextLine();
        return new Date(anio-1900,mes-1,dia);
    }

    public Cuota crearCuota(Date fechaInicio) {
        System.out.print("Ingrese el número de cuotas: ");
        Integer numeroDeCuotas=in.nextInt();
        System.out.print("Ingrese el monto de la cuota: ");
        Double montoTotal=in.nextDouble(); 
        in.nextLine();
        int dia=fechaInicio.getDay(), mes=fechaInicio.getMonth(), anio=fechaInicio.getYear();
        
        if(mes==11){
            anio++;
            mes=0;
        }
        
        Date fechaVencimiento=new Date(anio-1900,mes,dia);
        System.out.println("Ingrese la forma de pago: ");
        String formaDePago=in.next();
        return new Cuota(numeroDeCuotas, montoTotal, false, fechaVencimiento,formaDePago);
    }
  
    public boolean cuotaEstaVencida(Date fechaActual, Cuota cuota){
        return fechaActual.compareTo(cuota.getFechaVencimiento())>0;       
    }
    
    public void actualizarFechaVencimientoCuota(Cuota cuotaActualizar){
        Date fechaVencimiento=cuotaActualizar.getFechaVencimiento();
        int anio=fechaVencimiento.getYear(), mes=fechaVencimiento.getMonth();
        if(mes==11){
            anio++;
            mes=0;
            fechaVencimiento.setMonth(mes);
            fechaVencimiento.setYear(anio);
        }else{
            mes++;
            fechaVencimiento.setMonth(mes);
        }
        cuotaActualizar.setFechaVencimiento(fechaVencimiento);
    }
    
    public void pagarCuota(Cuota cuota){
        cuota.setNumeroDeCuotas(cuota.getNumeroDeCuotas()-1);
        actualizarFechaVencimientoCuota(cuota);        
    }
    
    public ArrayList<Integer> buscarPolizasVencidas(){
        Date fechaActual=new Date();
        ArrayList<Integer> polizasVencidas=new ArrayList();
        
        for (int i = 0; i < listaPolizas.size(); i++) {
            Poliza poliza=listaPolizas.get(i);
            if (cuotaEstaVencida(fechaActual,poliza.getCuota())) {
                polizasVencidas.add(poliza.getNumeroPoliza());
            }
        }
        
        if (!polizasVencidas.isEmpty()) {
            System.out.println("Las polizas vencidas son: ");
            for (Integer polizaVencidaId : polizasVencidas) {
                System.out.println(polizaVencidaId);
            }
        } else {
            System.out.println("No hay polizas vencidas");
        }
        return polizasVencidas;
    }
    
    public void eliminarPolizasVencidas(){
        ArrayList<Integer> polizasVencidas = buscarPolizasVencidas();
        if (!polizasVencidas.isEmpty()) {
            for (int i = 0; i < polizasVencidas.size(); i++) {
                for (int j = 0; j < listaPolizas.size(); j++) {
                    if (polizasVencidas.get(i).equals(listaPolizas.get(j).getNumeroPoliza())) {
                        listaPolizas.remove(j);
                        break;
                    }
                }
            }
        }

    }

}
