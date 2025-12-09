import { useEffect, useState } from "react";


const First=()=>{
    const [pokemon,setPokemon] = useState([])

    useEffect( ()=>{
        fetch('https://pokeapi.co/api/v2/pokemon/ditto')
        .then(response =>response.json())
        .then(response =>setPokemon(pokemon))

    },[]);

    return (<>

    <div>
        <h1>this is my frist API</h1>
    </div>
    <ul>


            
        {pokemon && (
        
        <ul>
          <li>Name: {pokemon.name}</li>
          <li>Height: {pokemon.height}</li>
          <li>Weight: {pokemon.weight}</li>
        </ul>
      )}

    </ul>

    </>)


}

export default First
