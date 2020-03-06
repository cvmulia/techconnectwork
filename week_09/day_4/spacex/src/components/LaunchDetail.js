import React from 'react';

const LaunchDetail = ({launch, loaded}) => {

  if (!loaded){
    return <p><b><i>LOADING........</i></b></p>
  }

  return(
    <>

    <p>Mission Name: <b>{launch.mission_name}</b></p>
    <p>Launch Year: <b>{launch.launch_year}</b></p>

    </>
  )
}

export default LaunchDetail;
