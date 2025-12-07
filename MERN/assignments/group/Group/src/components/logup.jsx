import React ,{use, useState} from "react";

const Logup = () =>{
    const[name,setName] = useState("")
    const[email,setEmail] = useState("")
    const[error,setError] = useState("")
    const logUpVal = (e,type) =>{
        if (type === 1){
            if (e.target.value.length <= 2){
                setError("this should be more than 2")
            }else{
                setName(e.target.value)
                setError("")

            }
        }
        else{
            if (e.target.value.length <= 2){
                setError("this should be more than 2")
            }else{
                setEmail(e.target.value)
                setError("")
            }
        }
    }

    return(<>
    <h1 className="">LogUp form</h1>
    <h1>Name </h1>
    <input type="text" onChange={(e)=>logUpVal(e,1)}/>
    {error && (<h1>Error: {error} </h1>)}
    <h1>Email </h1>
    <input type="text" onChange={(e)=>logUpVal(e,0)} />
    {error && (<h1>Error: {error} </h1>)}
    </>)
}
export default Logup