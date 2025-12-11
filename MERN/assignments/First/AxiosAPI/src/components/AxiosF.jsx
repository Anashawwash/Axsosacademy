import { useEffect, useState } from "react";
import axios from "axios";

const AxiosF=()=>{
    const[pokemon,setPokemon]=useState([])
    const[error,setError]=useState("")
    
   useEffect(() => {
    axios.get('https://pokeapi.co/api/v2/ability/battle-armor')
        .then(response => setPokemon(response.data.names))
        .catch(() => setError("this is an error"));
    }, []);


    return (<>
    {error && <p>{error}</p> }
    <div className={"mt-20 w-50 mx-auto"}>
        <h1 className={"my-10 border-2 rounded-2xl text-5xl text-center"}>THE API</h1>
    <ul>
      {pokemon.map((obj, index) => (
        <li key={index}>
            Name: {obj.name} <br />
            language: {obj.language.name}
        </li>
    ))}
    </ul>
    </div>
    </>)
}

export default AxiosF;
