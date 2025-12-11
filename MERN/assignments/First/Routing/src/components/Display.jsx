import { useParams } from "react-router-dom"

const Display = () =>{
    const {world,text,bg}=useParams();
    return (<>
        <h1 style={{color : text, background : bg }} className={"text-center text-5xl mt-10 "}> the world is : {world} </h1>
        
    </>)
}

export default Display