function verificador(letra){
    var mensaje;
    if(letra.length>1){
        mensaje= "ingrese solo una letra";
    }else{
        switch(letra.toUpperCase()){
            case "S":
            case "N":
                mensaje= "Correcto";
                break;
            default:
                mensaje= "Incorrecto";    
        }
    }
    return mensaje;
};

var l1=prompt("ingrese una letra");

alert((l1.length>1) ? "ingreso mas de una letra": (l1.toUpperCase()=="S" || l1.toUpperCase()=="N") ? "Correcto":"Incorrecto");
console.log(verificador(l1));