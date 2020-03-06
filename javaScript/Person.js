const Pet = require ('./Pet.js');


const Person = function(name, wallet, Pet){
  this.name = name;
  this.Pet = Pet;
  // this.greet = function(){
  //   console.log(`Hi, my name is ${this.name}`);
  // }
}

Person.prototype.greet = function(){
  console.log(`Hi, my name is ${this.name}`);
}

Person.prototype.feedPet = function(food){

  console.log(`${this.name} is giving ${this.Pet.name} ${food} as a treat.`);
    this.Pet.eat(food);
}

// const KiteFlyer
//
//
//
//
// const shaggy = new Person("Shaggy Rogers",100);
//
// console.log("Shaggy: ", shaggy.name);
// shaggy.greet();
//
// const velma = new Person("Velma Dinkley")
// velma.greet();

module.exports = Person;
 // safe memory by using prorotype of the constructor
