/*Resalte todas las palabras de más de 8 caracteres en el texto del párrafo (con un fondo
amarillo, por ejemplo  */ 


const texto = document.getElementById("parrafo"); // Obtiene el elemento con ID "parrafo" y lo almacena en la variable "texto".
const palabras = texto.textContent.split(/\s+/); // Divide el contenido de texto en palabras y las almacena en el arreglo "palabras".

const fragmento = document.createDocumentFragment(); // Crea un fragmento de documento vacío en memoria.

for (const palabra of palabras) { // Comienza un bucle que recorre cada palabra en el arreglo "palabras".
    const palabraResaltada = document.createElement("span"); // Crea un nuevo elemento <span> y lo almacena en la variable "palabraResaltada".
    palabraResaltada.textContent = palabra; // Establece el contenido de texto del <span> creado como la palabra actual.

    if (palabra.length > 8) { // Verifica si la longitud de la palabra actual es mayor a 8 caracteres.
                palabraResaltada.className = "amarillo"; // Agrega la clase "amarillo" al <span> si la palabra cumple con la condición.
    }

    fragmento.appendChild(palabraResaltada); // Agrega el <span> al fragmento.
    fragmento.appendChild(document.createTextNode(" ")); // Agrega un espacio en blanco al fragmento.
}

texto.innerHTML = ""; // Limpia el contenido original del elemento "texto".

texto.appendChild(fragmento); // Agrega el contenido del fragmento al elemento "texto".
