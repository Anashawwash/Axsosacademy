import { useParams } from "react-router-dom"

const  Say = () =>{
    const{world} = useParams();
    const isNumber = isNaN(world);

    
    return (<>
        <h1 className={"text-center text-5xl mt-10"}>
        {isNumber ? "the world is :" : "the Number is:"}                
        {world} </h1>
    </>)
}
export default Say