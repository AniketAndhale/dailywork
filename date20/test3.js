var company = { 
    firscomp:"cts", 
    seccomp:"tcs",
    thirdcomp:"info",
    func:function(){return "which comapany better"},    
 }; 
 console.log(company.func())
 console.log(company.firscomp)   
console.log(company.seccomp) 
console.log(company.thirdcomp)
console.log('                                          next program                                              ');

/////////////////////////////////////
var ani = 'and' 
var sir = { ani } 
console.log(sir.ani)
console.log('                                          next program                                                                  ');
///////////////////////////////////////
var college = new Object(); 
college.name = "AVCOE"; 
college.start = 1983; 
college.city= "Sangamner";  

console.log(college["name"]) 
console.log(college["start"]) 
console.log(college["city"])
console.log('******************************next program*******************************************************');
function Arich()
{
    this.class="devops"
    this.teacher="pankaj"
}
var a = new Arich()
console.log(a.class);
console.log('a.teacher');