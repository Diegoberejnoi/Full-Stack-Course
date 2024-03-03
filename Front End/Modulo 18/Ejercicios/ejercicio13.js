var persona1 = {

    "nombre": "Diego",
    "apellido": "Berejnoi",
    "edad": 28,
    "sexo": "hombre",
    "peso": 71.0,
    "altura": 1.75
};

alert(JSON.stringify(persona1));

var persona2 = new Object();

persona2.nombre = "Marcelo";
persona2.apellido = "Oviedo";
persona2.edad = 45;
persona2.sexo = "hombre";
persona2.peso = 92;
persona2.altura = 1.80;

persona2.toString = () => persona2.nombre + " " + persona2.apellido;

alert(persona2.toString());

function Persona(nombre, apellido, edad) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.toString = () => this.nombre + " " + this.apellido + " " + this.edad;
}

var persona3 = new Persona("Eduardo", "Mendez", 39);

alert(persona3.toString());

class ClasePersona {
    constructor(nombre, apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    toString() {
        return this.nombre+" "+ this.apellido;
    }
}

var p4 = new ClasePersona("Hugo", "Saa");
alert(p4);
