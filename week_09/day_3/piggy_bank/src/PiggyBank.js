import React, {useState, fragment} from "react";

const PiggyBank = ({title, depositAmount, withdrawAmount}) => {

  const [total, setTotal] = useState(0);

  const deposit = () => {
    setTotal (total + depositAmount);
  }

  const withdraw = () => {
    if(total>withdrawAmount){
    setTotal (total - withdrawAmount)
  }else{let message = "Not enought money to withdraw"}
}
  return (
    <>
    <h2>{title}</h2>
    <p>Total: £{total}</p>
    <button onClick={()=>deposit()}>Deposit</button>
    <button onClick={()=>withdraw()}>Withdraw</button>
    </>
  )

}






export default PiggyBank;
