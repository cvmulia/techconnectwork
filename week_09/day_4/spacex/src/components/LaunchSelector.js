import React from 'react';

const LaunchSelector = ({onSelectedIncrementLaunch, onSelectedDecrementLaunch}) => {

  return (
    <>
    <p>This component will
      allow us to select a particular launch</p>

      <button onClick = {onSelectedDecrementLaunch}>Previous Launch Id</button>
      <button onClick = {onSelectedIncrementLaunch}>Next Launch Id</button>

    </>
  )
}


export default LaunchSelector;
