let libro = document.querySelector(".texto");
let arreglo = libro.textContent.split(" ");
for (let i = 0; i < arreglo.length; i++) {
    if (arreglo[i].length >= 8) {
        arreglo[i] = `<span style="background-color: yellow;">${arreglo[i]}</span>`;
    }
}

libro.innerHTML = arreglo.join(" ");
