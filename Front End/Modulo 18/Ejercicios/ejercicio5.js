/*Verificación de ingreso de todos los datos */
try{
var n1 = parseInt(prompt("Ingrese el primer número"));

if(isNaN(n1)){throw "miExcepcion";}
var n2 = parseInt(prompt("Ingrese el segundo número"));

if(isNaN(n1)){throw "miExcepcion";}
var op = prompt("Ingrese la operación que desea realizar (S,R,M,D)").toUpperCase();

if(op=="" || op ==" ") {throw "miExcepcion";}
}catch(e){
    console.error("Error de algun tipo que desconocemos")
};

/*Verificación de ingreso correcto de la operación a realizar */
function verificador(op) {
    return (op == "S" || op == "R" || op == "M" || op == "D");
};
/*Funcion para calcular*/
function calculadora(n1, n2, op) {
    var mensaje;
    try{
        if(n2==0 && op=="D"){
            throw "miExcepcion";
        }
        if (verificador(op)) {
            switch (op) {
                case "S":
                    mensaje = n1 + n2;
                    break;
                case "R":
                    mensaje = n1 - n2;
                    break;
                case "M":
                    mensaje = n1 * n2;
                    break;
                case "D":
                    mensaje = n1 / n2;
                    break;
            }}
            mensaje=`${n1} ${(op=="S")?"+":(op=="R")?"-":(op=="M")?"*":"/"} ${n2} = ${mensaje}`;
    } catch{
        mensaje="Operación indefinida, no se puede dividir por 0";
    }finally{
        return mensaje;
    }
    

};

/*Mensaje por pantalla */
alert(`El resultado de la operacion es ${calculadora(n1,n2,op)}`);
console.log(calculadora(n1,n2,op));