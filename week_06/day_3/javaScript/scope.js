console.log(sayHello("Steve"));


var name = "Steve";


function sayHello (name){
  return `Hello ${name}!`
}

var add = function(firstNumber, secondNumber){
  return firstNumber + secondNumber
}

console.log(add(1,3));

// ARROW FUNCTION

var multiply = (firstNumber, secondNumber) => {
  return firstNumber*secondNumber;
}

console.log(multiply(2,3));
