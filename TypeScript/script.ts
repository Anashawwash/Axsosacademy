// how to declare a variable in TypeScript


let me : number =5;

let myName :String = "Anas";

// how to declare an object 

// this is the first way 
const user:{name:String ; age:Number}={
    name:"Anas",
    age:25,
}

// this is the scond way using interfae 

interface User{
    name:String;
    age:Number;
}

const user2:User={
    name:"Anas hawwash",
    age:20,
}


// now let me talk about the functions


// as you can see after the () in the function we can declear the return type of the function
function SumAB(a:Number,b:Number):Number{
    return 20;
}

// but if we dont want to declare the return type of the function we can just ignore it and it will be set for void
function Sum(a:Number,b:Number){

    // you can write any code you want here
    // this function will return void 
    20;
}




// we have two syntaxes for building types:__________------------____________


// first one is using interface

// we just use the interface to defibe the shape of an object

interface Car{
    name:String,
    Model:Number,
    color:String,
}

// this is good for a lot fo reasons 
// 1- we can use extends to extend the interface
// 2- interfaces can be merged Like 
interface player{
    name:String,
}

interface player{
    age:Number,
}
// this will be merged to
// interface player{
//     name:String,
//     age:Number,
// }

// 3- and the interfaces are perfared by the community

// second one is using type alias______________________>--->
// we use type when we need special features and it is
//  more powerful and flexible than an interface.

type Bike={
    name:String,
    Model:Number,
    color:String,
}

// Union types (interface CANNOT do this)
type status = "loding" | "success" | "error";
type Boo = true | false;
// so status should be one of these three values only

// Intersection types (interface CANNOT do this)

// here for example we will create a new type called Admin 
// it will have all the User properties plus a new property called role
type Admin = User & {
  role: "admin";
};



// it also can be used to defibe the function segnature

// for example 
type Add = (a: number, b: number) => number;
// this is a type that represents a function that takes two numbers and returns a number

// now we can use this type to declare a function
const add: Add = (a, b) => {
  return a + b;
};



