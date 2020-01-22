// class BeeKeeper {
//     hasMask: boolean;
// }
// class ZooKeeper {
//     nametag: string;
// }
// class Animal {
//     numLegs: number;
// }
// class Bee extends Animal {
//     keeper: BeeKeeper;
// }
// class Lion extends Animal {
//     keeper: ZooKeeper;
// }
// function createInstance<A extends Animal>(c: new () => A): A {
//     return new c();
// }
// createInstance(Lion).keeper.nametag;  // typechecks!
// createInstance(Bee).keeper.hasMask;   // typechecks!
function identity(arg) {
    return arg;
}
console.log(identity);
function getProperty(obj, key) {
    return obj[key];
}
var x = { a: 1, b: 2, c: 3, d: 4 };
getProperty(x, "a"); // okay
getProperty(x, "a"); // error: Argument of type 'm' isn't assignable to 'a' | 'b' | 'c' | 'd'.
