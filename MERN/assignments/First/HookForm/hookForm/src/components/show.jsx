import { useState } from "react";

const Show =({label,data}) => {


    return (<>

        <div className={"justify-between flex w-130 mx-auto text-3xl"}>
            <h1>{label}</h1>
            <h1>{data}</h1> 
        </div>
        
        
    
    </>)

}

export default Show