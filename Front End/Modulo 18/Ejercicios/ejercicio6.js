let ispar = (numero) => ((numero===0)?"El numero no es par ni impar":(numero%2==0)?`${numero} es par`:`${numero} es impar`);
var n = parseInt(prompt("Ingrese un número"));
alert(ispar(n));