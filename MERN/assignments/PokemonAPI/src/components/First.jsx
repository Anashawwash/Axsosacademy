import { useEffect, useState } from "react";

const First = () => {
  const [pokemon, setPokemon] = useState(null);

  useEffect(() => {
    fetch("https://pokeapi.co/api/v2/pokemon/ditto")
      .then((res) => res.json())
      .then((data) => setPokemon(data));
  }, []);

  return (
    <>
      <div>
        <h1>This is my first API</h1>
      </div>

      {pokemon && (
        <ul>
          <li>Name: {pokemon.name}</li>
          <li>Height: {pokemon.height}</li>
          <li>Weight: {pokemon.weight}</li>
        </ul>
      )}
    </>
  );
};

export default First;
