function laMasLarga(frase){
var palabras=frase.split(' ');
var palabraLarga=palabras[0];
for(let i=1;i<palabras.length;i++){
if(palabraLarga.length<palabras[i].length){
    palabraLarga=palabras[i];
}
};
return palabraLarga;
};

var frase=prompt("Ingrese una frase para seleccionar la palabra más larga");
alert(laMasLarga(frase));