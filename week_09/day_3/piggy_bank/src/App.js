import React from 'react';
import PiggyBank from "./PiggyBank"; // single or double quote doesnt matter


function App() {
  return ([
    <PiggyBank
      title = "Claudia's Savings Pig"
      depositAmount ={1000}
      withdrawAmount = {50}/>

  ]);
}

export default App;
