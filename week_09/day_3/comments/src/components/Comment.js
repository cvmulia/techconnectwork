import React from 'react';

const Comment = ({author, children}) =>{

  return(
    <>
    <p>{author+":"}</p>
    <h4>{'"'+children+'"'}</h4>
    </>
  )
}

export default Comment;
