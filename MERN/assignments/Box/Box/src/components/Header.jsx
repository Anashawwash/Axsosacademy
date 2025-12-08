import { useState } from "react";

const Header=props =>{
    const [color,setColor] = useState("")
    const setTheColor= e=>{
        setColor(e.target.value)
    }

    const createE = e => {
        e.preventDefault()
        const box = document.getElementById("create")
        const div = document.createElement("div")
        div.style.backgroundColor = color
        div.style.width = "100px"
        div.style.height = "100px"
        div.style.margin = "3px"
        box.appendChild(div)
    }


    return (<>
    <div className={"pt-10 w-150 mx-auto flex justify-between"}>
        <h1 className={"text-3xl"}  >Color </h1>
        <form onSubmit={ (e)=> createE(e) } className={"flex justify-between w-100"}>
        <input className={"border-2"}  onChange={(e) => {setTheColor(e)}} type="text" />
        <button className={"text-3xl"} > Add</button>
        </form>
    </div>
    <div className={"flex flex-wrap"} id="create" > 

    </div>
    </>)
}

export default Header