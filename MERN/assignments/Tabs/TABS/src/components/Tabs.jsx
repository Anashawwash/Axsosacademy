import { useState } from "react";

const Tabs = props =>{
    const chaneContant = (e,type)=> {
        const dive = document.getElementById("main")
        console.log(dive);
        const newp = document.getElementById("con")

        document.getElementById("one").classList.remove("bg-green-500");
        document.getElementById("two").classList.remove("bg-green-500");
        document.getElementById("three").classList.remove("bg-green-500");

        e.target.classList.add("bg-green-500");

        if (type === 1){
            newp.textContent = "Tab 1 content is showing here";
        }
        else if (type === 2){
            newp.textContent = "Tab 2 content is showing here";
        }
        else if (type === 3){
            newp.textContent = "Tab 3 content is showing here";
        }
    }


    return (<>
    <div className={"mb-5  mt-10 flex  w-150 mx-auto "}>
        <button id="one" onClick={(e)=>chaneContant(e,1)} className={"text-2xl text- mr-3 border-2 w-40 hover:bg-black hover:text-white"}>Tab 1</button>
        <button id="two" onClick={(e)=>chaneContant(e,2)} className={"text-2xl mr-3 border-2 w-40 hover:bg-black hover:text-white"}>Tab 2</button>
        <button id="three" onClick={(e)=>chaneContant(e,3)} className={"text-2xl mr-3 border-2 w-40 hover:bg-black hover:text-white"}>Tab 3</button>
    </div>
    <div id="main" className={"border-2 h-100 w-150 mx-auto"}> 
        <p id="con"></p>
    </div>
    </>)
}
export default Tabs