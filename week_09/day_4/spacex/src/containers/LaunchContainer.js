import React, {useState, useEffect} from 'react';
import LaunchDetail from '../components/LaunchDetail'
import LaunchSelector from '../components/LaunchSelector'

const LaunchContainer = () => {
  // create state for launch
  const [launch, setLaunch] = useState({});

  // create state for a  launch id we wish to select
  const [selectedLaunchId, setSelectedLaunchId] = useState (0);

  // loading comments
  const [loaded, setLoaded] = useState(false);

  useEffect(() => {getLaunch()}, [selectedLaunchId])

  // write a function that will increment the selected launch id
  const incrementSelectedLaunch = () => {
    if (selectedLaunchId < 90){
    setSelectedLaunchId(selectedLaunchId + 1)}
  }

  // write a function that will decrement the selected launch id
  const decrementSelectedLaunch = () => {
    if (selectedLaunchId>0){
    setSelectedLaunchId(selectedLaunchId - 1)}
  }

  //  write a function to make a fetch to the API
  // to get launch data about an individual launch
  const getLaunch = () => {
    console.log("getting launch info about a launch num" + selectedLaunchId);
    fetch(`https://api.spacexdata.com/v3/launches/${selectedLaunchId}`)
    .then(response => response.json())
    .then(data => setLaunch(data))
    .then(() => setLoaded(true))
  }

  return (
    <>
      <LaunchSelector
        onSelectedIncrementLaunch = {() => incrementSelectedLaunch()}
        onSelectedDecrementLaunch = {() => decrementSelectedLaunch()}
      />
      <LaunchDetail
        launch = {launch}
        loaded = {loaded}
      />
    </>
  )
}



export default LaunchContainer;
