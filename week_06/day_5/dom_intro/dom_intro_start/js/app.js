// console.log("app loaded", window);

document.addEventListener(`DOMContentLoaded`,()=>{
  // const title = document.querySelector(`h1`);
  // title.textContent = ` Java Script says hello world! `

  // const title = document.querySelector('#Steve');
  // // const title = document.querySelector('.Steve');
  const title = document.querySelector('h1');

  const redElement = document.querySelector('.red');
  console.log(redElement);

  const allRedElements = document.querySelector('li');
  console.log(allRedElements);

  const redListItems = document.querySelector('li.red');
  redListItems.textContent = 'RED!!';
  redListItems.classList.add('bold');

  title.textContent = ' Java Script says hello world!';

  
// specify the list id if there are more than 1 newListItem


  const newListItem = document.createElement('li');
  newListItem.textContent = 'Purple';
  newListItem.classList.add('purple');
  const list = document.querySelector('ul');
  list.appendChild(newListItem);


})
