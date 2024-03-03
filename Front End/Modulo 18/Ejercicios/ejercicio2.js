var radio=prompt("Ingrese el radio de la circunferencia");

function calcularPerimetro(radio){
    return radio*2*Math.PI;
};
function calcularArea(radio){
    return Math.pow(radio,2)*Math.PI;
};

alert(`El circulo de radio ${radio} tiene un perímetro de ${calcularPerimetro(radio)} y un área de ${calcularArea(radio)}`);