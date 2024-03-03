//A partir del siguiente array: var valores = [true, 5, false, "hola", "adios", 2]:
//a) Determinar cual de los dos elementos de texto es mayor
//b) Utilizando exclusivamente los dos valores booleanos del array, determinar los
//operadores necesarios para obtener un resultado true y otro resultado false
// c) Determinar el resultado de las cinco operaciones matemáticas realizadas con los
// dos elementos numéricos

let valores = [true, 5, false, "hola", "adios", 2];

function textos(palabras) {
    let primera = true;
    let masLarga = "";
    palabras.forEach(element => {
        console.log("Adentro del forEach")
        if (typeof element == "string") {
            if (primera) {
                masLarga = element;
                primera = false;
            }
            else {
                if (masLarga.length < element.length) {
                    masLarga = element;
                }
            }
        }
    });
    return masLarga;
}

function operaciones(operacion) {
    var primero = 0;
    var segundo = 0;


    operacion.forEach(element => {
        console.log("Adentro del forEach")
        if (typeof element == "number") {
            if (primero == 0) {
                primero = element;

            }
            else {
                segundo = element;
            }
        }
    });
    var suma = primero + segundo;
    var resta = primero - segundo;
    var multiplicacion = primero * segundo;
    var division = primero / segundo;
    var mod = primero%segundo;
    return [suma,resta,multiplicacion,division,mod];
}


