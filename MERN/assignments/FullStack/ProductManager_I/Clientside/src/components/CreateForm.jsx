import axios from "axios";
import { useState } from "react";

const CreateForm = () => {
    const [mes,setMes] = useState("")
    const [form, setForm] = useState(
        {
            title: "",
            price: 0,
            description: "",
        })

        const titleCh = e=>{
            setForm({...form,title:e.target.value})
        }

        const priceCh = e=>{
            setForm({...form,price:e.target.value})
        }

        const desCh = e=>{
            setForm({...form,description:e.target.value})
        }
        const CreateOne = e=>{
            e.preventDefault()
            axios.post("http://127.0.0.1:8000/product",form)
            .then(res => {
                setMes(res.mes);
            })
            .catch(err =>{
                setMes("the is an error ",err);
            })

            setForm({...form,price:0,
                title:"",
                description:"",
            })

        }

    return (<>
        <form action="" onSubmit={(e)=>CreateOne(e)}>
            <div>
                <h1>Title</h1>
                <input defaultValue={form.title} onChange={e=> {titleCh(e)}} type="text" />
            </div>
            <div>
                <h1>Price</h1>
                <input type="text" defaultValue={form.price} onChange={e=>{priceCh(e)}} />
            </div>
            <div>
                <h1>Description</h1>
                <input defaultValue={form.description} onChange={e=> desCh(e)} type="text" />
            </div>
            <button>Create</button>
        </form>
    </>)
}

export default CreateForm