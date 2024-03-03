package practicajpa;

import practicajpa.services.ServiciosGenerales;

public class PracticaJPA {

  
    public static void main(String[] args) throws Exception{
        ServiciosGenerales serviciosGenerales =  new ServiciosGenerales();
        serviciosGenerales.cargarBase();
        serviciosGenerales.consultas();
    }
    
}
