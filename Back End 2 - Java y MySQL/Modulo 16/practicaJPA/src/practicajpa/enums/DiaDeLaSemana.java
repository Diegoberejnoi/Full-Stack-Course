package practicajpa.enums;


public enum DiaDeLaSemana {
    
    LUNES(1),
    MARTES(2),
    MIERCOLES(3),
    JUEVES(4),
    VIERNES(5),
    SABADO(6),
    DOMINGO(7);
    
    final int numero;
    
    private DiaDeLaSemana(int num){
        this.numero = num;
    }
    
}
