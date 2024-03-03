
package Entidades;

import Excepciones.DispositivoDaniado;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ArmaduraIron extends Armadura{
    private float energia; //amperio*hora
    private String colorPrim, colorSec;
    private Bota botaDer, botaIzq;
    private Guante guanteDer,guanteIzq;
    private Casco casco;

    
    public ArmaduraIron(float energia, String colorPrim, String colorSec, Bota botaDer, Bota botaIzq, Guante guanteDer, Guante guanteIzq, Casco casco) {
        this.energia = energia;
        this.colorPrim = colorPrim;
        this.colorSec = colorSec;
        this.botaDer = botaDer;
        this.botaIzq = botaIzq;
        this.guanteDer = guanteDer;
        this.guanteIzq = guanteIzq;
        this.casco = casco;
    }

    public ArmaduraIron(float energia, String colorPrim, String colorSec, Bota botaDer, Bota botaIzq, Guante guanteDer, Guante guanteIzq, Casco casco, float salud, int dureza) {
        super(salud, dureza);
        this.energia = energia;
        this.colorPrim = colorPrim;
        this.colorSec = colorSec;
        this.botaDer = botaDer;
        this.botaIzq = botaIzq;
        this.guanteDer = guanteDer;
        this.guanteIzq = guanteIzq;
        this.casco = casco;
    }

    public ArmaduraIron() {
        super(100,2);
        energia=Float.MAX_VALUE;
        botaDer=new Bota();
        botaIzq=new Bota();
        guanteDer=new Guante();
        guanteIzq=new Guante();
        casco=new Casco(new Sintetizador(), new Consola());
    }

    public String mostrarInformacionArmadura() {
        String mensaje="Estado del traje:\n";
        
        float porcentajeEnergia=(energia/Float.MAX_VALUE)*100;
        
        mensaje+="Energía del traje: "+porcentajeEnergia+"%\n";
        mensaje+="Consola: " + casco.getConsola().toString()+"\n";
        mensaje+="Sintetizador: " + casco.getSintetizador().toString()+"\n";
        mensaje+="Guante Derecho: " + guanteDer.toString()+"\n";
        mensaje+="Guante Izquierdo: " + guanteIzq.toString()+"\n";
        mensaje+="Bota Derecho: " + botaDer.toString()+"\n";
        mensaje+="Bota Izquierdo: " + botaIzq.toString()+"\n";
        mensaje+="-----------------";
        return mensaje;
    }
    
    public String estadoBateria(){
        return "Energía del traje: "+((energia/Float.MAX_VALUE)*100)+"%";
    }
    
    public String estadoReactor(){
        String mensaje="Carga del reactor:\n";
        mensaje+=energia+" Amper por hora\n";
        mensaje+=(energia/1000)+" Kilo Amper por hora\n";
        mensaje+=(energia/3600)+" Columbio\n";
        return mensaje;
        
    }
    
    
    public float caminar(int segundos){
        float gasto=0f;
        try {
            gasto=(botaIzq.usarDispositivo(segundos,1)+botaDer.usarDispositivo(segundos,1));
        } catch (DispositivoDaniado e) {
            System.out.println(e.getMessage());
        } finally {
            return gasto;
        }
        
    }
    
    public float correr(int segundos){
        float gasto=0f;
        try {
            gasto=(botaIzq.usarDispositivo(segundos,2)+botaDer.usarDispositivo(segundos,2));
        } catch (DispositivoDaniado e) {
            System.out.println(e.getMessage());
        } finally {
            return gasto;
        }
        
    }
    
    public float propulsarse(int segundos){
        float gasto=0f;
        try {
            gasto=(botaIzq.usarDispositivo(segundos,3)+botaDer.usarDispositivo(segundos,3));
        } catch (DispositivoDaniado e) {
            System.out.println(e.getMessage());
        } finally {
            return gasto;
        }
        
    }
    
    public float volar(int segundos) {
        float gasto = 0f, consumoBotas, consumoGuantes;

        try {
            consumoBotas = botaIzq.usarDispositivo(segundos, 3) + botaDer.usarDispositivo(segundos, 3);
            consumoGuantes = guanteDer.usarDispositivo(segundos, 2) + guanteIzq.usarDispositivo(segundos, 2);
            gasto = consumoBotas + consumoGuantes;
        } catch (DispositivoDaniado e) {
            System.out.println(e.getMessage());
        } finally {
            return gasto;
        }

    }
    
    public float dispararIzq(int segundos){
         float gasto=0f;
        try {
            gasto=guanteIzq.usarDispositivo(segundos, 3);
        } catch (DispositivoDaniado e) {
            System.out.println(e.getMessage());
        }
            return gasto;
        
       
    }
    public float dispararDer(int segundos){
          float gasto=0f;
        try {
            gasto=guanteDer.usarDispositivo(segundos, 3);
        } catch (DispositivoDaniado e) {
            System.out.println(e.getMessage());
        } 
            return gasto;
      
        
    }
    public float dispararAmbos(int segundos) {
        float gasto = 0f;
        gasto = dispararIzq(segundos) + dispararDer(segundos);
        return gasto;


    }
    
    public float escribir(){
          float gasto=0f;
        try {
            gasto=casco.getConsola().usarDispositivo(1,1);
        } catch (DispositivoDaniado e) {
            System.out.println(e.getMessage());
        } finally {
            return gasto;
        }
       
    }
    public float escuchar(){
          float gasto=0f;
        try {
            gasto=casco.getSintetizador().usarDispositivo(1,1);
        } catch (DispositivoDaniado e) {
            System.out.println(e.getMessage());
        } finally {
            return gasto;
        }
        
    }
    
    public void repararDispositivos(){
        if(casco.getConsola().isDaniado()&&!casco.getConsola().isDestruido()){
            casco.getConsola().repararDispotivo();
        }
        if(casco.getSintetizador().isDaniado()&&!casco.getSintetizador().isDestruido()){
            casco.getSintetizador().repararDispotivo();
        }
        if(guanteDer.isDaniado()&&!guanteDer.isDestruido()){
            guanteDer.repararDispotivo();
        }
        if(guanteIzq.isDaniado()&&!guanteIzq.isDestruido()){
            guanteIzq.repararDispotivo();
        }
        if(botaDer.isDaniado()&&!botaDer.isDestruido()){
            botaDer.repararDispotivo();
        }
        if(botaIzq.isDaniado()&&!botaIzq.isDestruido()){
            botaIzq.repararDispotivo();
        }

    }
    public float calcularDistancia(Ovni ovni){
            int X2 = (int) Math.pow(ovni.X, 2);
            int Y2 = (int) Math.pow(ovni.Y, 2);
            int Z2 = (int) Math.pow(ovni.Z, 2);
            return(float) Math.sqrt((X2 + Y2 + Z2));
    }

    public void radar(ArrayList<Ovni> listaObjetos) {
        int tamanio=(listaObjetos.size()<10)?listaObjetos.size():10;
        for (int i = 0; i < tamanio; i++) {
            float distancia=calcularDistancia(listaObjetos.get(i));
            String hostilidad = (listaObjetos.get(i).isHostil()) ? "es hostil" : "no es hostil";
            System.out.println("La distancia del objeto " + (i + 1)
                    + " es de " + distancia + " metros"
                    + "\nel objeto " + hostilidad);
        }

    }
    
    public ArrayList<Ovni> simulacion(){
        ArrayList<Ovni> listadoEnemigos= new ArrayList();
        int numeroEnemigos=(int)(Math.random()*15);
        for (int i = 0; i < numeroEnemigos; i++) {
            listadoEnemigos.add(new Ovni());
        }        
        return listadoEnemigos;
    }
    
    public void dispararEnemigos(ArrayList<Ovni> listaObjetos){
        for (int i = 0; i < listaObjetos.size(); i++) {
            if(listaObjetos.get(i).isHostil()){
               float distancia=calcularDistancia(listaObjetos.get(i));
               if(distancia<5000){
                    int vida;
                    float porcentajeBateria;
                    do {
                        porcentajeBateria=(energia/Float.MAX_VALUE);
                        vida = listaObjetos.get(i).resistencia;
                        if (!guanteDer.isDaniado() && !guanteDer.isDestruido() && !guanteIzq.isDaniado() && !guanteIzq.isDestruido() && porcentajeBateria>0.1) {
                            energia -= dispararAmbos(1);
                            vida -= 2 * (5000 - distancia);
                        } else if (!guanteDer.isDaniado() && !guanteDer.isDestruido() && porcentajeBateria>0.1) {
                            energia -= dispararDer(1);
                            vida -= (5000 - distancia);
                        } else if (!guanteIzq.isDaniado() && !guanteIzq.isDestruido() && porcentajeBateria>0.1) {
                            energia -= dispararIzq(1);
                            vida -= (5000 - distancia);
                        } else if(porcentajeBateria<=0.1 ||(guanteDer.isDestruido()&&guanteIzq.isDestruido())){
                           energia-=volar(120);
                           break;
                        }else{
                            repararDispositivos();
                        }
                        listaObjetos.get(i).setResistencia(vida);

                    } while (vida > 0);
                    
                   if (porcentajeBateria <= 0.1) {
                       break;
                   }

            }
            
        }
    }
}
    public void menu(){
        int op, segundos;
        ArrayList<Ovni> ovnis=new ArrayList();
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        do {            
            System.out.println("Menú Principal"
                    + "\n1.Caminar"
                    + "\n2.Correr"
                    + "\n3.Propulsar"
                    + "\n4.Volar"
                    + "\n5.Información del traje"
                    + "\n6.Información de la bateria"
                    + "\n7.Información del reactor"
                    + "\n8.Reparar"
                    + "\n9.Simulación"
                    + "\n10.Activar combate"
                    + "\n11.Radar"
                    + "\n12.Salir");
            op=in.nextInt();
            in.nextLine();
            switch(op){
                case 1:
                    System.out.println("Cuantos segundos?");
                    segundos=in.nextInt();
                    in.nextLine();
                    energia-=caminar(segundos);
                    break;
                case 2:
                    System.out.println("Cuantos segundos?");
                    segundos=in.nextInt();
                    in.nextLine();
                    energia-=correr(segundos);
                    break;
                case 3:
                    System.out.println("Cuantos segundos?");
                    segundos=in.nextInt();
                    in.nextLine();
                    energia-=propulsarse(segundos);
                    break;
                case 4:
                    System.out.println("Cuantos segundos?");
                    segundos=in.nextInt();
                    in.nextLine();
                    energia-=volar(segundos);
                    break;
                case 5:
                    System.out.println(mostrarInformacionArmadura());
                    break;
                case 6:
                    System.out.println(estadoBateria());
                    break;
                case 7:
                    System.out.println(estadoReactor());
                    break;
                case 8:
                    repararDispositivos();
                    break;
                case 9:
                    ovnis=simulacion();
                    break;
                case 10:
                    dispararEnemigos(ovnis);
                    break;
                case 11:
                    radar(ovnis);
                    break;
                case 12:
                    System.out.println("Muchas gracias por usar el traje");
                    break;

                    
            }
            
        } while (op!=12);
    }
}



