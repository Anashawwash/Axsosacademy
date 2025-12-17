import axios from "axios";
import { useState, useEffect } from "react";
import { useParams } from "react-router-dom";
const ShowPro = () => {
    const { id } = useParams();
    const [ pro, setPro ] = useState({})
    const [ err, setErr ] = useState("")

    useEffect(() => {
        const trying = async () => {
            try {
                const res = await axios.get(`http://127.0.0.1:8000/product/${id}`)
                setPro(res.data)
            } catch (err) {
            }
        }
        trying();
    }, []);


    return (<>
        {err && <h1> {err} </h1>}
       <h1>{pro.title}</h1> 
        <h1>{pro.price}</h1>
        <h1>{pro.description}</h1>
    </>)
}

export default ShowPro