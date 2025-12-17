import { useState, useEffect } from "react";
import axios from "axios";
import { Link } from "react-router-dom";
const CreatePro = props => {
  const { status } = props
  const [product, setProduct] = useState([])


  useEffect(() => {
    axios.get("http://127.0.0.1:8000/product")
      .then((res) => setProduct(res.data))
      .catch((error) => console.error('Error fetching data:', error));
  }, [status]);

  return (<>
    <ul>
      {product.map((pro, index) => (
        <li key={pro._id}>
          <Link to={`/product/${pro._id}`} >{pro.title} </Link>
        </li>
      ))}
    </ul>
  </>)
}

export default CreatePro