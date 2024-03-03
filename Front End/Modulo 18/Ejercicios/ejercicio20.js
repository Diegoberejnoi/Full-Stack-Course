let array=[3,6,9,12,15];
array=array.map(function(i){
    return [i];
});

console.log(array);

array=array.flatMap(function(x){
    return parseInt(x)+3;
});
console.log(array);