function Persona(nombre, edad, sexo){
    this.nombre=nombre;
    this.edad=edad;
    this.sexo=sexo;
}

let persona=new Persona("Diego", 28, "H");
let array=[];
for (let atributo in persona) {
    array.push(persona[atributo]);
};

document.write(array);