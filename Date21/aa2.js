// const promise=new Promise(function(resolve,reject){
//     setTimeout(resolve,5000)

// })
// promise.then(function(){
//     console.log('this is done');
// })
// promise.then(function(){
//     console.log('this is done');
// })

// var asynchronousFunction = function(){
//     return new Promise(function (resolve,reject){
//         console.log(' keep every promise you make and only make promises that you can keep');
//     setTimeout(resolve,5000);
// })
// }
// asynchronousFunction()
// .then(asynchronousFunction)
// .then(asynchronousFunction)


// const mypromise = new Promise((resolve, reject) => {
//     if (Math.random() * 100 <= 90) {
//         resolve("hello promises");
//     }
//     reject(new Error("in 10% of the case i fail"));
// });
// const onResolved = (resolvedvalue) => console.log(resolvedvalue);
// const onRejected = (error) => console.log(error);
// mypromise.then(onResolved, onRejected);


 