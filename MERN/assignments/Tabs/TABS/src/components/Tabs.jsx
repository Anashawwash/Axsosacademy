import { useState } from "react";

const Tabs = props =>{
    const [one,setOne] = useState(false)
    const [two,setTwo] = useState(false)
    const [three,setThree] = useState(false)
    const chaneContant = (e,type)=> {
        document.getElementById("one").classList.remove("bg-black");
        document.getElementById("two").classList.remove("bg-black");
        document.getElementById("three").classList.remove("bg-black");
        document.getElementById("one").classList.remove("text-white");
        document.getElementById("two").classList.remove("text-white");
        document.getElementById("three").classList.remove("text-white");

        e.target.classList.add("bg-black");
        e.target.classList.add("text-white");

        if (type === 1){
            setOne(true)
            setTwo(false)
            setThree(false)
        }else if (type === 2){
            setOne(false)
            setTwo(true)
            setThree(false)
        }else if (type === 3){
            setOne(false)
            setTwo(false)
            setThree(true)
        }
    }


    return (<>
    <div className={"mb-5  mt-10 flex  w-150 mx-auto "}>
        <button id="one" onClick={(e)=>chaneContant(e,1)} className={"text-2xl text- mr-3 border-2 w-40 hover:bg-black hover:text-white"}>Tab 1</button>
        <button id="two" onClick={(e)=>chaneContant(e,2)} className={"text-2xl mr-3 border-2 w-40 hover:bg-black hover:text-white"}>Tab 2</button>
        <button id="three" onClick={(e)=>chaneContant(e,3)} className={"text-2xl mr-3 border-2 w-40 hover:bg-black hover:text-white"}>Tab 3</button>
    </div>
    <div className={"border-2 h-100 w-150 mx-auto"}> 
        {
            one ?
            <p>Tab 1 content is showing here</p> :
            <p>Noooooooo</p>
        
        }
        {two && (<p>Tab 2 content is showing here</p>)}
        {three && (<p>Tab 3 content is showing here</p>)}
    </div>
    </>)
}
export default Tabs