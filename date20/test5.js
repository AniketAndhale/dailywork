var interval=Number.EPSILON
console.log(interval);
console.log('********************next*********************************');
var interval=Number.MAX_SAFE_INTEGER
console.log(interval);
console.log('************************next******************************');
var interval=Number.MIN_SAFE_INTEGER
console.log(interval);
console.log('************************next******************************');
var interval=Number.MIN_VALUE
console.log(interval);
console.log('************************next******************************');
var interval=Number.MAX_VALUE
console.log(interval);
console.log('************************next******************************');
var interval=Number.NaN
console.log(interval);
console.log('************************next******************************');
var interval=Number.POSITIVE_INFINITY
console.log(interval);
console.log('************************next******************************');
var interval=Number.NEGATIVE_INFINITY
console.log(interval);
console.log('************************next******************************');
console.log('***************STARTED NO METHOD***************************');
var res = Number.isNaN(10); 
console.log(res);  
console.log('*********************next***********************************');
var res = Number.isFinite(10); 
console.log(res);  
console.log('*********************next***********************************');
var res = Number.isInteger(10); 
console.log(res);  
console.log('*********************next***********************************');
var res = Number.parseFloat(3); 
console.log(res);  
console.log('*********************next***********************************');
var num1 = 1225.30 
var val = num1.toExponential(); 
console.log(val)
console.log('*****************next*******************');
var num3 = 177.234 
console.log("num3.toFixed() is "+num3.toFixed()) 
console.log("num3.toFixed(2) is "+num3.toFixed(2)) 
console.log("num3.toFixed(6) is "+num3.toFixed(6)) 
console.log('*****************next*******************');
var num = new Number(10); 
console.log(num.toString()); 
console.log(num.toString(2)); 
console.log(num.toString(8));
console.log('*****************next*******************');
var num = new Number(7.123456); 
console.log(num.toPrecision()); 
console.log(num.toPrecision(1)); 
console.log(num.toPrecision(2));
console.log('*****************next*******************');
var num = new Number(10); 
console.log(num.valueOf());