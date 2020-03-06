document.addEventListener('DOMContentLoaded', () => {
  console.log('JavaScript has loaded');

  const button = document.querySelector("#button");
  button.addEventListener('click', handleButtonClick);

  const textInput = document.querySelector("#input");
  textInput.addEventListener('input', handleInput);

  const select = document.querySelector("#select");
  select.addEventListener('change', handleSelect);

  const form = document.querySelector("#form");
  form.addEventListener('submit', handleForm);

});

const handleButtonClick = function (){
  console.log('Button has been clicked');
  const resultParagraph = document.querySelector('#button-result');
  resultParagraph.textContent = 'That button has definitely been clicked.';

}

const handleInput = function (event){
  // console.log("input has been typed");
  console.log(event);
  const resultParagraph = document.querySelector('#input-result');
  const printOut = event.target.value;
  resultParagraph.textContent = printOut;

}

const handleSelect = function (event){
  // console.log("input has been typed");
  console.log(event);
  const resultParagraph = document.querySelector('#select-result');
  if(event.target.value == "Definitely Yes"){
    resultParagraph.textContent = "Thanks for choosing " +event.target.value +" and accepting my love!";
  }else if (event.target.value == "Ok, Maybe"){
    resultParagraph.textContent = "stop being so indecisive!";
  }else if (event.target.value == "Absolutely Not"){
    resultParagraph.textContent = "BOOOOOOOOOO";
  }else{resultParagraph.textContent == "HURRY PICK ONE";
  }

}

const handleForm = function (event){
  event.preventDefault();
  // console.log(event.target.first_name.value);
  const resultParagraph = document.querySelector('#form-result');
  // const printOut = event.target.value;
  resultParagraph.textContent =
  `Your name:
    ${event.target.first_name.value}
    ${event.target.last_name.value}  `;

}
