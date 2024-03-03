
/*Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el 
programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de 
todos ellos.*/

var num;
var max;
var min;
var suma;
var cont=0;

 do{
    num = parseFloat(prompt("Ingrese un numero"));    
    if(cont==0){
        max=num;
        min=num;
        suma=num;
        cont++;
        continue;
     }
     if(num!=0){
        suma+=num;
        cont++;
        max=Math.max(num,max);
        min=Math.min(num,min);
     }   

}while (num!=0)

let promedio = suma/cont;
alert(`El maximo numero es ${max}
, el minimo es ${min} 
y el promedio es ${promedio}
suma: ${suma}
cont: ${cont}`);