var clima= document.getElementById("1");

function agregar(clima){

    let parrafo=document.getElementById("2");
    parrafo.innerHTML += `+ ${clima}`;    

}

agregar(clima);
