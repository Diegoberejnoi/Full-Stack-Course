
/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere el 
límite inicial*/

let limite = parseFloat(prompt("Ingrese un limite positivo"));
let numero=0;

do {
    numero += parseFloat(prompt("Ingrese un numero"));
} while (numero<=limite);

alert("Supero el limite inicial");