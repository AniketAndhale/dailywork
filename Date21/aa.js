// var arr= new Array(10) 
// for(var i = 0;i<arr.length;i++) {
//     return
// }
// function isBigEnough(element, index, array) { 
//     return ((element%2==0) && (element%5==0)); 
//  } 
//  var passed = [12, 5, 8, 130, 44].filter(isBigEnough); 
//  console.log("Test Value : " + passed );  

var arr =new Array(10);
for(let index=0;index<arr.length;index++)
{
    arr[index]=Math.floor(Math.random()*100)
}
let div =arr.filter((x)=>x%2==0 && x%5==0)
let inc=arr.map((x)=>parseInt(x*1.1))
console.log(div);
console.log(inc);
var filter=()=>{
for(let index of arr)
{
    if(index%2==0&&index%5==0)
    console.log(index);
}
}
filter();

var map=()=>{
for(let index of arr)
{
    arr[index]=Math.floor(arr[index]*1.1);
    console.log(index);
}
}
map();

