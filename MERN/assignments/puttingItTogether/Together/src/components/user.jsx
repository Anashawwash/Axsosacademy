import React ,{useState} from "react";


const User=props=>{
    const {name , lastName , age , color} = props
    const [all, setAll] = useState(parseInt(age));
    const count=()=>{
        setAll(all + 1)
    }

    return (<>

        <h1 className={"text-5xl text-center"}> {name} , {lastName}</h1>
        <h1 className={"text-5xl text-center"}> Age :{all}</h1>
        <h1 className={"text-5xl text-center"}> Color : {color}</h1>
        <div className={"flex justify-center pt-10"}>

        <button className={"hover:bg-blue-600 text-5xl item-center border-2"} onClick={()=> count()}> just click Me</button>
        </div>

    </>)
}

export default User