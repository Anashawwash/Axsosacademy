import { useState } from "react";
import Box from "./box";


const Create=({list,setList})=>{
    const[desc,setDesc] = useState("")
    const addValue =e=>{
        e.preventDefault()
        setList([...list,desc])        
    }

    return (<>
    <div className={"mt-10 w-100 mx-auto h-100"}>
        <form onSubmit={(e)=>{addValue(e)}} > 
            <h1 className={"text-3xl"}>the description for the task  </h1>
            <input type="text" onChange={(e)=>{setDesc(e.target.value)}} className={"border-2 h-12 w-90 my-5 "} />

            <button className={"border-2 text-4xl rounded-2xl w-30 bg-blue-500"}>Add</button>
        </form>
          {list.map((desc,key) => (
            <Box list={list} setList={setList} index={key} desc={desc} />
          ))}
    
    </div>
    
    </>)
}

export default Create
