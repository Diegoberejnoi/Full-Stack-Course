var edad=prompt("Ingrese su edad");

function verificador(edad){ 
return (edad>=18)?"Usted es mayor de edad, puede continuar":"Usted es menor de edad, no puede continuar";
};

alert(verificador(edad));