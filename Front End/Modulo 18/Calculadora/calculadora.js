
var op="";

function agregarElemento(boton, op){

    if(boton=="+" ||boton=="-" ||boton=="*" ||boton=="/"){
        op+=" " + boton + " ";
    }else{
        op+=boton;
    }
    document.getElementById("resultadoTexto").innerHTML = op;
    return op;
    
}

 function operar(op){
    let arreglo = op.split(" ");

    // Primero, resolvemos las multiplicaciones y divisiones
  for (let i = 0; i < arreglo.length; i++) {
    if (arreglo[i] === "*") {
      arreglo.splice(i - 1, 3, parseFloat(arreglo[i - 1]) * parseFloat(arreglo[i + 1]));
      i--; // Retrocedemos para reevaluar el nuevo arreglo
    } else if (arreglo[i] === "/") {
      arreglo.splice(i - 1, 3, parseFloat(arreglo[i - 1]) / parseFloat(arreglo[i + 1]));
      i--; // Retrocedemos para reevaluar el nuevo arreglo
    }
  }
  
  // Luego, resolvemos las sumas y restas
  let resultado = parseFloat(arreglo[0]);
  for (let i = 1; i < arreglo.length; i += 2) {
    if (arreglo[i] === "+") {
      resultado += parseFloat(arreglo[i + 1]);
    } else if (arreglo[i] === "-") {
      resultado -= parseFloat(arreglo[i + 1]);
    }
  }
  document.getElementById("resultadoTexto").innerHTML = resultado;
  console.log=resultado;
 };  

 for (let i = 0; i <= 9; i++) {
    document.getElementById(String(i)).addEventListener("click", function() {
        op = agregarElemento(String(i), op);
    });
}

document.getElementById("punto").addEventListener("click", function() {
    op = agregarElemento(".", op);
});

document.getElementById("mas").addEventListener("click", function() {
    op = agregarElemento("+", op);
});

document.getElementById("menos").addEventListener("click", function() {
    op = agregarElemento("-", op);
});

document.getElementById("mult").addEventListener("click", function() {
    op = agregarElemento("*", op);
});

document.getElementById("div").addEventListener("click", function() {
    op = agregarElemento("/", op);
});

document.getElementById("igual").addEventListener("click", function() {
    operar(op);
    op="";
});

// Manejar eventos de teclado
document.addEventListener("keydown", function(event) {
  const tecla = event.key;
  if (/^[0-9+\-*/.]$/.test(tecla)) {
      event.preventDefault(); // Evitar acciones por defecto
      op = agregarElemento(tecla, op);
  } else if (tecla === "Enter") {
      event.preventDefault(); // Evitar acciones por defecto
      operar(op);
      op="";
  }
});