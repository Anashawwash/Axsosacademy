import axios from "axios";
import { useState } from "react";
import { Link } from "react-router-dom"

const NewAuthor = () => {
    const [author,setAuthor] = useState("")
    const [error,setError] = useState("")
    const ChangeName= e=>{
        setAuthor(e.target.value)
    }
    const create = async e=>{
        e.preventDefault();
        try{
            await axios.psot("/http://localhost:8000/author",author)
        }catch (err){
            console.log(err);
            
        }
    }



    return (<>
        <Link to="/" className={"m-5 text-blue-500 text-3xl hover:underline"} >Home</Link>
        <h1 className={"m-5 text-blue-500 text-3xl "}>Add a new Author :</h1>
        <div className={"border-2 w-100 m-5 h-50"}>
            <form action="" onSubmit={e=>create(e)}>
                <h1 className={"text-2xl m-4"}>Name:</h1>
                <input onChange={e=>ChangeName(e)} type="text" className={"mx-4 border-2"} />
                <div className={"flex justify-between w-50 mt-5 ml-5"}>
                    <button type="button" className={"bg-blue-400 w-20 hover:bg-blue-800 text-2xl rounded-md text-white"}>Cancel</button>
                    <button type="submit" className={"bg-blue-400 w-20 hover:bg-blue-800 text-2xl rounded-md text-white"} >submit</button>
                </div>
            </form>
        </div>
    </>)
}

export default NewAuthor