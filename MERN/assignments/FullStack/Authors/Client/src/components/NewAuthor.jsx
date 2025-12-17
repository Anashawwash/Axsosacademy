import { Link } from "react-router-dom"

const NewAuthor =() =>{

    return (<>
        <Link to="/" className={"m-5 text-blue-500 text-3xl hover:underline"} >Home</Link>
        <h1 className={"m-5 text-blue-500 text-3xl "}>Add a new Author :</h1>
        <div className={"border-2 w-100 m-5 h-50"}>
            <form action="">
                <h1 className={"text-2xl m-4"}>Name:</h1>
                <input  type="text" className={"m-4 border-2"} />
            </form>

        </div>
    </>)
}

export default NewAuthor