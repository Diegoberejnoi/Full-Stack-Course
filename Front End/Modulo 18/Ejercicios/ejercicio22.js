document.addEventListener("DOMContentLoaded", function(){
const boton=document.querySelector(".btn");
let mensaje=document.querySelector(".mensaje")
boton.addEventListener("click",()=>{
    mensaje.textContent+="hola";
    
})
});