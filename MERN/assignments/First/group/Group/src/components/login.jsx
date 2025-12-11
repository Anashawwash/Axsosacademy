import React, { useState } from "react";
import TailwindApp from 'tailwind/dist/TailwindApp'


const Login = ()=>{
    const [name,setName] = useState("")
    const [eamil,setEmail] = useState("")
    const [error,setError] = useState("")

    const valChange = (e ,type)=>{
        if (type === 1){
            if (e.target.value.length <= 2 ){
                setError("this should be more than tow")
            }
            else{
                setError("")
                setName(e.target.value)
            }
        }
        else{
            if(e.target.value.length <= 2 ){
                setError("this should be more than tow")
            }
            else{
                setError("")
                setEmail(e.target.value)
            }
        }
    }
    return (<>
        <h1>Login Form</h1>
        <h1>User name: {name}</h1>
        <input type="text" onChange={(e) => valChange(e,1)} />
        {error && (<h1> Error: {error}</h1>)}
        <h1>Email : {eamil}</h1>
        {error && (<h1> Error: {error}</h1>)}
        <input type="text" onChange={(e) => valChange(e,0)} />
    </>)
}
export default Login