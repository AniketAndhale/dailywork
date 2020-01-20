//var name = 'Aniket' 
//var lastname = { name } 
//console.log(lastname.name)
function ciena(){
    console.log("ciena company ")
}
ciena()
/////////////////////
function company()
{
    return"mine  best"
}
var val=company()
console.log(val)
//////////////////////
function number(...params)
{
    console.log(params.length);

}
number();
number(1,2);
number(11,15,105);
/////////////////////////
var func = function(x,y){ return x*y }; 
function product() { 
   var result; 
   result = func(5,20); 
   console.log("The product : "+result) 
} 
product()
///////////////////
var func=new Function("x","y","return x+y;");
function add()
{
    var show;
    show = func(2,7);
    console.log(show)
}
add()
///////////////////////////////////

function factorial(num) { 
    if(num<=0) { 
       return 1; 
    } else { 
       return (num * factorial(num-1)  ) 
    } 
 } 
 console.log(factorial(5)) 

 /////////////////////////////////////////

 var msg = (a) => 10+a
 console.log(msg(45))

 var disp = ()=>console.log("Hello World") 
disp();

 //*********IIFE***************//
 
 var main = function() { 
    (function() { 
       for(var x = 0;x<5;x++) { 
          console.log(x); 
       } 
    })(); 
    console.log(+x); 
 } 
 main();
/////*****************generator function****************************
function* rainbow() {
    yield 'red'; 
    yield 'orange'; 
    yield 'yellow'; 
    yield 'green'; 
    yield 'blue'; 
    yield 'indigo'; 
    yield 'violet'; 
 } 
 for(let color of rainbow()) { 
    console.log(color); 
 }