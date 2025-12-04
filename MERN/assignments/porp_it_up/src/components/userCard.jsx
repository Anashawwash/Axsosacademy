import React from "react";


const Usercard = (props)=>{
    const {firstName , lastName,age,color} = props
    return (
        <>
        <h1> my Name is {firstName} {lastName}  and i am {age} old my color is {color}</h1>
        </>
    )

}

export default Usercard