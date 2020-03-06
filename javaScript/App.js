


const Pet = require ('./Pet.js');
const Person = require('./Person.js');

const scooby = new Pet ("Scooby Doo", "Good boi");
scooby.eat("Scooby Snacks");

const shaggy = new Person ("Shaggy Rogers", 100, scooby);
var output = shaggy.name.fontcolor("Blue");

shaggy.greet();

shaggy.feedPet("Scooby Snacks");


// Assign a pet property in the Person constructor via a parameter
// Add a feedPet method to Person.prototype which:
// Accepts a food parameter
// Outputs a string containing the person and pet's names and the food. For example: 'Shaggy Rogers fed Scooby Doo a Scooby Snack'
// Invokes the pet's eat method and passes the food to it
