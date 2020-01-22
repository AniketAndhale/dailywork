"use strict";
// function add(p:string,q:string):string
exports.__esModule = true;
// function  add(x:number,y:number):number
// function add(e:number,f:string):any
// function add(num1:any, num2:any){
//     return num1 + num2 
// }
// var concat = add("aniket","andhale");
// console.log(concat);
// var sum = add(10,20);
// console.log(sum);
// var sub = add(2,'aniket')
// console.log(sub);
// var r=[1,2,3,4,5]
// r.push(6);
// console.log(r);
// r.pop()
// console.log(r);
var Employee = /** @class */ (function () {
    function Employee(id, name, dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }
    return Employee;
}());
exports.Employee = Employee;
var employee = new Employee(101, 'aniket', new Date());
console.log('DAte of Birth  : ' + employee.dob);
console.log(employee);
