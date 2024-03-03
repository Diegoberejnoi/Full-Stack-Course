const crearArrayA=()=>{
    let A=[];
    for (let index = 0; index < 50; index++) {
        A[index]=Math.round(Math.random()*10*100)/100;        
    }
    
    return A;
}
const crearArrayB=()=>{
    let B=[];
    for (let index = 0; index < 20; index++) {
        B[index]=Math.round(Math.random()*10*100)/100;        
    }    
    return B;
}
let arrayA=crearArrayA();
let arrayB=crearArrayB();

document.write(`Array A: 
${arrayA}
Array B: 
${arrayB}
`);

arrayA=arrayA.sort();
document.write(`Array A ordenado de menor a mayor: ${arrayA}`);


 arrayB=arrayB.sort();
 arrayA.splice(0,20,arrayB);
 arrayA.splice(-10,arrayA.length,Array(10).fill(0.5));

 document.write(`Array B ordenado:
 ${arrayB},

 Array A Alterado:
 ${arrayA}`);