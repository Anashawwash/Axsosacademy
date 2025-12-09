import { useEffect, useState } from "react";


const Home = () =>{
    const [isSubmetted,setIsSubmetted] = useState(false)
    
    const change= (e)=>{
        e.preventDefault();
        setIsSubmetted(!isSubmetted)

    }
        useEffect( ()=>{
        if(isSubmetted){
            const result=async()=>{

              const res=()=>{

              }
               await fetch('https://jsonplaceholder.typicode.com/users')
                .then(response => response.json())
            } 


            console.log(result());
            
        }       

            
        }
        ,[isSubmetted]);



    return (<>
    <form action="" onSubmit={(e)=>{change(e)}}>
        <h1>User Name</h1>
        <input type="text" />

        <h1>Email</h1>
        <input type="" />

        <button> Submit</button>
    </form>


    </>)
}

export default Home

