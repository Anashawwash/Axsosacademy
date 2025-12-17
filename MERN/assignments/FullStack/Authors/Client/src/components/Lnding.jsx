import axios from "axios";
import { useEffect } from "react"
import { Link } from "react-router-dom"

const Landing = ()=>{

    useEffect(()=>{
        const getAll= async ()=>{
            try{
                await axios.get("/http://localhost:8000/author") 
            }catch{
                
            }
        }
        getAll();
    },[]);

    return (<>
    <Link to="/author/new" className={"m-5 text-blue-500 text-3xl underline"} >Add An Author </Link>
    <h1 className={"m-5 text-2xl"}>We have quotes by:</h1>
    <table>

    </table>
    </>)
}
export default Landing