import { useState } from "react";


const Login =({label,type,setlabel}) =>{

    return (<>
        <form action="" className={"items-center hover:bg-blue-300 mb-10 p-3 rounded-xl mt-10 border-2 bg-gray-200 flex w-100 space-x-10 mx-auto"}>
            <h1 className={"w-20"}>{label}</h1>
            <input className={"bg-white h-8 border-2"} type={type} onChange={(e)=> {setlabel(e.target.value)}} />
        </form>
    </>)
}
export default Login