import { useState , useEffect } from "react";
import axios from "axios";

const CreatePro = () =>{
    const [product,setProduct] = useState([])
    

    useEffect(() => {
    axios.get("http://127.0.0.1:8000/product")
      .then((res) => setProduct(res.data))
      .catch((error) => console.error('Error fetching data:', error));
    }, []); 

    return (<>
        <ul>

     {product.map((pro) => (
          <li key={pro._id}>
            {pro.title} - ${pro.price}
          </li>
      ))}
    
        </ul>
    </>)
}

export default CreatePro