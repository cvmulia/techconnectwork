const myNumbers = [1,2,3,4,5];

// for(let number of myNumbers){
//   console.log(`This is my numbers: ${myNumbers}`);
// }
//
// myNumbers.forEach((number, index)=>{
//   console.log(`This is number ${number} at index position ${index}`);
// })
//
// const multiplyByTwo = function(numbers){
//   const result = [];
//
// numbers.forEach((number) =>{
//   const multiplied = number *2;
//   result.push(multiplied);
//
// })
//
//
//   return result;
// }
// console.log(multiplyByTwo(myNumbers));


// const multiplyByTwo = function (numbers){
//   const result = numbers.map((number)=>{ // map makes the array automatically
//     return number * 2; // return is the push for map function
//   })
//   return result;
// }
// console.log(multiplyByTwo(myNumbers));
//
// const getEvens = function (numbers){
//   const result = numbers.filter((number)=>{
//     return number % 2 === 0;
//   });
//   return result;
// }
//
// console.log(getEvens(myNumbers));

const sumElements = function(numbers){
  const total = numbers.reduce((runningTotal, number)=>{
    return runningTotal + number;
  },0); // 0 is the initial value of runningTotal

  return total;
}
console.log(sumElements(myNumbers));
