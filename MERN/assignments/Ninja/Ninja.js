class Ninja{
    constructor(name , helth){
        this.name = name
        this.helth = helth
        this.speed = 3
        this.strength = 3
    }
// this function for name
    sayName(){
        console.log(this.name)
    }

    // this a way for the ninja to increas thear helth
    drinkSake(){
        this.helth += 10;
    }

    // this is a way for print all the info about any ninja 
    showStatus(obj){
        console.log(obj)

    }
}

const ninja = new Ninja("anas" , 10)
ninja.showStatus(ninja)