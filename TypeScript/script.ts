// how to declare a variable in TypeScript


let me : number =5;

let myName :string = "Anas";

// how to declare an object 

// this is the first way 
const user:{name:string ; age:number}={
    name:"Anas",
    age:25,
}
§
// this is the scond way using interfae 

interface User{
    name:string;
    age:number;
    id :number;
}

const user2:User={
    name:"Anas hawwash",
    age:20,
    id:1,
}


// now let me talk about the functions


// as you can see after the () in the function we can declear the return type of the function
function SumAB(a:number,b:number):number{
    return 20;
}

// but if we dont want to declare the return type of the function we can just ignore it and it will be set for void
function Sum(a:number,b:number){

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
    name:string,
}

interface player{
    age:number,
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
    name:string,
    Model:number,
    color:string,
}

// Union types (interface CANNOT do this)
type Status = "loding" | "success" | "error";
// so status should be one of these three values only
type Boo = true | false;

// Intersection types (interface CANNOT do this)

// here for example we will create a new type called Admin 
// it will have all the User properties plus a new property called role
type Admin = User & {
  role: "admin";
};



// it also can be used to define the function signature

// for example 
type Add = (a: number, b: number) => number;
// this is a type that represents a function that takes two numbers and returns a number

// now we can use this type to declare a function
const add: Add = (a, b) => {
  return a + b;
};




// i wanna talk about somethign called typeof 
// we can use it to cheack the type of a variable like so
let username:String  = "Anas Hawwash";

function justCheckType(variable:String){
    if(typeof variable === "string"){
        // you can do something here
    }else{
        // you can do something here
    }
}


justCheckType(username);



// let us talk about generics____________________________

// Generics let you write code that works with many types and also have the safty 

// gererics function example
function identity<T>(value: T): T {
  return value;
}
// here T is a placeholder for any type
// when we call the function we can specify the type we want to use

identity<string>("Hello World");
identity<number>(42);


// example for generics function with array parameter
function getFirstElement<T>(arr: T[]): T | undefined {
  return arr[0];  
}  
getFirstElement([1,2,3,4]);
getFirstElement(["a","b","c"]);


// generics Interfaces example 
interface ApiResponse<T> {
  data: T;
  success: boolean;
}
const response: ApiResponse<User> = {
  data: { age: 25, name: "Hayes", id: 1 },
  success: true
};







