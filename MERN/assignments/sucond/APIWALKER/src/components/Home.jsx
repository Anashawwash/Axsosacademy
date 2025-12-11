import { useState } from "react";

const Home =()=>{
const [welker,setWelker]=useState("");
const [id,setId] = useState()


    const changeV= (e,type) =>{
        type == 1 ?  setWelker(e.target.value) : setId(e.target.value)

    }
    const Main= e =>{
        e.preventDefault(); 
    }

return (<>

    <div className={"mt-20  w-200 mx-auto"}>
        <form action="" onSubmit={(e) => (Main(e))} className={"flex justify-around"}>
            <div className={"flex justify-between"}>
            <h1>Search For:</h1>
            <select className={"bg-gray-300 ml-5 border-2"} onChange={(e)=> changeV(e,1)}>
                <option value="Pepole"> Pepole</option>
                <option value="planets"> planets</option>
            </select>
            </div>
            <div className={"flex justify-between"}>
            <h1>ID:</h1>
            <input type="text" onChange={(e)=> changeV(e,2)} className={"bg-gray-300 ml-5 border-2"} />
            </div>
            <div>
                <button className={"border-2 w-30 bg-blue-500 h-8 rounded-md"}>Search</button>
            </div>
        </form>
    </div>
    </>)
}

export default Home
