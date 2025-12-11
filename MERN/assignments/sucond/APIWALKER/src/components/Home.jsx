import axios from "axios";
import { useState } from "react";

const Home = () => {
    const [welker, setWelker] = useState("people");
    const [id, setId] = useState()
    const [res, setRes] = useState([])
    const [error, setError] = useState("")

    

    const changeV = async (e, type) => {
        if(type == 1) setWelker(e.target.value)
        if(type === 2) setId(e.target.value)

        if (type === 3) {
            e.preventDefault();
            console.log(id)
            const response = await axios.get(`https://swapi.dev/api/${welker}/${id}`)
            setRes(response
                .data
            )
        }
    }

    return (<>
        <div className={"mt-20  w-200 mx-auto"}>
            <form action="" onSubmit={(e) => (changeV(e, 3))} className={"flex justify-around"}>
                <div className={"flex items-center justify-between"}>
                    <h1>Search For:</h1>
                    <select className={"rounded-xl w-30 bg-gray-300 ml-5 border-2"} onChange={(e) => changeV(e, 1)}>
                        <option value="people"> Pepole</option>
                        <option value="planets"> planets</option>
                    </select>
                </div>
                <div className={"flex items-center justify-between"}>
                    <h1 className={""}>ID:</h1>
                    <input type="text" onChange={(e) => changeV(e, 2)} className={"rounded-xl bg-gray-300 ml-5 border-2"} />
                </div>
                <div>
                    <button className={"border-2 w-30 bg-blue-500 h-8 text-white hover:bg-blue-800 cursor-pointer border-black rounded-md"}>Search</button>
                </div>
            </form>
                {error && <h1> {error} </h1>}
                {res &&
                <div className={"mt-10 pl-10"}>
                <h1 className={"text-4xl"}> {res.name}</h1>
                <h1>Height : {res.height}</h1> 
                <h1>Mass: {res.mass}</h1>
                <h1>Hair Color : {res.hair_color}</h1>
                <h1>Skin Color : {res.skin_color}</h1> 
            </div>
                }
                
        </div>

    </>)
}

export default Home
