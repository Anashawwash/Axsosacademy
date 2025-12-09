import { useState } from "react";


const Box=({list,desc,index,setList})=>{

    const deletE = e =>{
        e.preventDefault()
        let newArr = list.splice(index,1)
        setList(list.filter((idx) => idx !== index))
    }

    return (<>
    <div className={"mt-10"}>

        <form action="" onSubmit={(e) => {deletE(e)}}  className={"flex justify-between"} >
        <h1 className={"text-3xl"}> {desc}</h1>
        <button className={"bg-black text-3xl w-35 h-12 text-white rounded-sm"}>Delete</button>
        </form>
    </div>
    </>)
}

export default Box