import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Login from './components/Login'
import Show from './components/show'

function App() {
  const [fName,setFName] = useState("")
  const [lName,setLName] = useState("")
  const [email,setEmail] = useState("")
  const [passowrd,setPassword] = useState("")
  const [cPassowrd,setCPassword] = useState("")


  return (
    <>
    <div >
    <Login label ="FristName" type="text" setlabel ={setFName}/>
    <Login label ="LastName"  type="text" setlabel ={setLName}/>
    <Login label ="Email" type="text" setlabel ={setEmail}/>
    <Login label ="Password"  type={"password"} setlabel ={setPassword}/>
    <Login label ="Confirm Password"  type={"password"} setlabel ={setCPassword} />
    </div>
    <div className={"w-140 border-2 mx-auto"}>
    <h1 className={"text-center text-4xl"}>Your Form Data</h1>

    </div>
    <Show label="First Name"  data ={fName} />
    <Show label="Last Name"  data ={lName} />
    <Show label="Email"  data ={email} />
    <Show label="Passowrd"  data ={passowrd} />
    <Show label="Confirm Password"  data ={cPassowrd} />

    </>
  )
}

export default App
