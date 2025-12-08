import { useState } from "react";

const Login =({label,type,setlabel ,length , isConfirm}) =>{
    const [error,setError] = useState("")
    const [errorTwo,setErrorTwo] = useState("")
        const val = e =>{
            if (label === "Confirm Password"){
                isConfirm !== e.target.value ? setErrorTwo(`${label} dos't match the passowrd`)
                :setErrorTwo("") 
            }
            if (e.target.value.length <= length){
                setError(`${label} should be at least ${length} `)
            }else{
                setError("")
                setlabel(e.target.value)
            }
        }


    return (<>
        <form action="" className={"items-center hover:bg-blue-300  p-3 rounded-xl mt-10 border-2 bg-gray-200 flex w-100 space-x-10 mx-auto"}>
            <h1 className={"w-20"}>{label}</h1>
            <input className={"bg-white h-8 border-2"} type={type} onChange={(e)=> {val(e)}} />
        </form>
        <p className={"text-center text-sm text-red-500"}> {error}</p>
        <p className={"text-center text-sm text-red-500"}> {errorTwo}</p>

    </>)
}
export default Login